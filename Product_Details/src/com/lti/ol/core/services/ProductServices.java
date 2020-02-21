package com.lti.ol.core.services;

import java.util.ArrayList;

import com.lti.ol.core.entities.Product;
import com.lti.ol.core.exceptions.PrException;

public interface ProductServices {

	public ArrayList<Product> getProductList() throws PrException;
	public Product getProductId(int d) throws PrException;
	public String addProduct(Product product) throws PrException;
}
