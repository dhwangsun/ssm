package com.how2java.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.how2java.pojo.Category;
import com.how2java.service.CategoryService;
import com.how2java.service.UserDaoService;
import com.how2java.pojo.UserDao;

// 告诉spring mvc这是一个控制器类
@Controller
@RequestMapping("")
public class CategoryController {
	@Autowired
	CategoryService categoryService;
	
	
	@RequestMapping("listCategory")
	public ModelAndView listCategory(){
		ModelAndView mav = new ModelAndView();
		System.out.println("这是在输出Category");
		System.out.println(mav);
		List<Category> cs= categoryService.list();
		System.out.println("这是在输出Category---------");
		// 放入转发参数
		mav.addObject("cs", cs);
		// 放入jsp路径
		mav.setViewName("listCategory");
		return mav;
	}
	
	@Autowired
	UserDaoService userdaoService;
	
	@RequestMapping("listUsers")
	public ModelAndView listUsers() {
		ModelAndView mav1=new ModelAndView();
		System.out.println("这是在输出User");
		List<UserDao> cs1=userdaoService.list();
		System.out.println("这是在输出User-----------");
		mav1.addObject("cs1",cs1);
		mav1.setViewName("listUsers");
		return mav1;
	}

}
