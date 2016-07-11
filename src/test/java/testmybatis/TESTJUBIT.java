package testmybatis;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lizhendong.web.service.TestMy;

import javax.annotation.Resource;


@RunWith(SpringJUnit4ClassRunner.class)	 //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:conf/applicationContext.xml"})
public class TESTJUBIT {
	  @Resource
	  private TestMy  testss;
	  @Test
	  public Boolean test1(){
		 
		  testss.setTest("23","22");
		  return true;
	  }
	

}
