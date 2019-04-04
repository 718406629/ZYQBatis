package org.zyq.test;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.zyq.entity.Person1;
import org.zyq.mapper.person1Mapper;

public class Test {

	public static void main(String[] args) throws IOException {
		Reader reader = Resources.getResourceAsReader("conf.xml") ;
		//reader  ->SqlSession
		//可以通过build的第二参数 指定数据库环境
		SqlSessionFactory sessionFacotry = new SqlSessionFactoryBuilder().build(reader,"development") ;
		//session相当于jdbc里的connection
		SqlSession session = sessionFacotry.openSession() ;
		person1Mapper person1Mapper = session.getMapper(person1Mapper.class);
		Person1 person=person1Mapper.selectPerson1ByNumber(1);
		System.out.println(person);
		session.close();
		
		
		
		
	}
	
	
	
}
