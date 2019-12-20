package com.how2java.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.how2java.service.ProductsService;
import com.how2java.pojo.Products;

// 告诉spring mvc这是一个控制器类
@Controller
@RequestMapping("/products2")
public class ProductsController2 {
	@Autowired
	ProductsService productsService;
	
	@RequestMapping("/list")
	public ModelAndView list() {
		ModelAndView mav1=new ModelAndView();
				
		
		List<Products> cs=productsService.list();
		
		mav1.addObject("cs",cs);
		mav1.setViewName("listproducts2");
		return mav1;
	}

}
