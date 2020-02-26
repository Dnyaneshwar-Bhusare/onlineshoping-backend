/**
 * @Author: Sonali
 * @CreatedOn:21/02/2020
 * @LastUpdate:24/02/2020
 */

package com.lti.ol.core.daos;

import java.util.ArrayList;

import com.lti.ol.core.entities.Category;
import com.lti.ol.core.exceptions.PrException;

public interface CategoryDao {

	public ArrayList<Category> getCategoryList() throws PrException;
	public Category getCategoryId(int d) throws PrException;
}
