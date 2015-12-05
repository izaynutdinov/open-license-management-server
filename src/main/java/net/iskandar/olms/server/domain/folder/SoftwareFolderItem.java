package net.iskandar.olms.server.domain.folder;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import net.iskandar.olms.server.domain.Software;

@Entity
@DiscriminatorValue("SOFTWARE")
public class SoftwareFolderItem extends FolderItem {
	
	@ManyToOne(optional=false, cascade=CascadeType.PERSIST)
	@JoinColumn(name="SOFTWARE_ID", nullable=false, updatable=false)
	private Software software;

	public Software getSoftware() {
		return software;
	}

	public void setSoftware(Software software) {
		this.software = software;
	}

}
