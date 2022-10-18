package com.example.hibernate.hibernate;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerDept {
	@Autowired
	private EmployeeRepo er3;// up to date

	@GetMapping("/department")
	public List<String> getSample() {
		ArrayList<String> transformedvalues = new ArrayList<String>();
		for (EmployeeEntity emt3 : er3.findAll()) {
			EmployeeEntity temp = new EmployeeEntity();
			
			temp.setDepartment(emt3.getDepartment());
			transformedvalues.add(temp.getDepartment());
		}
		return transformedvalues;
	}
	
	
}
