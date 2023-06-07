package com.kiranacademy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kiranacademy.dao.MobileDAO;
import com.kiranacademy.entity.Mobile;

@Service
public class MobileService 
{
	
	@Autowired
	MobileDAO dao;
	
	public List<Mobile> getAllMobiles()
	{
			return dao.getAllMobiles();
	}
	
}
