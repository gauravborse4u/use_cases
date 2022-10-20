package com.example.policy.policy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientsController {

	@Autowired
	private ClientRepo cr;

	@GetMapping("/id=1")
	public List<ClientsEntity> joincol() {

		return cr.id1();

	}
	
	@GetMapping("/id=2")
	public List<ClientsEntity> joincol2() {

		return cr.id2();

	}
	
	@GetMapping("/id=3")
	public List<ClientsEntity> joincol3() {

		return cr.id3();

	}
	
	@GetMapping("/id=4")
	public List<ClientsEntity> joincol4() {

		return cr.id4();

	}
	
	@GetMapping("/id=5")
	public List<ClientsEntity> joincol5() {

		return cr.id5();

	}

}
