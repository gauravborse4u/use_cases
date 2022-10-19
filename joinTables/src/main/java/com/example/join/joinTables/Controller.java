package com.example.join.joinTables;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@Autowired
	private TruckRepo tr;
	
	
	@GetMapping("/join")
	public List<TruckEntity> joincol(){
		
		return tr.getjoin();
		
	}

}
