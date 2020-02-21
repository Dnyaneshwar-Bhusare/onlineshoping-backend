package com.lti.ol.core.daos;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;

import com.lti.ol.core.entities.Product;
import com.lti.ol.core.exceptions.PrException;

@Repository
public class ProductDaoImpl implements ProductDao {

	@PersistenceContext 
	private EntityManager manager;
	
	@Override
	public ArrayList<Product> getProductList() throws PrException {
		Query qry = manager.createQuery("FROM Product");
		ArrayList<Product> productList = (ArrayList<Product>) qry.getResultList();		
		return productList;	
	}

	@Override
	public Product getProductId(int d) throws PrException {
		
		return manager.find(Product.class, d);
	}

	
	
	@org.springframework.transaction.annotation.Transactional(propagation = Propagation.REQUIRED)
	@Override
	public String addProduct(Product product) throws PrException {
		manager.persist(product);
		return "data inserted";
	}
}
