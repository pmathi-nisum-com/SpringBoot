package com.spring.basictemplate.controllers;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.basictemplate.beans.Customer_dup;
import com.spring.basictemplate.services.CustomerService;





@Controller
public class RegisterController {
	@Autowired
	private CustomerService customerService;

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView showRegister(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView("register");
		mav.addObject("customer", new Customer_dup());
		return mav;
	}
	@RequestMapping(value = "/success", method = RequestMethod.POST)
	public ModelAndView addUser(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("customer") Customer_dup customer) {
		customerService.saveCustomer(customer);
		return new ModelAndView("regsucc");
}
}