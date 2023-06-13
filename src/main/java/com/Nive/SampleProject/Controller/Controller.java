package com.Nive.SampleProject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Nive.SampleProject.Business.Business;

@RestController
public class Controller {
	@Autowired
	private Business b;
@GetMapping("/s")
public int dis() {
	return b.polygon();
}

	



}
