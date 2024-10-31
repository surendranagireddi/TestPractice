package com.nt.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentDemo {

	@GetMapping("/getMessage")
	public String getMessage() {
		return "Well come to  first student spring boot";
	}
}
