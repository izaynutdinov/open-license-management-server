package net.iskandar.olms.server.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="NODES")
public class Node extends BaseEntity {

	@Column(name="CPU_TYPE")
	private String cpuType;

	@Column(name="RAM_MB")
	private Integer ramMb;

	public String getCpuType() {
		return cpuType;
	}

	public void setCpuType(String cpuType) {
		this.cpuType = cpuType;
	}

	public Integer getRamMb() {
		return ramMb;
	}

	public void setRamMb(Integer ramMb) {
		this.ramMb = ramMb;
	}

}
