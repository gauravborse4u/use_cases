package com.assignment.student;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
 
	@Autowired
	private SchoolRepo sc;// up to date

	@GetMapping("/student")
	public List<SchoolEntity> getSample() {
		ArrayList<SchoolEntity> transformedvalues = new ArrayList<SchoolEntity>();
		for (SchoolEntity smt : sc.findAll()) {
			SchoolEntity temp = new SchoolEntity();
			
			temp.setSchool_name(smt.getSchool_name());
			transformedvalues.add(temp);
		}
		return transformedvalues;
	}
}
