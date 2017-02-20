package com.talespin.users.model;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="FeaturedCategory")
public class FeaturedCategory {

	@Id
	private String id;
	private String featuredCategory;
	private String description;
	private String redirectTo;
	private String subcategoryId;
	private String productLineId;
	private List<String> attachmentId;
	private Date createdDateTime;
	private String createdUser;
	private Date updatedDateTime;
	private String updatedUser;
	private boolean status;
	
	public String getFeaturedCategory() {
		return featuredCategory;
	}
	public String getSubcategoryId() {
		return subcategoryId;
	}
	public void setSubcategoryId(String subcategoryId) {
		this.subcategoryId = subcategoryId;
	}
	public String getProductLineId() {
		return productLineId;
	}
	public void setProductLineId(String productLineId) {
		this.productLineId = productLineId;
	}
	public List<String> getAttachmentId() {
		return attachmentId;
	}
	public void setAttachmentId(List<String> attachmentId) {
		this.attachmentId = attachmentId;
	}
	public void setFeaturedCategory(String featuredCategory) {
		this.featuredCategory = featuredCategory;
	}
	public String getRedirectTo() {
		return redirectTo;
	}
	public void setRedirectTo(String redirectTo) {
		this.redirectTo = redirectTo;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) throws Exception {
		
			this.description = description;
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
