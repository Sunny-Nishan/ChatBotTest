package com.talespin.webservice.model;

import java.util.List;

import com.talespin.users.model.ProductLine;

public class ProductlineWithSubcategory {

	private String category;
	private String id;
	private String attachment;
	private List<ProductLine> subcategory;

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAttachment() {
		return attachment;
	}

	public void setAttachment(String attachment) {
		this.attachment = attachment;
	}

	public List<ProductLine> getSubcategory() {
		return subcategory;
	}

	public void setSubcategory(List<ProductLine> subcategory) {
		this.subcategory = subcategory;
	}

}
