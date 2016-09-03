package kr.co.saramin.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

@RequestMapping("/user")
public class UserController {


	@RequestMapping("/joinform")
	@ResponseBody
	public String joinform(){
		
		return "joinform()";
		
	}
	
	
	@RequestMapping("/loginform")
	@ResponseBody
	public String loginform(){
		
		return "loginform()";
		
	}
	
	
	@RequestMapping( value="/join" , method=RequestMethod.POST)  // 이렇게 써넣으면 조인으로 들어올땐 포스트로만 받을 수 있다.
	@ResponseBody
	public String join(){
		
		return "join()";
	}
	
	
}
