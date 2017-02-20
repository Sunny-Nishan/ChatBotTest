package com.talespin.users.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="StoreOrWarehouseMapping")
public class StoreOrWarehouseMapping {

	@Id
	private String id;
	private String storeOrWarehouse;
	private String consumerUserId;
	private boolean status;
	private Date createdDateTime;
	private String createdUser;
	private Date updatedDateTime;
	private String updatedUser;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getStoreOrWarehouse() {
		return storeOrWarehouse;
	}
	public void setStoreOrWarehouse(String storeOrWarehouse) {
		this.storeOrWarehouse = storeOrWarehouse;
	}
	public String getConsumerUserId() {
		return consumerUserId;
	}
	public void setConsumerUserId(String consumerUserId) {
		this.consumerUserId = consumerUserId;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
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
}
