package com.AutomationBuild.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AutomationBuildController {
	
	@GetMapping(value="/name")
	public String get() {
		return "helloWorld";
	}

}
