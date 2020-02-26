/**
 * @Author: Sonali and Grishma
 * @CreatedOn:21/02/2020
 * @LastUpdate:24/02/2020
 */

package com.lti.ol.core.daos;

import com.lti.ol.core.entities.CartTable;
import com.lti.ol.core.entities.Product;
import com.lti.ol.core.exceptions.PrException;

public interface CartDao {
	public boolean addToCartTable(CartTable cartTable) throws PrException;
	public CartTable getDetailByUserId(int userId) throws PrException;
}
