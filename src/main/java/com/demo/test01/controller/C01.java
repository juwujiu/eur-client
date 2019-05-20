package com.demo.test01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.demo.test01.entity.E01;

@RestController
public class C01 {
	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/i01")
	public E01 i01(int i) {
		E01 e01 = new E01();
		e01.setId(i++);
		e01.setName("first");
		return e01;
	}

	@GetMapping("/i02")
	public E01 i02(int i) {
		String j = restTemplate.getForObject("http://test02/j01?j=" + i, String.class);
		E01 e01 = new E01();
		e01.setId(i++);
		e01.setName(String.valueOf(j));
		return e01;
	}
}
