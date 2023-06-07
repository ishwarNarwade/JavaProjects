package com.kiranacademy.controller;

import java.util.List;

import javax.websocket.server.PathParam;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kiranacademy.entity.Category;
import com.kiranacademy.entity.ObjectNotFoundException;

import com.kiranacademy.service.CategoryService;

@RestController
@RequestMapping("categoryapi")
public class CategoryController {

	@Autowired
	CategoryService service;
	
	// Controller gives Category object to Service
	// Service gives same Category object to DAO class
	// DAO class will add that category object in Database
	
    @PostMapping("saveCategory")
	public Category saveCategory(@RequestBody Category category)
	{
    	System.out.println(category);
    	
    	service.saveCategory(category);
    	    	
		return category;
		
		// To create JSON String , Spring uses getter methods
		
	}
    
    @RequestMapping("getCategory/{cid}")
    public Category getCategory(@PathVariable int cid)
    {
    	   Category category =service.getCategory(cid);
    	   
    	   if(category==null)
    	   {
    		   throw new ObjectNotFoundException("No record found with cid " + cid);
    		   
    		   // raising exception using throw keyword
    	   }
    	   else
    	   {
    		   return category;
    	   }
    }

    // {cid:2,name:"fashion"} is sent by client(javascript/postman)
    
    @PutMapping("updateCategory")
	public Category updateCategory(@RequestBody Category category)
    {
    	return service.updateCategory(category);
    }
   
    
    @RequestMapping("deleteCategory/{cid}")
    public Category deleteCategory(@PathVariable int cid)
    {
    	   return service.deleteCategory(cid);
    }


    @RequestMapping("getAllCategory")
    public List<Category> getAllCategory()
    {
    	return service.getAllCategory();
    }
}
