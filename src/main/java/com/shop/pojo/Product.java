package com.shop.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import com.shop.Enum.PType;
import com.shop.Enum.Status;

@EnableAutoConfiguration
@Entity
@Table(name = "product")
public class Product {
	

	
	  @Id
	  
		
		  @GeneratedValue(strategy = GenerationType.IDENTITY)
		  
		  @Column(name="pid", nullable = false, updatable = false)
		 
	int PId;
	String Pname;
	@Enumerated(EnumType.STRING)
	PType Ptype ;
	double GrossWeight;
	double NetWeight;
	@Enumerated(EnumType.STRING)
	Status status;
	
	


	
	public Product(int pId, String pname, PType ptype, double grossWeight, double netWeight, Status status) {
		super();
		PId = pId;
		Pname = pname;
		Ptype = ptype;
		GrossWeight = grossWeight;
		NetWeight = netWeight;
		this.status = status;
	}

	public Product() {
		System.out.println("In product default constructor");
	}

	public int getPId() {
		return PId;
	}

	public void setPId(int pId) {
		PId = pId;
	}

	public String getPname() {
		return Pname;
	}

	public void setPname(String pname) {
		Pname = pname;
	}

	public PType getPtype() {
		return Ptype;
	}

	public void setPtype(PType ptype) {
		Ptype = ptype;
	}

	public double getGrossWeight() {
		return GrossWeight;
	}

	public void setGrossWeight(double grossWeight) {
		this.GrossWeight = grossWeight;
	}

	public double getNetWeight() {
		return NetWeight;
	}

	public void setNetWeight(double netWeight) {
		this.NetWeight = netWeight;
	}


	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
			this.status = status;
	}

	@Override
	public String toString() {
		return "Product [PId=" + PId + ", Pname=" + Pname + ", Ptype=" + Ptype + ", GrossWeight=" + GrossWeight
				+ ", NetWeight=" + NetWeight + ", status=" + status + "]";
	}

	public Product getQuantity() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
		
	
}
