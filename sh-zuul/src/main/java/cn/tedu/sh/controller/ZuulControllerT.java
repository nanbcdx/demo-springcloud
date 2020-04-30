package cn.tedu.sh.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ZuulControllerT {
	
	@Value("${person.age}")
	private Integer age;
	
	@Value("${person.name}")
	private String name;
	
	@GetMapping("/getAge")
	public String getAge() {
		return "年龄是:"+age;
	}
	
	@GetMapping("/getName")
	public String getName() {
		return "名字是:"+name;
	}
	

}
