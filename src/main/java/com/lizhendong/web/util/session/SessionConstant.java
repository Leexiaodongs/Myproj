package com.lizhendong.web.util.session;

import java.util.Map;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
@Scope("singleton")
public class SessionConstant {
   public Map<String,Boolean>	UserMap;
   public int USERNUM;

}
