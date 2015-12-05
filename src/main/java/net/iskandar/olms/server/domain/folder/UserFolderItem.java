package net.iskandar.olms.server.domain.folder;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.Session;
import org.hibernate.Transaction;

import net.iskandar.olms.HibernateUtil;
import net.iskandar.olms.server.domain.User;

@Entity
@DiscriminatorValue("USER")
public class UserFolderItem extends FolderItem {

	@ManyToOne(optional=false, cascade=CascadeType.PERSIST)
	@JoinColumn(name="USER_ID", nullable=false, updatable=false)
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public static void main(String[] args){
		Session session = HibernateUtil.getSession();
		Transaction tr = session.beginTransaction();
		try {
			Folder folder = new Folder();
			folder.setName("FOLDER-1");
			UserFolderItem ufi = new UserFolderItem();
			ufi.setFolder(folder);
			User user = new User();
			user.setFirstName("Iskandar");
			user.setSecondName("Homidjanovich");
			user.setLastName("Zaynutdinov");
			user.setUserName("iskandar");
			user.setPasswordMd5("NO PASSWORD!");
			ufi.setUser(user);
			session.persist(ufi);
		} finally {
			tr.commit();
		}
	}

}
