package com.lizhendong.dbtest;
import java.net.UnknownHostException;
import java.util.Iterator;
import java.util.Set;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.Mongo;
import com.mongodb.MongoException;
/**
 * java  
 * mongodb连接开启、关闭、从mongodb中获取集合的名称、获取某个集合的大小
 */
public class MongodbLink {

	public static void main(String[] args) {
		Mongo m = null;
		DB db = null;
		try {
			//Mongo(p1, p2):p1=>IP地址     p2=>端口
			m = new Mongo("localhost", 27017);
			//根据mongodb数据库的名称获取mongodb对象
			db = m.getDB("Myproj_db");
			//校验用户密码是否正确
			if (!db.authenticate("lizhendong", "123456".toCharArray())){
				System.out.println("连接MongoDB数据库,校验失败！");
			}else{
				System.out.println("连接MongoDB数据库,校验成功！");
				
				db.requestStart();
				//获取集合名称
				Set<String> colNameSet = db.getCollectionNames();
				Iterator<String> colNameItr = colNameSet.iterator();
				while(colNameItr.hasNext()){
					String colName = colNameItr.next();
					System.out.println("数据集合的名称："+colName);
				}
				//获取集合对象
				DBCollection dbCol = db.getCollection("ADMIN1352528239201");
				if(dbCol != null){
					//获取集合大小
					Integer colSize = (Integer) dbCol.getStats().get("size");
					System.out.println("数据集大小为[单位：B]："+colSize);
				}
				db.requestDone();
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (MongoException e) {
			e.printStackTrace();
		}
		//mongodb连接关闭
		finally{
			if (null != m) {
				if (null != db) {
					// 结束Mongo数据库的事务请求
					try {
						db.requestDone();
					} catch(Exception e) {
						e.printStackTrace();
					}
				}
				try
				{
					m.close();
				} catch(Exception e1) {
					e1.printStackTrace();
				}
				m = null;
			}
		}
	}
}
