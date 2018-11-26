package com.spring.basictemplate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.spring.basictemplate.beans.Customer_dup;

public class CustomerDaoImpl implements CustomerDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory=sessionFactory;
		}
	@Override
	public void saveCustomer(Customer_dup customer) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
//		if(customer!=null) {
//			try {
				session.save(customer);
				tx.commit();
				session.close();
//			}catch(Exception e) {
//				tx.rollback();
//				session.close();
//				e.printStackTrace();
//			}
//		}

	}

//	@Override
//	public Customer loginCustomer(Customer customer) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
