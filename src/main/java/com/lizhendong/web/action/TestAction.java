package com.lizhendong.web.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lizhendong.web.dao.DB;


@Controller
public class TestAction {
	 
	 @RequestMapping("/test/test.do")
	 public String test(HttpServletRequest request,HttpServletResponse respones ){
		
		 return "/index.jsp"; 
	 }

}
