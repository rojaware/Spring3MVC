package com.mkyong.common.model;

import java.util.Arrays;

public class Shop {

	String name;
	String staffName[];
	
	
	public Shop(String name, String[] staffName) {
		super();
		this.name = name;
		this.staffName = staffName;
	}
	public Shop(String name) {
		super();
		this.name = name;
	}
	public Shop() {
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String[] getStaffName() {
		return staffName;
	}
	public void setStaffName(String[] staffName) {
		this.staffName = staffName;
	}
	
	@Override
	public String toString() {
		return "Shop [name=" + name + ", staffName=" + Arrays.toString(staffName) + "]";
	} 
	
}