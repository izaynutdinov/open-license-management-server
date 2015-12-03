package net.iskandar.olms.server.service.hibernate;

import net.iskandar.olms.server.domain.Software;
import net.iskandar.olms.server.service.SoftwareService;

public class SoftwareServiceImpl extends BaseServiceImpl<Software> implements SoftwareService {

	public SoftwareServiceImpl() {
		super(Software.class);
	}

}
