package com.talespin.users.model;

import java.util.Date;
import java.util.List;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
@Document(collection="Product")
public class Product {

	@Id
	private String id;
	private String productName;
	private String description;
	private String productCode;
	private String eanCode;
	private String categoryId;
	private String subcategoryId;
	private String productLineId;
	private String color;
	private String size;
	private String brandId;
	private String barcode;
	private Integer mrp;
	private String consumerId;
	private List<String> attachmentId;
	private Date createdDateTime;
	private String createdUser;
	private Date updatedDateTime;
	private String updatedUser;
	private Boolean status;
	
	@Transient
	private Set<String> images;
	@Transient
	private List<String> sizeList;
	@Transient
	private List<Size> sizes;
	@Transient
	private List<Product> related_product;
	@Transient
	private String image;
	@Transient
	private Integer special_price;
	@Transient
	private Boolean is_favourite;
	@Transient
	private Brand brand;
	@Transient
	private String offer;
	@Transient
	private Set<String> thumbnail;
	
	public Set<String> getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(Set<String> thumbnail) {
		this.thumbnail = thumbnail;
	}
	public String getOffer() {
		return offer;
	}
	public void setOffer(String offer) {
		this.offer = offer;
	}
	public List<String> getSizeList() {
		return sizeList;
	}
	public void setSizeList(List<String> sizeList) {
		this.sizeList = sizeList;
	}
	public Brand getBrand() {
		return brand;
	}
	public void setBrand(Brand brand) {
		this.brand = brand;
	}
	public Boolean getIs_favourite() {
		return is_favourite;
	}
	public void setIs_favourite(Boolean is_favourite) {
		this.is_favourite = is_favourite;
	}
	public String getBarcode() {
		return barcode;
	}
	public Integer getSpecial_price() {
		return special_price;
	}
	public void setSpecial_price(Integer special_price) {
		this.special_price = special_price;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	public String getImage() {
		return image;
	}
	public List<Size> getSizes() {
		return sizes;
	}
	public void setSizes(List<Size> sizes) {
		this.sizes = sizes;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public List<Product> getRelated_product() {
		return related_product;
	}
	public List<String> getAttachmentId() {
		return attachmentId;
	}
	public void setAttachmentId(List<String> attachmentId) {
		this.attachmentId = attachmentId;
	}
	public String getConsumerId() {
		return consumerId;
	}
	public void setConsumerId(String consumerId) {
		this.consumerId = consumerId;
	}
	public void setRelated_product(List<Product> related_product) {
		this.related_product = related_product;
	}
	public String getEanCode() {
		return eanCode;
	}
	public void setEanCode(String eanCode) {
		this.eanCode = eanCode;
	}
	public Set<String> getImages() {
		return images;
	}
	public void setImages(Set<String> images) {
		this.images = images;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
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
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getBrandId() {
		return brandId;
	}
	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}
	public Date getCreatedDateTime() {
		return createdDateTime;
	}
	public Integer getMrp() {
		return mrp;
	}
	public void setMrp(Integer mrp) {
		this.mrp = mrp;
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
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
}
