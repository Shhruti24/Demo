package com.javabykiran.Shruti;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

	@RequestMapping("smile") // end point
	public String welcome() {
		return "I started leaqrning Advance Java";
	}
}
