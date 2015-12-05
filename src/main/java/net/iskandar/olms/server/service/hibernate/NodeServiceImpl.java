package net.iskandar.olms.server.service.hibernate;

import net.iskandar.olms.server.domain.Node;
import net.iskandar.olms.server.service.NodeService;

public class NodeServiceImpl extends BaseServiceImpl<Node> implements NodeService {

	public NodeServiceImpl() {
		super(Node.class);
	}

}
