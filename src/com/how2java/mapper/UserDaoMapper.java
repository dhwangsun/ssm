package com.how2java.mapper;
 
import java.util.List;

import com.how2java.pojo.UserDao;
 
public interface UserDaoMapper {
 
      
    public int add(UserDao userdao);  
       
      
    public void delete(int id);  
       
      
    public UserDao get(int id);  
     
      
    public int update(UserDao userdao);   
       
      
    public List<UserDao> list();
    
      
    public int count();  
    
    
    
}