package com.talespin.users.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class Size {

	private String name;
	private Boolean is_active;
	private int price;
	private int special_price;
	private String eanCode;
	
	public String getName() {
		return name;
	}
	public String getEanCode() {
		return eanCode;
	}
	public void setEanCode(String eanCode) {
		this.eanCode = eanCode;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Boolean getIs_active() {
		return is_active;
	}
	public void setIs_active(Boolean is_active) {
		this.is_active = is_active;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getSpecial_price() {
		return special_price;
	}
	public void setSpecial_price(int special_price) {
		this.special_price = special_price;
	}
}
