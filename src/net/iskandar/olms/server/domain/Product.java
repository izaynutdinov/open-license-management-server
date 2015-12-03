package net.iskandar.olms.server.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="PRODUCTS")
public class Product extends BaseEntity {

	@ManyToOne(optional=false)
	@JoinColumn(name="VENDOR_ID", nullable=false, updatable=false)
	private Vendor vendor;

	@Column(name="PRODUCT_NAME")
	private String name;

	public Vendor getVendor() {
		return vendor;
	}

	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
