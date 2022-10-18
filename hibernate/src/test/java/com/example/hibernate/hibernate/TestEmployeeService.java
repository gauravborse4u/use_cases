package com.example.hibernate.hibernate;

import java.util.List;
import org.junit.jupiter.api.Test;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class TestEmployeeService {

	@Autowired
	private EmployeeService emps;
	
	@Test
	public void App_start() {
		List<EmployeeEntity> emp = emps.list();
		
		 Assert.assertEquals(emp.size(), 3); 
	}
	
}
