package com.lux.corp.cmp.admin.offer.pojo;

public class ProductPojo {

	private Integer pkProductId;
	private String productName;
	private String productDescription;
	private String productValueOffer;
	private String productValue;
	private Integer fkSubcaId;

	public Integer getPkProductId() {
		return pkProductId;
	}

	public void setPkProductId(Integer pkProductId) {
		this.pkProductId = pkProductId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getProductValueOffer() {
		return productValueOffer;
	}

	public void setProductValueOffer(String productValueOffer) {
		this.productValueOffer = productValueOffer;
	}

	public String getProductValue() {
		return productValue;
	}

	public void setProductValue(String productValue) {
		this.productValue = productValue;
	}

	public Integer getFkSubcaId() {
		return fkSubcaId;
	}

	public void setFkSubcaId(Integer fkSubcaId) {
		this.fkSubcaId = fkSubcaId;
	}

}
