package com.javabasic.train;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ParsePositionTrain {

	public static void main(String[] args) {
			
		ParsePosition parsePosition=new ParsePosition(1);
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
		String str="r2015-30-1r";
		Date date = simpleDateFormat.parse(str,parsePosition);
		
		System.out.println(date);
		
		String date1=simpleDateFormat.format(new Date());
		System.out.println(date1);
		
	}
}
