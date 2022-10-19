package com.example.join.joinTables;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Car")
public class CarEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer Carid;
	private String Car_name;
	private Integer tyres;

	public Integer getCarid() {
		return Carid;
	}

	public void setCarid(Integer carid) {
		this.Carid = carid;
	}

	public String getCar_name() {
		return Car_name;
	}

	public void setCar_name(String car_name) {
		this.Car_name = car_name;
	}

	public Integer getTyres() {
		return tyres;
	}

	public void setTyres(Integer tyres) {
		this.tyres = tyres;
	}

	
}
