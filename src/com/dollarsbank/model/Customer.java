package com.dollarsbank.model;

import java.io.Serializable;

public class Customer implements Serializable{


 private static final long serialVersionUID = 1L;
 
 
 private String Name;
 private String Address;
 private String Phonenum;
 private String UserId;
 private String Password;
 private Double Initamount;
 

public Customer() {
  this("N/A","N/A","N/A","N/A","N/A",0.0);
}


public Customer(String Name, String Address, String Phonenum, String UserId, String Password, double Initamount) {
	// TODO Auto-generated constructor stub
	this.Name=Name;
	this.Address=Address;
	this.Phonenum=Phonenum;
	this.UserId=UserId;
	this.Password=Password;
	this.Initamount=Initamount;
}


public String getName() {
	return Name;
}


public void setName(String name) {
	Name = name;
}


public String getAddress() {
	return Address;
}


public void setAddress(String address) {
	Address = address;
}


public String getPhonenum() {
	return Phonenum;
}


public void setPhonenum(String phonenum) {
	Phonenum = phonenum;
}


public String getUserId() {
	return UserId;
}


public void setUserId(String userId) {
	UserId = userId;
}


public String getPassword() {
	return Password;
}


public void setPassword(String password) {
	Password = password;
}


public Double getInitamount() {
	return Initamount;
}


public void setInitamount(Double initamount) {
	Initamount = initamount;
}


@Override
public String toString() {
	return "Customer [Name=" + Name + ", Address=" + Address + ", Phonenum=" + Phonenum + ", UserId=" + UserId
			+ ", Password=" + Password + ", Initamount=" + Initamount + "]";
}

}