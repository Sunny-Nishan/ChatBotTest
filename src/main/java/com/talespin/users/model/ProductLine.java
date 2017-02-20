package com.talespin.users.model;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="ProductLine")
public class ProductLine {
	
	@Id
	private String id;
	private String productLine;
	private String description;
	private String subcategoryId;
	private String categoryId;
	private String attachmentId;
	private Date createdDateTime;
	private String createdUser;
	private Date updatedDateTime;
	private String updatedUser;
	private boolean status;
	
	@Transient
	private List<Subcategory> l2;
	@Transient
	private String image;
	
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getAttachmentId() {
		return attachmentId;
	}
	public void setAttachmentId(String attachmentId) {
		this.attachmentId = attachmentId;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getProductLine() {
		return productLine;
	}
	public List getL2() {
		return l2;
	}
	public void setL2(List l2) {
		this.l2 = l2;
	}
	public void setProductLine(String productLine) {
		this.productLine = productLine;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getSubcategoryId() {
		return subcategoryId;
	}
	public void setSubcategoryId(String subcategoryId) {
		this.subcategoryId = subcategoryId;
	}
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public Date getCreatedDateTime() {
		return createdDateTime;
	}
	public void setCreatedDateTime(Date createdDateTime) {
		this.createdDateTime = createdDateTime;
	}
	public String getCreatedUser() {
		return createdUser;
	}
	public void setCreatedUser(String createdUser) {
		this.createdUser = createdUser;
	}
	public Date getUpdatedDateTime() {
		return updatedDateTime;
	}
	public void setUpdatedDateTime(Date updatedDateTime) {
		this.updatedDateTime = updatedDateTime;
	}
	public String getUpdatedUser() {
		return updatedUser;
	}
	public void setUpdatedUser(String updatedUser) {
		this.updatedUser = updatedUser;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
}
