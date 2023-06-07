package com.kiranacademy.dao;

import java.util.Collections;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kiranacademy.entity.Mobile;

@Repository
public class MobileDAO {
	
	@Autowired
	SessionFactory factory;
	
	
	public List<Mobile> getAllMobiles()
	{
		Session session=factory.openSession();
		Criteria criteria=session.createCriteria(Mobile.class);
		
		List<Mobile> list=criteria.list();
		
		Collections.sort(list,new SortOnPrice());
			
		return list;
	}

}
