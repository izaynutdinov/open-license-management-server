package net.iskandar.olms.server.domain.folder;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import net.iskandar.olms.server.domain.BaseEntity;

@Entity
@Table(name="FOLDERS")
public class Folder {

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
