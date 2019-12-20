package com.how2java.service;

import java.util.List;

import com.how2java.pojo.Products;
import com.how2java.util.Page;

public interface ProductsService {

	List<Products> list();
	
	int total();
	
    List<Products> list(Page page);

}
