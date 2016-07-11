package com.lizhendong.web.action;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lizhendong.web.dao.DB;
import com.lizhendong.web.service.TestMy;


@Controller
public class TestAction {
	@Resource
	private TestMy  testss;
	 @RequestMapping("/test/test.do")
	 public String test(HttpServletRequest request,HttpServletResponse respones ){
		 
		 testss.setTest("22", "33");
		 
		 return "/index.jsp"; 
	 }

}
