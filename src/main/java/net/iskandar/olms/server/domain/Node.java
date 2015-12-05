package net.iskandar.olms.server.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="NODES")
public class Node {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
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
