package com.lti.ol.core.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.lti.ol.core.entities.ProductStock;
import com.lti.ol.core.entities.Retailer;
import com.lti.ol.core.exceptions.PrException;

@Repository
public class ProductStockDaoImpl implements ProductStockDao{

	@PersistenceContext
	private EntityManager manager;

	@Override
	public List<ProductStock> getStockListByRetailerId(int retailerid) throws PrException {
		Retailer retailer = manager.find(Retailer.class, retailerid);
		return retailer.getProductStock();
	}
}
