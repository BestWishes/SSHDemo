package com.bigbest.utils.mapper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.dozer.DozerBeanMapper;

public class BeanEntityMapper {

	/**
	 *  单例模式。减少不必要的资源浪费。
	 */
	public static DozerBeanMapper dozer=new DozerBeanMapper();
	
	 /**
	  * 将source转化为destination类型
	  * @param source
	  * @param destinationClass
	  * @return
	  */
	 public static <T> T map(Object source,Class<T> destinationClass){
	  return dozer.map(source, destinationClass);
	 }
	 /**
	  * 将source的深度赋值到destination
	  * @param source
	  * @param destination
	  */
	 public static void copy(Object source,Object destination){
	  dozer.map(source, destination);
	 }
	 
	 /**
	  * 将集合类型的对象 sourceList转化为特定类型的集合List<T>
	  * @param sourceList
	  * @param destinationClass
	  * @return
	  */
	 public static <T> List<T> mapList(Collection sourceList, Class<T> destinationClass) {
	  List<T> destinationList =new ArrayList<T>();
	  for (Object sourceObject : sourceList) {
	   T destinationObject = dozer.map(sourceObject, destinationClass);
	   destinationList.add(destinationObject);
	  }
	  return destinationList;
	 }
}
