package kr.co.saramin.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping( "/hello" )
	
	public ModelAndView hello( @RequestParam String name ) {
		
		ModelAndView mav = new ModelAndView();
		mav.addObject( "hello", "Hello " + name );
		mav.setViewName( "/index.jsp" );
		
		return mav;
	}

	@RequestMapping("/main")
	@ResponseBody
	public String main(){
		
		
		return "Hellocontroller. main";
		//return "/WEB-INF/views/hello.jsp";
		
		
	}
	

}
