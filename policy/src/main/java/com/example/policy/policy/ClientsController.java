package com.example.policy.policy;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientsController {

	@Autowired
	private ClientRepo cr;

	@GetMapping("/{plan}/{amount}")
	public Integer amount1(@PathVariable String plan, @PathVariable String amount) {

		Integer Plan = Integer.parseInt(plan);
		Integer Amount = Integer.parseInt(amount);

		Integer percentage = 0;
		if (Plan < 5) {
			return Amount;
		} else if (Plan == 5) {
			percentage = 10 * Amount / 100;
		} else {
			percentage = 12 * Amount / 100;
		}

		return (Amount - percentage);

	}

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

	@GetMapping("/id=6")
	public List<ClientsEntity> joincol6() {

		return cr.id3();

	}

	@GetMapping("/id=7")
	public List<ClientsEntity> joincol7() {

		return cr.id4();

	}

	@GetMapping("/id=8")
	public List<ClientsEntity> joincol8() {

		return cr.id5();

	}

}
