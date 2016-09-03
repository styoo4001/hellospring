package kr.co.saramin.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/board/*")
public class BoardController {

	
	@RequestMapping
	@ResponseBody
	public String writeform(){
		
		return "writeform()";
		
	}
	
	@RequestMapping
	@ResponseBody
	public String write(){
		
		return "write()";
		
	}
	
	@RequestMapping
	@ResponseBody
	public String view(){
		
		return "view()";
		
	}
	 
	
	
}
