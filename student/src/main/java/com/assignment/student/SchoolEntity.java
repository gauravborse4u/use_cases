package com.assignment.student;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "school")
public class SchoolEntity {

	@Id

	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private String Stud_name;
	private String School_name;

	public String getSchool_name() {
		return School_name;
	}

	public void setSchool_name(String school_name) {
		this.School_name = school_name;
	}

	public String getStud_name() {
		return Stud_name;
	}

	public void setStud_name(String stud_name) {
		this.Stud_name = stud_name;
	}

	

}
