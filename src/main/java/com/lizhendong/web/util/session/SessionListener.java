package com.lizhendong.web.util.session;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class SessionListener implements HttpSessionListener{  
	
	      SessionConstant  SummerConstant;
	      public void sessionCreated(HttpSessionEvent event) {   
	    	    HttpSession ses = event.getSession();   
	    	    String id=ses.getId()+ses.getCreationTime();  
	    	    SummerConstant.UserMap.put(id, Boolean.TRUE); //添加用户  
	      } 
	      public void sessionDestroyed(HttpSessionEvent event) { 
	    	  HttpSession ses = event.getSession(); 
	    	  String id=ses.getId()+ses.getCreationTime(); 
	    	  synchronized (this) {  
	    		    SummerConstant.USERNUM--; //用户数减一   
	    	        SummerConstant.UserMap.remove(id); //从用户组中移除掉，用户组为一个map   }   }   } 
	          }
	      }
}
