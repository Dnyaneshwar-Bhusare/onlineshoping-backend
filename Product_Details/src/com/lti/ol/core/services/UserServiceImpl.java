/**
 * @Author:  Dnyaneshwar, Sonali, Grishma, Supraja
 * @CreatedOn:21/02/2020
 * @LastUpdate:24/02/2020
 */

package com.lti.ol.core.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.ol.core.daos.CartDao;
import com.lti.ol.core.daos.CartItemDao;
import com.lti.ol.core.daos.CategoryDao;
import com.lti.ol.core.daos.LoginDao;
import com.lti.ol.core.daos.OrderDetailDao;
import com.lti.ol.core.daos.ProductDao;
import com.lti.ol.core.daos.ProductStockDao;
import com.lti.ol.core.daos.UserDao;
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

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao; 
	
	@Autowired
	private ProductDao productDao; 
	
	@Autowired
	private CategoryDao categoryDao;
	
	@Autowired
	private CartDao cartDao;
	
	@Autowired
	private CartItemDao cartItemDao;
	
	@Autowired
	private ProductStockDao productStockDao;
	
	@Autowired
	private OrderDetailDao orderDetailDao;
	
	@Autowired
	private LoginDao loginDao;
	
	//User
	@Override
	public ArrayList<User> getUserList() throws PrException {
		return userDao.getUserList();
	}
	
	@Transactional(propagation=Propagation.REQUIRES_NEW)
	@Override
	public boolean createNewUser(User user) throws PrException {
		return userDao.insertnewuser(user);
	}
	
	@Override
	public User getUserId(int i) throws PrException {
		return userDao.getUserId(i);
	}
	
	//Product
	@Override
	public ArrayList<Product> getProductList() throws PrException {
		return productDao.getProductList();
	}

	@Override
	public String addProduct(Product product) throws PrException {
		productDao.addProduct(product);
		return "inserted successfully";
	}

	@Override
	public Product getProductId(int d) throws PrException {
		return productDao.getProductId(d);
	}
	
	//Category
	@Override
	public ArrayList<Category> getCategoryList() throws PrException {
		return categoryDao.getCategoryList();
	}

	@Override
	public Category getCategoryId(int d) throws PrException {
		return categoryDao.getCategoryId(d);
	}
	
	//Cart
		@Override
		public boolean addToCartTable(CartTable cartTable) throws PrException {
			return cartDao.addToCartTable(cartTable);
		}
		
		@Override
		public CartTable getDetailByUserId(int userId) throws PrException {
			return cartDao.getDetailByUserId(userId);
		}
	
	/*//CartItem
	@Override
	public List<CartItem> getCartItemListByCartId(int CartId) throws PrException {
		return cartItemDao.getCartItemListByCartId(CartId);
	}

	@Override
	public boolean addCartItem(CartItem cartItem) throws PrException {
		return cartItemDao.addCartItem(cartItem);
	}
*/
	//ProductStock
	@Override
	public List<ProductStock> getStockListByRetailerId(int retailerId) throws PrException {
		return productStockDao.getStockListByRetailerId(retailerId);
	}

	@Override
	public boolean buyProduct(OrderDetail order) throws PrException {
		// TODO Auto-generated method stub
		return orderDetailDao.buyProduct(order);
	}

	@Override
	public List<OrderItem> getOrderListByUserId(int uid) throws PrException {
		// TODO Auto-generated method stub
		return orderDetailDao.getOrderListByUserId(uid);

	}

	@Override
	public List<WorkingUser> login(WorkingUser login) throws PrException {
		// TODO Auto-generated method stub
		List<WorkingUser> login1 = loginDao.login(login);
		return login1;
	}

	@Override
	public boolean signup(WorkingUser login) throws PrException {
		// TODO Auto-generated method stub
		return loginDao.signup(login);
	}
}

