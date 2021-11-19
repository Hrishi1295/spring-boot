package com.shop.pojo;

import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import com.shop.Enum.RecieptType;


@EnableAutoConfiguration
@Entity
@Table(name = "Reciept")
public class Reciept {
	
	@Id
	
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  
	  @Column(name="rid", nullable = false, updatable = false)
	 
	
	int Rid;
	@ManyToOne(cascade = CascadeType.ALL)
	User Uname;
	@ManyToMany(cascade = {CascadeType.ALL})
	List<Product> Pname;
	Date Date;
	int Wages;
	int total,paid,remain;
	@Enumerated(EnumType.STRING)
	RecieptType Rtype;
	
	public Reciept() {
		System.out.println("In Reciept Constructor");
	}

	public Reciept(int rid, User uname, List<Product> pname, java.util.Date date, int wages, int total, int paid,
			int remain, RecieptType rtype) {
		super();
		Rid = rid;
		Uname = uname;
		Pname = pname;
		Date = date;
		Wages = wages;
		this.total = total;
		this.paid = paid;
		this.remain = remain;
		Rtype = rtype;
	}

	public int getRid() {
		return Rid;
	}

	public void setRid(int rid) {
		Rid = rid;
	}

	public User getUname() {
		return Uname;
	}

	public void setUname(User uname) {
		Uname = uname;
	}

	public List<Product> getPname() {
		return Pname;
	}

	public void setPname(List<Product> pname) {
		Pname = pname;
	}

	public Date getDate() {
		return Date;
	}

	public void setDate(Date date) {
		Date = date;
	}

	public int getWages() {
		return Wages;
	}

	public void setWages(int wages) {
		Wages = wages;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getPaid() {
		return paid;
	}

	public void setPaid(int paid) {
		this.paid = paid;
	}

	public int getRemain() {
		return remain;
	}

	public void setRemain(int remain) {
		this.remain = remain;
	}

	public RecieptType getRtype() {
		return Rtype;
	}

	public void setRtype(RecieptType rtype) {
		Rtype = rtype;
	}

	@Override
	public String toString() {
		return "Reciept [Rid=" + Rid + ", Uname=" + Uname + ", Pname=" + Pname + ", Date=" + Date + ", Wages=" + Wages
				+ ", total=" + total + ", paid=" + paid + ", remain=" + remain + ", Rtype=" + Rtype + "]";
	}
	
	

}
