package com.javabasic.train;


import com.bigbest.utils.HibernateUtil;
import com.bigbest.utils.MessageUtil;

public class ParsePositionTrain {

	public static void main(String[] args) {

		System.err.println(MessageUtil.getMessage("userName"));
		System.err.println(HibernateUtil.getSession());
	}
}
