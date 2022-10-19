package com.example.join.joinTables;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Bike")
public class BikeEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer Bikeid;
	private String Bike_name;
	private Integer Tyres;

	public Integer getBikeid() {
		return Bikeid;
	}

	public void setBikeid(Integer bikeid) {
		this.Bikeid = bikeid;
	}

	public String getBike_name() {
		return Bike_name;
	}

	public void setBike_name(String bike_name) {
		this.Bike_name = bike_name;
	}

	public Integer getTyres() {
		return Tyres;
	}

	public void setTyres(Integer tyres) {
		this.Tyres = tyres;
	}

}
