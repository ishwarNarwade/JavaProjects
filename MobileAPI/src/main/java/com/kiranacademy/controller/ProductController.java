package com.kiranacademy.controller;

import java.io.File;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.kiranacademy.entity.Category;
import com.kiranacademy.entity.Product;
import com.kiranacademy.entity.ProductInfo;
import com.kiranacademy.service.ProductService;

@RequestMapping("productapi")
@RestController
public class ProductController {

	@Autowired
	ProductService service;
	
	@RequestMapping("allProducts")
	public List<Product> allProducts()
	{
		
		return service.allProducts();
	}
	
	@RequestMapping("viewproduct/{pid}")
    public Product viewproduct(@PathVariable int pid)
	{
		return service.viewproduct(pid);
	}
	
	@RequestMapping("allProductsWithCategory/{pid}")
	public List<ProductInfo> allProductsWithCategory(@PathVariable int pid)
	{
		return service.allProductsWithCategory(pid);
	}
	
	@RequestMapping("deleteProduct/{pid}")
	public Product deleteProduct(@PathVariable int pid)
	{
		return service.deleteProduct(pid);
	}
	
	
}
