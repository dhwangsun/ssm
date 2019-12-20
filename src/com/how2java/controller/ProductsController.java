package com.how2java.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.how2java.service.ProductsService;
import com.how2java.util.Page;
import com.how2java.pojo.Products;

// 告诉spring mvc这是一个控制器类
@Controller
@RequestMapping("/products")
public class ProductsController {
	@Autowired
	ProductsService productsService;
	
	@RequestMapping("/list")
	public ModelAndView list(Page page) {
		ModelAndView mav1=new ModelAndView();
		
		int total=productsService.total();
		page.caculateLast(total);
		
		if (page.getStart()<0)
		{
			page.setStart(0);
		}
		if(page.getStart()>total) {
			page.setStart(total-total%page.getCount());
			
		}else if(page.getStart()==total) {
			page.setStart(total-5);
			
		}
		
		
		List<Products> cs=productsService.list(page);
		
		mav1.addObject("cs",cs);
		mav1.setViewName("listproducts");
		return mav1;
	}

}
