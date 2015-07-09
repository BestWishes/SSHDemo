package com.bigbest.utils.mapper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.dozer.DozerBeanMapper;

public class BeanEntityMapper {

	/**
	 *  ����ģʽ�����ٲ���Ҫ����Դ�˷ѡ�
	 */
	public static DozerBeanMapper dozer=new DozerBeanMapper();
	
	 /**
	  * ��sourceת��Ϊdestination����
	  * @param source
	  * @param destinationClass
	  * @return
	  */
	 public static <T> T map(Object source,Class<T> destinationClass){
	  return dozer.map(source, destinationClass);
	 }
	 /**
	  * ��source����ȸ�ֵ��destination
	  * @param source
	  * @param destination
	  */
	 public static void copy(Object source,Object destination){
	  dozer.map(source, destination);
	 }
	 
	 /**
	  * ���������͵Ķ��� sourceListת��Ϊ�ض����͵ļ���List<T>
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
