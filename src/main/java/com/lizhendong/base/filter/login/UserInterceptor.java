package com.lizhendong.base.filter.login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class UserInterceptor implements  HandlerInterceptor {

	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
		       arg1.sendRedirect("/member/login.jsp"); 
		// TODO Auto-generated method stub
		
	}

	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2) throws Exception {
		String str = (String) arg0.getSession().getAttribute("name");  
        System.out.println("str=========>"+str);  
        if(str!=null){  
            return true;  
        }  
       // System.out.println(arg0.getContextPath() +"/member/login.jsp");
        arg1.sendRedirect(arg0.getContextPath() +"/member/login.jsp"); 
        return false;  
        
	}

}
