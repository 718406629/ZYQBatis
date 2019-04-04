package org.zyq.test;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.zyq.entity.Person1;
import org.zyq.mapper.person1Mapper;

public class Test {
	
	//带转换器的查询
		public static void selectPerson1ByNumberWithConverter() throws IOException {
			
			Reader reader = Resources.getResourceAsReader("conf.xml") ;
			//reader  ->SqlSession
			//可以通过build的第二参数 指定数据库环境
			SqlSessionFactory sessionFacotry = new SqlSessionFactoryBuilder().build(reader,"development") ;
			//session相当于jdbc里的connection
			SqlSession session = sessionFacotry.openSession() ;
			person1Mapper person1Mapper = session.getMapper(person1Mapper.class);
			
		   Person1 person1=person1Mapper.selectPerson1ByNumberWithConverter(1);
		   session.commit();
		   session.close();
		   System.out.println(person1);

			
			
			
			
		}
		//带转换器的修改
		public static	void updatePerson1ByNumberWithConverter() throws IOException{
			
			Reader reader = Resources.getResourceAsReader("conf.xml") ;
			//reader  ->SqlSession
			//可以通过build的第二参数 指定数据库环境
			SqlSessionFactory sessionFacotry = new SqlSessionFactoryBuilder().build(reader,"development") ;
			//session相当于jdbc里的connection
			SqlSession session = sessionFacotry.openSession() ;
			person1Mapper person1Mapper = session.getMapper(person1Mapper.class);
			Person1 person1=new Person1();
			person1.setNumber(1);
			person1.setName("ls");
			person1.setAge(24);
			person1.setSex(true);
			person1Mapper.updatePerson1ByNumberWithConverter(person1);
			session.commit();
			session.close();
			
		}
		//添加
		public static void addPerson1WithConverter() throws IOException{
			Reader reader = Resources.getResourceAsReader("conf.xml") ;
			//reader  ->SqlSession
			//可以通过build的第二参数 指定数据库环境
			SqlSessionFactory sessionFacotry = new SqlSessionFactoryBuilder().build(reader,"development") ;
			//session相当于jdbc里的connection
			SqlSession session = sessionFacotry.openSession() ;
			person1Mapper person1Mapper = session.getMapper(person1Mapper.class);
			Person1 person1=new Person1(2,"ls",24,false);
			person1Mapper.addPerson1WithConverter(person1);
		    session.commit();
		    session.close();
		}
		//删除
		public static void deletePerson1ByNumber() throws IOException{
			Reader reader = Resources.getResourceAsReader("conf.xml") ;
			//reader  ->SqlSession
			//可以通过build的第二参数 指定数据库环境
			SqlSessionFactory sessionFacotry = new SqlSessionFactoryBuilder().build(reader,"development") ;
			//session相当于jdbc里的connection
			SqlSession session = sessionFacotry.openSession() ;
			person1Mapper person1Mapper = session.getMapper(person1Mapper.class);
			person1Mapper.deletePerson1ByNumber(2);
            session.commit();
            session.close();
			
		}
		//查询全部
		public static  void selectAllPerson1WithConverter() throws IOException{
			Reader reader = Resources.getResourceAsReader("conf.xml") ;
			//reader  ->SqlSession
			//可以通过build的第二参数 指定数据库环境
			SqlSessionFactory sessionFacotry = new SqlSessionFactoryBuilder().build(reader,"development") ;
			//session相当于jdbc里的connection
			SqlSession session = sessionFacotry.openSession() ;
			person1Mapper person1Mapper = session.getMapper(person1Mapper.class);
		   List<Person1> person1s=person1Mapper.selectAllPerson1WithConverter();
		   session.commit();
		   session.close();
		   System.out.println(person1s);
		   
		}
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) throws IOException {
		//selectAllPerson1WithConverter();
		//addPerson1WithConverter();
		//selectAllPerson1WithConverter();
		//deletePerson1ByNumber();
	// selectAllPerson1WithConverter();
	 // selectPerson1ByNumberWithConverter();
		
		updatePerson1ByNumberWithConverter();
		selectAllPerson1WithConverter();
		
	}
	
	
	
}
