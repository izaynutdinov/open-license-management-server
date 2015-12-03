package net.iskandar.olms.server.domain.folder;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import net.iskandar.olms.server.domain.User;

@Entity
@DiscriminatorValue("USER")
public class UserFolderItem extends FolderItem {

	@ManyToOne(optional=false)
	@JoinColumn(name="USER_ID", nullable=false, updatable=false)
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
