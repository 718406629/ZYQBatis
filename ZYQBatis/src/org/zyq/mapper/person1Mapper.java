package org.zyq.mapper;

import java.util.List;
import java.util.Map;

import org.zyq.entity.Person1;

public interface person1Mapper {
    //带转换器的查询
	Person1 selectPerson1ByNumberWithConverter(int number);
	//带转换器的修改
	void updatePerson1ByNumberWithConverter(Person1 person1);
	//添加
	void addPerson1WithConverter(Person1 person1);
	//删除
	void deletePerson1ByNumber(int number);
	//查询全部
	 List<Person1> selectAllPerson1WithConverter();
	//queryPerson1ByAgeOrNameWhthHashMap
	List<Person1> queryPerson1NameOrAgeWithHashMap(Map<String,Object> map);
	




}