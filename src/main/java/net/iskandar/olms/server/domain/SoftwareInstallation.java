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
@Table(name="SOFTWARE_INSTALLATIONS")
public class SoftwareInstallation {

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
	@JoinColumn(name="USER_NODE_ID", nullable=false, updatable=false)
	private UserNode userNode;

	@ManyToOne(optional=false, cascade=CascadeType.PERSIST)
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
