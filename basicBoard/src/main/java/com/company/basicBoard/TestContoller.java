package com.company.basicBoard;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestContoller {
	@GetMapping(value = "/")
	public String home() {
		return "test";
	}
}
