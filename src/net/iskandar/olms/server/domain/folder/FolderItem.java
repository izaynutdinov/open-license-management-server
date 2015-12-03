package net.iskandar.olms.server.domain.folder;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

import net.iskandar.olms.server.domain.BaseEntity;

@MappedSuperclass
@Table(name="FOLDER_ITEMS")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="ITEM_TYPE", discriminatorType=DiscriminatorType.STRING, length=32)
public abstract class FolderItem extends BaseEntity {

	@ManyToOne(optional=false)
	@JoinColumn(name="FOLDER_ID", nullable=false, updatable=false)
	private Folder folder;

	public Folder getFolder() {
		return folder;
	}

	public void setFolder(Folder folder) {
		this.folder = folder;
	}

}
