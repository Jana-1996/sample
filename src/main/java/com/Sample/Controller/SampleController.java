package com.Sample.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	@GetMapping(value="/get")
	public String get() {
		return "Hello";
	}
}
