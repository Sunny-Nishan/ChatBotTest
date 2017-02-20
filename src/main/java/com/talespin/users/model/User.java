package com.talespin.users.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="User")
public class User {
	
	@Id
	private String id;
	private String name;
	private String description;
	private String customerID;
	private String email;
	private String password;
	private UserType userType;
	private Boolean status;
	private String note;
	private int registeredOTP;
	private int lastForgetPwdOTP;
	private Date lastPwdSetDateTime;	
	private Date createdDateTime;
	private String createdUser;
	private Date updatedDateTime;
	private String updatedUser;
	private Date lastLoginDateTime;
	private Date statusUpdatedDateTime;
	
	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Date getStatusUpdatedDateTime() {
		return statusUpdatedDateTime;
	}

	public void setStatusUpdatedDateTime(Date statusUpdatedDateTime) {
		this.statusUpdatedDateTime = statusUpdatedDateTime;
	}

	public Date getLastLoginDateTime() {
		return lastLoginDateTime;
	}

	public void setLastLoginDateTime(Date lastLoginDateTime) {
		this.lastLoginDateTime = lastLoginDateTime;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) throws Exception {
			this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) throws Exception {
			this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserType getUserType() {
		return userType;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}

	public int getRegisteredOTP() {
		return registeredOTP;
	}

	public void setRegisteredOTP(int registeredOTP) {
		this.registeredOTP = registeredOTP;
	}

	public int getLastForgetPwdOTP() {
		return lastForgetPwdOTP;
	}

	public void setLastForgetPwdOTP(int lastForgetPwdOTP) {
		this.lastForgetPwdOTP = lastForgetPwdOTP;
	}

	public Date getLastPwdSetDateTime() {
		return lastPwdSetDateTime;
	}

	public void setLastPwdSetDateTime(Date lastPwdSetDateTime) {
		this.lastPwdSetDateTime = lastPwdSetDateTime;
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
