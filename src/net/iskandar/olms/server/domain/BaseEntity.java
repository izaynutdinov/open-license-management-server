package net.iskandar.olms.server.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class BaseEntity {

	@Id
	@GeneratedValue
	private Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
}
