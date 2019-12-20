package com.how2java.mapper;
 
import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.junit.experimental.theories.FromDataPoints;

import com.how2java.pojo.Products;
import com.how2java.util.Page;
 
public interface ProductsMapper {
 
      
    public int add(Products userdao);  
       
      
    public void delete(int id);  
       
      
    public Products get(int id);  
     
      
    public int update(Products userdao);   
       
    public List<Products> list();
    
    public List<Products> list(Page page);
    
    public int total(); 
      
    public int count();


	  
    
    
    
}