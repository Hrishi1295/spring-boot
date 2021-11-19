package com.shop.pojo;

import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;


@EnableAutoConfiguration
@Entity
@Table(name = "user")
public class User {
	@Id
	
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  
	  @Column(name="uid", nullable = false, updatable = false)
	 
	
	int uid;
	String FName,MName,SName,Address,MobileNo,aadhar;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "rid")
	@OrderColumn(name = "type")
	List <Reciept> reciept;
	
	public User() {
		System.out.println("In User default constructor");
	}

	public User(String fName, String mName, String sName, String address, String mobileNo, String aadhar) {
		System.out.println("in user parameterised constructor");
		FName = fName;
		MName = mName;
		SName = sName;
		Address = address;
		MobileNo = mobileNo;
		this.aadhar = aadhar;
	}

	public int getuId() {
		return uid;
	}

	public void setuId(int uid) {
		this.uid = uid;
	}

	public String getFName() {
		return FName;
	}

	public void setFName(String fName) {
		FName = fName;
	}

	public String getMName() {
		return MName;
	}

	public void setMName(String mName) {
		MName = mName;
	}

	public String getSName() {
		return SName;
	}

	public void setSName(String sName) {
		SName = sName;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getMobileNo() {
		return MobileNo;
	}

	public void setMobileNo(String mobileNo) {
		MobileNo = mobileNo;
	}

	public String getAadhar() {
		return aadhar;
	}

	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}

	@Override
	public String toString() {
		return "User [ FName=" + FName + ", MName=" + MName + ", SName=" + SName + ", Address=" + Address
				+ ", MobileNo=" + MobileNo + ", aadhar=" + aadhar + "]";
	}
	
}
