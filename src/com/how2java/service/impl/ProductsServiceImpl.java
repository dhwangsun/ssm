package com.how2java.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.how2java.mapper.ProductsMapper;
import com.how2java.pojo.Products;
import com.how2java.service.ProductsService;
import com.how2java.util.Page;

@Service
public class ProductsServiceImpl  implements ProductsService{
	@Autowired
	ProductsMapper productsMapper;
	
	
	public List<Products> list(){
		return productsMapper.list();
	};
	
	@Override
	public List<Products> list(Page page) {
        // TODO Auto-generated method stub
        return productsMapper.list(page);
    }
 
	@Override
    public int total() {
        return productsMapper.total();
    };

}
