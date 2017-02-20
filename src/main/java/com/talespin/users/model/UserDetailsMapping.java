package com.talespin.users.model;

public class UserDetailsMapping {

	private User user;
	private StoreOrWarehouseMapping storeOrWarehouseMapping;
	private UserContact contact;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public StoreOrWarehouseMapping getStoreOrWarehouseMapping() {
		return storeOrWarehouseMapping;
	}
	public void setStoreOrWarehouseMapping(StoreOrWarehouseMapping storeOrWarehouseMapping) {
		this.storeOrWarehouseMapping = storeOrWarehouseMapping;
	}
	public UserContact getContact() {
		return contact;
	}
	public void setContact(UserContact contact) {
		this.contact = contact;
	}
}
