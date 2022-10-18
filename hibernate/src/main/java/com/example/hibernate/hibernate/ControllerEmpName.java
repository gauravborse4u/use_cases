package com.example.hibernate.hibernate;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ControllerEmpName {

	@Autowired
	private EmployeeRepo er1;// up to date

	@GetMapping("/empname")
	public List<String> getSample() {
		ArrayList<String> transformedvalues = new ArrayList<String>();
		for (EmployeeEntity emt1 : er1.findAll()) {
			EmployeeEntity temp = new EmployeeEntity();
			
			temp.setEmployee_name(emt1.getEmployee_name());
			transformedvalues.add(temp.getEmployee_name());
		}
		return transformedvalues;
	}
	
}
