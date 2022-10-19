package com.example.join.joinTables;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Truck")
public class TruckEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer Truckid;
	private String Truck_name;
	private Integer tyres;

	public Integer getTruckid() {
		return Truckid;
	}

	public void setTruckid(Integer truckid) {
		this.Truckid = truckid;
	}

	public String getTruck_name() {
		return Truck_name;
	}

	public void setTruck_name(String truck_name) {
		this.Truck_name = truck_name;
	}

	public Integer getTyres() {
		return tyres;
	}

	public void setTyres(Integer tyres) {
		this.tyres = tyres;
	}

	

}
