package com.lizhendong.web.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lizhendong.web.dao.TestMapper;
import com.lizhendong.web.entity.Test;
import com.lizhendong.web.service.TestMy;
@Service
public class Testimpl implements TestMy {
	 @Resource
	  private TestMapper testmapper;
	
	
	public  void setTest(String a,String b) {
		Test ttt=new Test(a,b);
		System.out.println("--------------");
		   System.out.println("a"+a+":b"+b);
		System.out.println("--------------");
		// TODO Auto-generated method stub
		this.testmapper.insert(ttt);
	}

}
