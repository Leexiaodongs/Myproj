package com.lizhendong.web.dao;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope
public class DB { 
	 private static Map<String,String> map = new LinkedHashMap<String,String>();
	     static{
	          map.put("1", "1");
	          map.put("2", "2");
	          map.put("3", "3");
	          map.put("4", "4");
	          map.put("5", "5");
	      }
	      
	      public static Map<String,String> getAll(){
	         return map;
	     }

}
