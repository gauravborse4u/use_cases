package com.assignment.student;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController2 {
 
	@Autowired
	private SchoolRepo sc2;// up to date

	@GetMapping("/school")
	public List<SchoolEntity> getSample2() {
		ArrayList<SchoolEntity> transformedvalues2 = new ArrayList<SchoolEntity>();
		for (SchoolEntity smt2 : sc2.findAll()) {
			SchoolEntity temp2 = new SchoolEntity();
			
			temp2.setStud_name(smt2.getStud_name());
			transformedvalues2.add(temp2);
		}
		return transformedvalues2;
	}
}