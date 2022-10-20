package com.example.policy.policy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientsController {

	@Autowired
	private ClientRepo cr;

	@GetMapping("/join")
	public List<ClientsEntity> joincol() {

		return cr.getjoin();

	}

}
