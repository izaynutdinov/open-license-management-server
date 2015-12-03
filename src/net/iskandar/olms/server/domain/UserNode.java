package net.iskandar.olms.server.domain;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="USER_NODES")
public class UserNode extends BaseEntity {

	@ManyToOne(optional=false)
	@JoinColumn(name="USER_ID", nullable=false, updatable=false)
	private User user;

	@ManyToOne(optional=false)
	@JoinColumn(name="NODE_ID", nullable=false, updatable=false)
	private Node node;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Node getNode() {
		return node;
	}

	public void setNode(Node node) {
		this.node = node;
	}

}
