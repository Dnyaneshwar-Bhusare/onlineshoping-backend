package com.lti.ol.core.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.ol.core.daos.ProductDao;
import com.lti.ol.core.entities.Product;
import com.lti.ol.core.exceptions.PrException;

@Service
public class ProductServicesImpl implements ProductServices {

	@Autowired
	private ProductDao dao; 
	
	@Override
	public ArrayList<Product> getProductList() throws PrException {
		
		return dao.getProductList();
	}

	@Override
	public String addProduct(Product product) throws PrException {
		dao.addProduct(product);
		return "inserted successfully";
	}

	@Override
	public Product getProductId(int d) throws PrException {
		
		return dao.getProductId(d);
	}
}
