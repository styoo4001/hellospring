package kr.co.saramin.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import kr.co.saramin.hellospring.vo.GuestbookVo;

@Controller
@RequestMapping("/guestbook")

public class GuestbookController {

	@RequestMapping("/delete")
	@ResponseBody
	public String delete( 
			@RequestParam("id") String id,
			@RequestParam("no") Integer no
			){
		
		System.out.println(id);
		System.out.println(no);
		return "delete()";
		
	}

	/*
@RequestMapping("/delete2")
	
	public String delete2(
			
			// 변수와 넘어오는 파라미터 이름이 같다면
			@RequestParam String id,
			@RequestParam Integer no
			){
		
		System.out.println(id);
		System.out.println(no);
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("id", id);
		mav.addObject("no", no);
		
		mav.setViewName(viewName);();
		
		
		return "/WEB-INF/views/delete2.jsp";
		
	}
*/
	// 수동으로 지정 하는 방법? 
	@RequestMapping("/delete2")
	public ModelAndView delete2(
			
			// 변수와 넘어오는 파라미터 이름이 같다면
			@RequestParam String id,
			@RequestParam Integer no
			){
		
		System.out.println(id);
		System.out.println(no);
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("id", id);
		mav.addObject("no", no);
		
		mav.setViewName("/WEB-INF/views/delete2.jsp");
		
		return mav;
	}
	
	// modelandview 말고 그냥 model 에 넘기는 방법 ..
	@RequestMapping("/delete3")
	public String delete3(
			
			// 변수와 넘어오는 파라미터 이름이 같다면
			@RequestParam String id,
			@RequestParam Integer no,
			Model model
			){
		
		model.addAttribute("id" , id);
		model.addAttribute("no" , no);
		
		System.out.println(id);
		System.out.println(no);
		
		return "/WEB-INF/views/delete2.jsp";
	}
	
	/*
	@RequestMapping("/delete3")
	@ResponseBody
	public String delete3( 
			@RequestParam( value="id" , required=false ) String id,
			
			@RequestParam( value="no" ) Integer no
			){
		
		System.out.println(id);
		System.out.println(no);
		return "delete3()";
		
	}
	
	*/
	@RequestMapping("/list")
	@ResponseBody
	public String list( 
			
			@RequestParam( value="p" , required=false , defaultValue="1") Integer page,
			@RequestParam( value="no" ) Integer no
			){
		
		System.out.println(page);
		System.out.println(no);
		return "delete3()";
		
	}
	

	@RequestMapping("/deleteform/{no}")
	@ResponseBody
	public String deleteform( 
			@PathVariable("no") Long no,
			@RequestParam( value="p" , required=false , defaultValue="1") Integer page
			){
		
		System.out.println(page);
		System.out.println(no);
		return "deleteform()";
		
	}

	@RequestMapping("/insert")
	@ResponseBody
	public String insert( @ModelAttribute GuestbookVo  vo){
		
		
		
		
		System.out.println(vo.toString());
		
		// 리다이렉트 하는 방법
		return "redirect:/guestbook/list";
		
	}

	

	@RequestMapping("/form")
	public String form(){

		
		return "/WEB-INF/views/form.jsp";
		
	}

	
	

}
