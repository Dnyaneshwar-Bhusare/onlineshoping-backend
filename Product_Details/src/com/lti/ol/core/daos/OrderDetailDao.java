/**
 * @Author: Grishma and Supraja
 * @CreatedOn:21/02/2020
 * @LastUpdate:24/02/2020
 */

package com.lti.ol.core.daos;

import java.util.List;

import com.lti.ol.core.entities.OrderDetail;
import com.lti.ol.core.entities.OrderItem;
import com.lti.ol.core.exceptions.PrException;

public interface OrderDetailDao {

	public boolean buyProduct(OrderDetail order) throws PrException;

	public List<OrderItem> getOrderListByUserId(int uid) throws PrException;
}
