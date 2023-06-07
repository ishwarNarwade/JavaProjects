package com.kiranacademy.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Mobile 
{
   @Id
   public Integer mobileid;
   public Integer price,speed;
   
public Integer getMobileid() {
	return mobileid;
}
public void setMobileid(Integer mobileid) {
	this.mobileid = mobileid;
}
public Integer getPrice() {
	return price;
}
public void setPrice(Integer price) {
	this.price = price;
}
public Integer getSpeed() {
	return speed;
}
public void setSpeed(Integer speed) {
	this.speed = speed;
}

@Override
public String toString() {
	return "Mobile [mobileid=" + mobileid + ", price=" + price + ", speed=" + speed + "]";
}
 

   
}
