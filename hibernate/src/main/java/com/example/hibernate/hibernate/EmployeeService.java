package com.example.hibernate.hibernate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepo empr;

	public List<EmployeeEntity> list() {
		return empr.findAll();
	}

}
