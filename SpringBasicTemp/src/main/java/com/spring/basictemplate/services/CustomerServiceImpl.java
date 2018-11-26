package com.spring.basictemplate.services;

import org.springframework.beans.factory.annotation.Autowired;


import com.spring.basictemplate.beans.Customer_dup;
import com.spring.basictemplate.dao.CustomerDao;

public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerDao customerDao;
	
	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao=customerDao;
	}
	@Override
	public void saveCustomer(Customer_dup customer) {
		customerDao.saveCustomer(customer);

	}

}
