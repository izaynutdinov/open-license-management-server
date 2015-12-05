package net.iskandar.olms.server.service.hibernate;

import net.iskandar.olms.server.domain.Vendor;
import net.iskandar.olms.server.service.VendorService;

public class VendorServiceImpl extends BaseServiceImpl<Vendor> implements VendorService {

	public VendorServiceImpl() {
		super(Vendor.class);
	}

}
