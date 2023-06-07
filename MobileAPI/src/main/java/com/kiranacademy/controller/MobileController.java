package com.kiranacademy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kiranacademy.entity.Mobile;
import com.kiranacademy.service.MobileService;

@RestController
public class MobileController {

	@Autowired
	MobileService service;
	
	@RequestMapping("getAllMobiles")
	public List<Mobile> getAllMobiles()
	{
			return service.getAllMobiles();
	}
}
