package com.example.hibernate.hibernate;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerId {

	@Autowired
	private EmployeeRepo er1;// up to date

	@GetMapping("/id")
	public List<Integer> getSample() {
		ArrayList<Integer> transformedvalues = new ArrayList<Integer>();
		for (EmployeeEntity emt1 : er1.findAll()) {
			EmployeeEntity temp = new EmployeeEntity();
			
			temp.setId(emt1.getId());
			transformedvalues.add(temp.getId());
		}
		return transformedvalues;
	}
	
}
