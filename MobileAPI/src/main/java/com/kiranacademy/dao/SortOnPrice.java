package com.kiranacademy.dao;

import java.util.Comparator;

import com.kiranacademy.entity.Mobile;

public class SortOnPrice implements Comparator<Mobile>
{

	@Override
	public int compare(Mobile mobile1, Mobile mobile2) {
		
		Integer price1=mobile1.price;

		Integer price2=mobile2.price;
		
		if(price1!=price2)
		{
		  return price1.compareTo(price2);
		}
		
		else
		{
			return - mobile1.speed.compareTo(mobile2.speed);
		}
		
		
	}
	
	

}
