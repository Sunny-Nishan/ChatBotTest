package com.talespin.users.model;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Attachment")
public class Attachment {

	@Id
	private String id;
	private String attachment;
	private String encryptedAttachment;
	private String link;
	private String attachmentType;
	private String attachmentModule;
	private String thumbnail180into240;
	private String thumbnail240into320;
	private boolean status;
	private Date createdDateTime;
	private String createdUser;
	private Date updatedDateTime;
	private String updatedUser;
	
	public String getThumbnail180into240() {
		return thumbnail180into240;
	}
	public void setThumbnail180into240(String thumbnail180into240) {
		this.thumbnail180into240 = thumbnail180into240;
	}
	public String getThumbnail240into320() {
		return thumbnail240into320;
	}
	public void setThumbnail240into320(String thumbnail240into320) {
		this.thumbnail240into320 = thumbnail240into320;
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
	public String getEncryptedAttachment() {
		return encryptedAttachment;
	}
	public void setEncryptedAttachment(String encryptedAttachment) {
		this.encryptedAttachment = encryptedAttachment;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getAttachmentType() {
		return attachmentType;
	}
	public void setAttachmentType(String attachmentType) {
		this.attachmentType = attachmentType;
	}
	public String getAttachmentModule() {
		return attachmentModule;
	}
	public void setAttachmentModule(String attachmentModule) {
		this.attachmentModule = attachmentModule;
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
