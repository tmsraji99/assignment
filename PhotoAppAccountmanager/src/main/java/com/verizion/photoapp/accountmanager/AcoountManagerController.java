package com.verizion.photoapp.accountmanager;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AcoountManagerController {

	@GetMapping("/get")
	public String hello() {
		return "working";
	}
}
