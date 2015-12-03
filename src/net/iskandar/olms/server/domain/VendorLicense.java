package net.iskandar.olms.server.domain;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="VENDOR_LICENSES")
public class VendorLicense extends BaseEntity {

	@ManyToOne(optional=false)
	@JoinColumn(name="VENDOR_ID", nullable=false, updatable=false)
	private Vendor vendor;
	
	@ManyToOne(optional=false)
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
