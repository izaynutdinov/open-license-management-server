package net.iskandar.olms.server.domain.folder;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import net.iskandar.olms.server.domain.BaseEntity;

public class Folder extends BaseEntity {

	@ManyToOne(optional=false)
	@JoinColumn(name="FOLDER_ID", nullable=false, updatable=false)
	private Folder parent;

	@Column(name="FOLDER_NAME")
	private String name;

	public Folder getParent() {
		return parent;
	}

	public void setParent(Folder parent) {
		this.parent = parent;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
