package com.test.action;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class HelloController {
	@RequestMapping("/hello")
	@ResponseBody
	public String home(){
		return "Hello,SpingBoot阿斯达所";
	}
}
