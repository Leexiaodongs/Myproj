package com.lizhendong.web.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lizhendong.web.dao.DB;

@Controller
public class loginAction {
	 @RequestMapping("/login/loginfrom.do")
      public String loginform(HttpServletRequest request,HttpServletResponse response,Model model,HttpSession session){
    	  String name=(String) request.getParameter("name");
  		  String password=(String) request.getParameter("password");
  		  System.out.println("--------");
  		  System.out.println(name);
  		  System.out.println(password);
  		System.out.println("--------");
  		System.out.println(DB.getAll().get(name));
  		  if(DB.getAll().get(name).equals(password)){
  			System.out.println(DB.getAll().get(name));
  			session.setAttribute("name",name);
  			return "登录成功";
  		  }else{
  			return "登录失败"; 
  		  }
    	  
    	  
      }
	 @RequestMapping("/login/login.do")
	 public String login(HttpServletRequest request,HttpServletResponse response,Model model){
		 
		 
		 return "/member/login.jsp";
	 }
}
