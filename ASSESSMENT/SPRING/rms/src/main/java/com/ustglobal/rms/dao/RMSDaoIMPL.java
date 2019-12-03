package com.ustglobal.rms.dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.rms.dto.OrderBean;
import com.ustglobal.rms.dto.ProductBean;
import com.ustglobal.rms.dto.RetailerBean;
@Repository
public class RMSDaoIMPL implements RMSDAO{
	final String SELECT_ORDER = "from OrderBean where id=:name";

	
	@PersistenceUnit
	private EntityManagerFactory factory;
	@Override
	public RetailerBean login(int id, String password) {
		String jpql = "from RetailerBean where id=:id and password=:pass";
		EntityManager manager = factory.createEntityManager();

		TypedQuery<RetailerBean> query = manager.createQuery(jpql, RetailerBean.class);

		query.setParameter("id", id);
		query.setParameter("pass", password);
		try {
			RetailerBean bean = query.getSingleResult();
			return bean;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}


	@Override
	public boolean changePassword(int id, String password) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		RetailerBean bean = manager.find(RetailerBean.class, id);
		bean.setPassword(password);
		transaction.commit();
		return true;
	}

	@Override
	public int register(RetailerBean bean) {
		
		
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();

		try {
			manager.persist(bean);
			transaction.commit();
			return bean.getId();
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
	}

	@Override
	public ProductBean searchId(int id) {
		EntityManager manager = factory.createEntityManager();
           try {
		return manager.find(ProductBean.class, id);
           }catch (Exception e) {
        	   return null;
			// TODO: handle exception
		}
	}

	@Override
	public OrderBean DisplayOrder(int id) {
		
		EntityManager manager = factory.createEntityManager();
		TypedQuery< OrderBean> query =  manager.createQuery(SELECT_ORDER, OrderBean.class);
		
		try {
			OrderBean bean = query.getSingleResult();
			return bean;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		

	}


	@Override
	public boolean add(ProductBean pbean, int qty,int rid) {
		
		
		
		ArrayList<ProductBean> product = new ArrayList<ProductBean>();
		product.add(pbean);
		
		RetailerBean rb = new RetailerBean();
//		rb.setName(bean.getName());
//		rb.setEmail(bean.getEmail());
//		rb.setPassword(bean.getPassword());
//		rb.setGender(bean.getGender());
		rb.setProduct(product);
		
		EntityManager manager = factory.createEntityManager();
		System.out.println(qty);
		System.out.println(rid);
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		try {
		ProductBean bean=manager.find(ProductBean.class, pbean.getPid());
		bean.setPqty(pbean.getPqty()-qty);
		System.out.println(pbean.getPqty()-qty);
		transaction.commit();
		return true;
//		try {
//			OrderBean bean2=new OrderBean();
//			bean2.setAmount(pbean.getPrice()*qty);
//			bean2.setPname(pbean.getPname());
//			bean2.setPrice_Per_Unit(pbean.getPrice());
//			return true;
//		}
//		catch (Exception e) {
//		}
//		return true;
		}
		catch (Exception e) {
			transaction.rollback();
			return false;
		}
		
	}

}
