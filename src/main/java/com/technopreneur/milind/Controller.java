package com.technopreneur.milind;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {

	@GetMapping("/message")
	public String getMessage(@RequestParam(required = false) String toName) {

		if (toName != null && !toName.isEmpty()) {
			return "Welcome to " + toName;
		} else {
			return "Welcome to Spring Boot World!";
		}
	}

}
