package com.lti.ol.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.ol.core.entities.Product;
import com.lti.ol.core.entities.User;
import com.lti.ol.core.exceptions.PrException;
import com.lti.ol.core.exceptions.UserException;
import com.lti.ol.core.services.ProductServices;
import com.lti.ol.core.services.UserServices;
/*
 * need to do autowiring with the service layar
 */

// http://localhost:8081/SpringMVC130_REST/deptList     //url to identified the project
@RestController  //publish as REST service
@CrossOrigin
public class PrController {
	
	@Autowired                  // to avoid null pointer exception
	private ProductServices services;
	
	@GetMapping(value="/productList", produces="application/json")
	public @ResponseBody List<Product> getProductList(){
		ArrayList<Product> productList=null;
		try {
			productList = services.getProductList();
		} catch (PrException e) {
			e.printStackTrace();
		}
		return productList;
	}
	
//	@RequestMapping(name="/deptList", produces="application/json", method=RequestMethod.GET)
//	public ArrayList<Product> getProductList(){
//		ArrayList<Product> ProductList=null;
//		try {
//			ProductList = services.getProductList();
//		} catch (PrException e) {
//			e.printStackTrace();
//		}
//		return ProductList;
//	}
	
	
	//insert data in the product_details we use postMapping 
	//this method receive json as input 
	@PostMapping(value="/addProduct",consumes="application/json")
	public void getProductList(@RequestBody Product product){
		System.out.println(product);
		try {
			services.addProduct(product);
		} catch (PrException e) {
			e.printStackTrace();
		}
	}
	
	
	//put is used for fetching the data from table
	@PutMapping(value="/fetchProduct", consumes="application/json")
	public @ResponseBody Product getProductId(@RequestBody int ProductId) throws PrException{
		return services.getProductId(ProductId);
	}
	
	@Autowired                  // to avoid null pointer exception
	private UserServices services1;

	@GetMapping(value="/UserList", produces="application/json")
	public @ResponseBody List<User> getUserList(){
		ArrayList<User> userList=null;
			try {
				userList = services1.getUserList();
			} catch (UserException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return userList;
	}
	
	
	
	/*@RequestMapping(name="/deptList", produces="application/json", method=RequestMethod.GET)
	public ArrayList<Department> getDeptList(){
		ArrayList<Department> deptList=null;
		try {
			deptList = services.getDeptList();
		} catch (HrException e) {
			e.printStackTrace();
		}
		return deptList;
	}*/
	
	
	//insert data in the dept we use postMapping 
	//this method receive json as input 
	
	@PostMapping(value="/addUser",consumes="application/json")
	public void getUserList(@RequestBody User user) throws UserException{
		System.out.println(user);
		try {
			services1.createNewUser(user);
		} catch (UserException e) {
			e.printStackTrace();
		}
	}
	
	//put is used for fetching the data from table
	@PutMapping(value="/fetchUser", consumes="application/json")
	public @ResponseBody User getUserId(@RequestBody int id ) throws UserException{
		return services1.getUserId(id);
	}
	
	/*@GetMapping(value="/fetch", produces="application/json")
	public @ResponseBody User getUserId(@RequestParam("id") int id ) throws UserException{
		return services.getUserId(id);
	}*/
}
