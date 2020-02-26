/**
 * @Author: Sonali, Grishma, Supraja, Dnyaneshwar 
 * @CreatedOn:21/02/2020
 * @LastUpdate:24/02/2020
 */

package com.lti.ol.core.services;

import java.util.ArrayList;
import java.util.List;

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

public interface UserService {

	//User
	public ArrayList<User> getUserList() throws PrException;
	public User getUserId(int i) throws PrException;
	public boolean createNewUser(User user) throws PrException;
	
	//Product
	public ArrayList<Product> getProductList() throws PrException;
	public Product getProductId(int d) throws PrException;
	public String addProduct(Product product) throws PrException;
	
	//Category
	public ArrayList<Category> getCategoryList() throws PrException;
	public Category getCategoryId(int d) throws PrException;
	
	//CartTable
	public boolean addToCartTable(CartTable cartTable) throws PrException;
	public CartTable getDetailByUserId(int userId) throws PrException;
	
	/*//CartItem
	public List<CartItem> getCartItemListByCartId(int CartId) throws PrException;
	public boolean addCartItem(CartItem cartItem) throws PrException;
*/
	//ProductStock
	public List<ProductStock> getStockListByRetailerId(int retailerId) throws PrException;
	
	//Order Detail
	public boolean buyProduct(OrderDetail order) throws PrException;
	public List<OrderItem> getOrderListByUserId(int uid) throws PrException;
	
	// Login-Signup
	public List<WorkingUser> login(WorkingUser login) throws PrException;
	public boolean signup(WorkingUser login) throws PrException;
	
	
}
