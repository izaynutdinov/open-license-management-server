package net.iskandar.olms.server.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="LICENSE_LINKS")
public class LicenseLink extends BaseEntity {

	@ManyToOne(optional=false)
	@JoinColumn(name="LICENSE_ID", nullable=false, updatable=false)
	private License license;
	
	@Column(name="URL")
	private String url;
	
	@Column(name="URL_TITLE")
	private String title;
	
	@Column(name="URL_DESCRIPTION")
	private String description;

	public License getLicense() {
		return license;
	}

	public void setLicense(License license) {
		this.license = license;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
