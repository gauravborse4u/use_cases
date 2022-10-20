package com.example.policy.policy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "clients")
public class ClientsEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cid")
	private Integer Cid;

	@Column(name = "pid")
	private Integer Pid;

	@Column(name = "name")
	private String Name;

	@Column(name = "address")
	private String Address;

	private String Plan;
	private Integer Duration;

	public Integer getCid() {
		return Cid;
	}

	public void setCid(Integer cid) {
		Cid = cid;
	}

	public Integer getPid() {
		return Pid;
	}

	public void setPid(Integer pid) {
		Pid = pid;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getPlan() {
		return Plan;
	}

	public void setPlan(String plan) {
		Plan = plan;
	}

	public Integer getDuration() {
		return Duration;
	}

	public void setDuration(Integer duration) {
		Duration = duration;
	}

	public ClientsEntity(Integer cid, Integer pid, String name, String address, String plan, Integer duration) {
		super();
		Cid = cid;
		Pid = pid;
		Name = name;
		Address = address;
		Plan = plan;
		Duration = duration;
	}

	public ClientsEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

}
