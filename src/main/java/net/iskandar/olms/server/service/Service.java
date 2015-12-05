package net.iskandar.olms.server.service;

import net.iskandar.olms.server.domain.BaseEntity;

public interface Service<T> {
	T get(Integer id);
}
