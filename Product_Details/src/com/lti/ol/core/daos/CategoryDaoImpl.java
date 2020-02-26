/**
 * @Author: Sonali
 * @CreatedOn:21/02/2020
 * @LastUpdate:24/02/2020
 */

package com.lti.ol.core.daos;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.lti.ol.core.entities.Category;
import com.lti.ol.core.entities.Product;
import com.lti.ol.core.exceptions.PrException;

@Repository
public class CategoryDaoImpl implements CategoryDao {

	@PersistenceContext 
	private EntityManager manager;
	
	@Override
	public ArrayList<Category> getCategoryList() throws PrException {
		
		Query qry = manager.createQuery("FROM Category");
		ArrayList<Category> CategoryList = (ArrayList<Category>) qry.getResultList();		
		return CategoryList;	
	}

	@Override
	public Category getCategoryId(int d) throws PrException {
		
		return manager.find(Category.class, d);
	}

}
