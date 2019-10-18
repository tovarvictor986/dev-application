package dev_application.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "application/")
public class ApplicationController {
	
	@RequestMapping(value = "/users/get")
	@CrossOrigin(origins = "*", methods= {RequestMethod.GET})
	public String GetUsers()  {

		return "heroku integration";
	}

}
