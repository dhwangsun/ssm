package com.how2java.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.how2java.mapper.ProductsMapper2;
import com.how2java.pojo.Products;
import com.how2java.service.ProductsService2;


@Service
public class ProductsServiceImpl2  implements ProductsService2{
	@Autowired
	ProductsMapper2 productsMapper;
	
	
	public List<Products> list(){
		return productsMapper.list();
	};
		
}
