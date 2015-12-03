package net.iskandar.olms.server.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="SOFTWARE")
public class Software extends BaseEntity {

	@ManyToOne(optional=false)
	@JoinColumn(name="PRODUCT_ID", nullable=false, updatable=true)
	private Product product;

	@Column(name="VERSION")
	private String version;

	@ManyToOne(optional=false)
	@JoinColumn(name="LICENSE_ID", nullable=true, updatable=true)
	private License license;

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public License getLicense() {
		return license;
	}

	public void setLicense(License license) {
		this.license = license;
	}

}
