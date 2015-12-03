package net.iskandar.olms.server.service.hibernate;

import net.iskandar.olms.server.domain.License;
import net.iskandar.olms.server.service.LicenseService;

public class LicenseServiceImpl extends BaseServiceImpl<License> implements LicenseService {

	public LicenseServiceImpl() {
		super(License.class);
	}

}
