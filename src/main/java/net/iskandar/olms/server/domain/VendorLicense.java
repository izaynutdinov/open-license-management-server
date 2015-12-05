package net.iskandar.olms.server.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="VENDOR_LICENSES")
public class VendorLicense {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(optional=false, cascade=CascadeType.PERSIST)
	@JoinColumn(name="VENDOR_ID", nullable=false, updatable=false)
	private Vendor vendor;

	@ManyToOne(optional=false, cascade=CascadeType.PERSIST)
	@JoinColumn(name="LICENSE_ID", nullable=false, updatable=false)
	private License license;

	public Vendor getVendor() {
		return vendor;
	}

	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}

	public License getLicense() {
		return license;
	}

	public void setLicense(License license) {
		this.license = license;
	}

}
