package com.lti.ol.core.daos;

import java.util.List;

import com.lti.ol.core.entities.ProductStock;
import com.lti.ol.core.exceptions.PrException;

public interface ProductStockDao {

	public List<ProductStock> getStockListByRetailerId(int retailerId) throws PrException;
}
