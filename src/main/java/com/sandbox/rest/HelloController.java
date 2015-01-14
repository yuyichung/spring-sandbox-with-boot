package com.sandbox.rest;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@EnableAutoConfiguration
@RequestMapping("hello")
public class HelloController {

	@RequestMapping(value="world", method=RequestMethod.GET)
	public String hello()
	{
		return "hello!!!";
	}
}
