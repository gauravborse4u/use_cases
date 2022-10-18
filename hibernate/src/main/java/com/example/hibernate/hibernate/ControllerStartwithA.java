package com.example.hibernate.hibernate;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerStartwithA {

	@Autowired
	private EmployeeRepo er2;// up to date

	@GetMapping("/A")
	public List<String> getSample() {
		ArrayList<String> transformedvalues = new ArrayList<String>();
		for (EmployeeEntity emt2 : er2.findAll()) {
			EmployeeEntity temp = new EmployeeEntity();
			
			if (emt2.getEmployee_name().startsWith("a") || emt2.getEmployee_name().startsWith("A")) {
				temp.setEmployee_name(emt2.getEmployee_name());
			}
			
			temp.setId(emt2.getId());
			transformedvalues.add(temp.getEmployee_name());
		}
		return transformedvalues;
	}
	
	
}
