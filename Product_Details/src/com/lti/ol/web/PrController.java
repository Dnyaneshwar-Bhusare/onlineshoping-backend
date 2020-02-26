/**
 * @Author: Dnyaneshwar, Sonali, Grishma, Supraja
 * @CreatedOn:21/02/2020
 * @LastUpdate:24/02/2020
 */

package com.lti.ol.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.ol.core.entities.Cart;
import com.lti.ol.core.entities.CartItem;
import com.lti.ol.core.entities.CartTable;
import com.lti.ol.core.entities.Category;
import com.lti.ol.core.entities.OrderDetail;
import com.lti.ol.core.entities.OrderItem;
import com.lti.ol.core.entities.Product;
import com.lti.ol.core.entities.ProductStock;
import com.lti.ol.core.entities.User;
import com.lti.ol.core.entities.WorkingUser;
import com.lti.ol.core.exceptions.PrException;
import com.lti.ol.core.services.UserService;
/*
 * need to do autowiring with the service layer
 */

// http://localhost:8989/OnlineShopping/****     //url to identified the project
@RestController // publish as REST service
@CrossOrigin
public class PrController {

	@Autowired
	private UserService userServices;

	// Product Table

	@GetMapping(value = "/productList", produces = "application/json")
	public @ResponseBody List<Product> getProductList() throws PrException {
		ArrayList<Product> productList = null;
		productList = userServices.getProductList();
		return productList;
	}

	// insert data in the product_details we use postMapping
	// this method receive json as input
	@PostMapping(value = "/addProduct", consumes = "application/json")
	public void getProductList(@RequestBody Product product) throws PrException {
		System.out.println(product);
		userServices.addProduct(product);
	}

	// put is used for fetching the data from table
	@PutMapping(value = "/fetchProduct", consumes = "application/json")
	public @ResponseBody Product getProductId(@RequestBody int ProductId) throws PrException {
		return userServices.getProductId(ProductId);
	}

	// User Table

	@GetMapping(value = "/userList", produces = "application/json")
	public @ResponseBody List<User> getUserList() throws PrException {
		ArrayList<User> userList = null;
		userList = userServices.getUserList();
		return userList;
	}

	@PostMapping(value = "/addUser", consumes = "application/json")
	public void getUserList(@RequestBody User user) throws PrException {
		System.out.println(user);
		userServices.createNewUser(user);
	}

	@PutMapping(value = "/fetchUser", consumes = "application/json")
	public @ResponseBody User getUserId(@RequestBody int id) throws PrException {
		return userServices.getUserId(id);
	}

	/*
	 * @GetMapping(value="/fetch", produces="application/json")
	 * public @ResponseBody User getUserId(@RequestParam("id") int id ) throws
	 * UserException{ return services.getUserId(id); }
	 */

	// Category Table

	@GetMapping(value = "/categoryList", produces = "application/json")
	public @ResponseBody List<Category> getCategoryList() throws PrException {
		ArrayList<Category> categoryList = null;
		categoryList = userServices.getCategoryList();
		return categoryList;
	}

	@PutMapping(value = "/fetchCategory", consumes = "application/json")
	public @ResponseBody Category getCategoryId(@RequestBody int id) throws PrException {
		return userServices.getCategoryId(id);
	}

	// Cart Table

		@PostMapping(value = "/addCartTable", consumes = "application/json")
		public void addToCartTable(@RequestBody CartTable cartTable) throws PrException {
			System.out.println(cartTable);
			userServices.addToCartTable(cartTable);
		}

		@PutMapping(value = "/fetchCartTableByUserId", consumes = "application/json")
		public @ResponseBody CartTable getDetailByUserId(@RequestBody int userId) throws PrException {
			return userServices.getDetailByUserId(userId);
		}

	/*// CartItem Table

	@GetMapping(value = "/fetchCartItemListByCartId", produces = "application/json")
	public @ResponseBody List<CartItem> getCartItemListByCartId(@RequestParam("id") int cartId) throws PrException {
		List<CartItem> cartItemList = userServices.getCartItemListByCartId(cartId);
		System.out.println(cartItemList);
		return cartItemList;
	}

	@PostMapping(value = "/addCartItemList", consumes = "application/json")
	public void addCartItem(@RequestBody CartItem cartItem) throws PrException {
		System.out.println(cartItem);
		userServices.addCartItem(cartItem);
	}

	@GetMapping(value = "/stockList", produces = "application/json")
	public @ResponseBody List<ProductStock> getStockListByRetailerId(@RequestParam("id") int retailerId)
			throws PrException {
		List<ProductStock> stockList = userServices.getStockListByRetailerId(retailerId);
		System.out.println(stockList);
		return stockList;
	}
*/
	// Order Detail
	
	@PostMapping(value = "/buyProduct", consumes = "application/json")
	public void buyProduct(@RequestBody OrderDetail order) throws PrException {
		System.out.println(order);
		userServices.buyProduct(order);
	}

	@GetMapping(value = "/fetchOrder/{userId}", produces = "application/json")
	public @ResponseBody List<OrderItem> getOrderListByUserId(@PathVariable("userId") int uid) throws PrException {
		System.out.println(uid);
		return userServices.getOrderListByUserId(uid);
	}

	//Login-Signup
	
	@PostMapping(value="/login",consumes="application/json")
	public @ResponseBody List<WorkingUser> login(@RequestBody WorkingUser login) throws PrException{
		return userServices.login(login);
	}
	
	@PostMapping(value="/signup",consumes="application/json")
	public @ResponseBody void signup(@RequestBody WorkingUser login) throws PrException{
		boolean b = userServices.signup(login);
	}
}
