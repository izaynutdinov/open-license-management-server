package net.iskandar.olms.server.service;

import net.iskandar.olms.server.domain.BaseEntity;

public interface Service<T extends BaseEntity> {
	T get(Integer id);
}
