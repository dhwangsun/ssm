package com.how2java.mapper;
 
import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.junit.experimental.theories.FromDataPoints;

import com.how2java.pojo.Products;

 
public interface ProductsMapper2 {
 
      
    public int add(Products userdao);  
       
      
    public void delete(int id);  
       
      
    public Products get(int id);  
     
      
    public int update(Products userdao);   
       
    @Select("select * from products")  
    public List<Products> list();
       
      
    public int count();


	  
    
    
    
}