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

	/* private String Stud; */
	private String School_name;

	public String getSchool_name() {
		return School_name;
	}

	public void setSchool_name(String school_name) {
		this.School_name = school_name;
	}

	/*
	 * public Integer getId() { return id; }
	 * 
	 * public void setId(Integer id) { this.id = id; }
	 */

	/*
	 * public String getStud() { return Stud; }
	 * 
	 * public void setStud(String stud) { this.Stud = stud; }
	 */

}
