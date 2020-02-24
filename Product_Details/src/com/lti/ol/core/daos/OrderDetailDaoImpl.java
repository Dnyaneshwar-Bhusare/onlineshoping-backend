package com.lti.ol.core.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.ol.core.entities.OrderDetail;
import com.lti.ol.core.entities.OrderItem;
import com.lti.ol.core.exceptions.PrException;

@Repository
public class OrderDetailDaoImpl implements OrderDetailDao{

	@PersistenceContext
	private EntityManager manager;
	
	@Transactional(propagation=Propagation.REQUIRED)
	@Override
	public boolean buyProduct(OrderDetail order) throws PrException {
		manager.persist(order);
		return true;
	}

	@Override
	public List<OrderItem> getOrderListByUserId(int uid) throws PrException {
		 String q="select e from OrderDetail e join e.orderItem b where e.userId=:uid";
		 Query qq=manager.createQuery(q);
		 qq.setParameter("uid", uid);
		 List<OrderItem> orderitem=qq.getResultList();
		 return orderitem;
	}
}
