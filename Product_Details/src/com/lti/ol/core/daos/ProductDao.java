/**
 * @Author: Dnyaneshwar
 * @CreatedOn:21/02/2020
 * @LastUpdate:24/02/2020
 */

package com.lti.ol.core.daos;

import java.util.ArrayList;

import com.lti.ol.core.entities.Product;
import com.lti.ol.core.exceptions.PrException;

public interface ProductDao {
	
	public ArrayList<Product> getProductList() throws PrException;
	public Product getProductId(int d) throws PrException;
	public String addProduct(Product product) throws PrException;
}
