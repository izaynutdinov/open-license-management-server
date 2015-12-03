package net.iskandar.olms.server.domain.folder;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import net.iskandar.olms.server.domain.Node;

@Entity
@DiscriminatorValue("NODE")
public class NodeFolderItem extends FolderItem {

	@ManyToOne(optional=false)
	@JoinColumn(name="NODE_ID", nullable=false, updatable=false)
	private Node node;

	public Node getNode() {
		return node;
	}

	public void setNode(Node node) {
		this.node = node;
	}

}
