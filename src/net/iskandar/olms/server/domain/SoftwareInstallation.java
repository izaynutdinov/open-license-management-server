package net.iskandar.olms.server.domain;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="SOFTWARE_INSTALLATIONS")
public class SoftwareInstallation extends BaseEntity {

	@ManyToOne(optional=false)
	@JoinColumn(name="USER_NODE_ID", nullable=false, updatable=false)
	private UserNode userNode;

	@ManyToOne(optional=false)
	@JoinColumn(name="SOFTWARE_ID", nullable=false, updatable=false)
	private Software software;

	public UserNode getUserNode() {
		return userNode;
	}

	public void setUserNode(UserNode userNode) {
		this.userNode = userNode;
	}

	public Software getSoftware() {
		return software;
	}

	public void setSoftware(Software software) {
		this.software = software;
	}

}
