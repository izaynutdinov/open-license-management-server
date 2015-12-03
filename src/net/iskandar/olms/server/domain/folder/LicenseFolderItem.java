package net.iskandar.olms.server.domain.folder;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import net.iskandar.olms.server.domain.License;

@Entity
@DiscriminatorValue("LICENSE")
public class LicenseFolderItem extends FolderItem {

	@ManyToOne(optional=false)
	@JoinColumn(name="LICENSE_ID", updatable=false, nullable=false)
	private License license;

	public License getLicense() {
		return license;
	}

	public void setLicense(License license) {
		this.license = license;
	}

}
