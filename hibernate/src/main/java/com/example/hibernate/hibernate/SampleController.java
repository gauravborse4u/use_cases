
package com.example.hibernate.hibernate;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample")
public class SampleController {

	@Resource
	private EmployeeService emps;

	@GetMapping
	public List<EmployeeEntity> list() {
		return emps.list();
	}
}
