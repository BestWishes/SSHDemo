package com.bigbest.utils;

import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Random;

/**
 * 日期工具类
 * @author ljj
 *
 */
public class DateUtil {
	
	/**
	 * 获取当前日期 yyyy-MM-dd HH:mm:ss
	 * @return Date
	 */
	public static Date getNowDate() {
		Date currentTime=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		ParsePosition pp=new ParsePosition(0);
		String dateString=sdf.format(currentTime);
		System.out.println(dateString);
		Date currentTime_2=sdf.parse(dateString, pp);
		
		return currentTime_2;
	}
	/**
	 * 获取当前日期 yyyy-MM-dd 时分秒为0：00:00
	 * @return  Date
	 */
	public static Date getNowShortDate() {
		Date currentTime = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String dateString = formatter.format(currentTime);
		ParsePosition pos = new ParsePosition(0);
		Date currentTime_2 = formatter.parse(dateString, pos);
		
		return currentTime_2;
	}
	 
	/**
	 * 获取当前日期字符串 yyyy-MM-dd HH:mm:ss
	 * @return 当前日期的字符串，包括时分秒
	 */
	public static String getNowDateString() {
		Date currentTime = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateString = formatter.format(currentTime);
		
		return dateString;
	}
	 
	/**
	 * 获取当前日期字符串 yyyy-MM-dd
	 * @return 当前日期的字符串，不包括时分秒
	 */
	public static String geNowDateShortString() {
		Date currentTime = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String dateString = formatter.format(currentTime);
		
		return dateString;
	}
	 
	/**
	 * 获取当前时间字符串 HH:mm:ss
	 * @return String 当前时间的字符串 ，不包括年月日
	 */
	public static String getTimeString() {
		SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
		Date currentTime = new Date();
		String dateString = formatter.format(currentTime);
		
		return dateString;
	}
	/**
	 *  yyyy-MM-dd HH:mm:ss 字符串 →日期型 
	 * @return Date
	 */
	public static Date strToDate(String strDate) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		ParsePosition pos = new ParsePosition(0);
		Date strtodate = formatter.parse(strDate, pos);
		
		return strtodate;
	}
	 
	/**
	 *  yyyy-MM-dd 字符串 →日期型
	 *  @return Date
	 */
	public static Date strToShortDate(String strDate) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		ParsePosition pos = new ParsePosition(0);
		Date strtodate = formatter.parse(strDate, pos);
		
		return strtodate;
	}
	 
	/**
	 *  日期型 →yyyy-MM-dd HH:mm:ss字符串 
	 *  @return String
	 */
	public static String toStr(Date dateDate) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateString = formatter.format(dateDate);
		
		return dateString;
	}
	 
	/**
	 * 日期 →yyyy-MM-dd转字符串 
	 * @return String
	 */
	public static String toShortStr(java.util.Date dateDate) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String dateString = formatter.format(dateDate);
		
		return dateString;
	}
	 
	/**
	 * 获取当前系统时间
	 * @Date
	 */
	public static Date getNow() {
		Date currentTime = new Date();	
		return currentTime;
	}
	 
	/**
	 * @param long day
	 * 获取day天前的日期
	 * @return Date
	 */
	public static Date getLastDate(long day) {
		Date date = new Date();
		long date_3_hm = date.getTime() - 3600000 * 24 * day;
		Date date_3_hm_date = new Date(date_3_hm);
		
		return date_3_hm_date;
	}
	 
	/**
	 * 获取当前时间字符串 yyyyMMdd HHmmss
	 * @return string
	 */
	public static String getStringToday() {
		Date currentTime = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd HHmmss");
		String dateString = formatter.format(currentTime);
	  
		return dateString;
	}
	 
	/**
	 * 获取当前时间小时数
	 * @return String
	 */
	public static String getHour() {
		Date currentTime = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateString = formatter.format(currentTime);
		String hour;
		hour = dateString.substring(11, 13);
		
		return hour;
	}
	 
	/**
	 * 获取当前时间分钟数
	 * @return String
	 */
	 public static String getTime() {
	  Date currentTime = new Date();
	  SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	  String dateString = formatter.format(currentTime);
	  String min;
	  min = dateString.substring(14, 16);
	  return min;
	 }
	 
	  /**
	   * 获取用户指定格式的日期
	   * @param sformat
	   * @return String
	   */
	 public static String getUserDate(String sformat) {
	  Date currentTime = new Date();
	  SimpleDateFormat formatter = new SimpleDateFormat(sformat);
	  String dateString = formatter.format(currentTime);
	  return dateString;
	 }
	 
	  
	 public static String getTwoHour(String st1, String st2) {
	  String[] kk = null;
	  String[] jj = null;
	  kk = st1.split(":");
	  jj = st2.split(":");
	  if (Integer.parseInt(kk[0]) < Integer.parseInt(jj[0]))
	   return "0";
	  else {
	   double y = Double.parseDouble(kk[0]) + Double.parseDouble(kk[1]) / 60;
	   double u = Double.parseDouble(jj[0]) + Double.parseDouble(jj[1]) / 60;
	   if ((y - u) > 0)
	    return y - u + "";
	   else
	    return "0";
	  }
	 }
	 
	  
	 public static String getTwoDay(String sj1, String sj2) {
	  SimpleDateFormat myFormatter = new SimpleDateFormat("yyyy-MM-dd");
	  long day = 0;
	  try {
	   java.util.Date date = myFormatter.parse(sj1);
	   java.util.Date mydate = myFormatter.parse(sj2);
	   day = (date.getTime() - mydate.getTime()) / (24 * 60 * 60 * 1000);
	  } catch (Exception e) {
	   return "";
	  }
	  return day + "";
	 }
	  
	 public static String getPreTime(String sj1, String jj) {
	  SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	  String mydate1 = "";
	  try {
	   Date date1 = format.parse(sj1);
	   long Time = (date1.getTime() / 1000) + Integer.parseInt(jj) * 60;
	   date1.setTime(Time * 1000);
	   mydate1 = format.format(date1);
	  } catch (Exception e) {
	  }
	  return mydate1;
	 }

	 public static String getPreDay(Date nowdate, String delay) {
	  try{
	  SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
	  String mdate = "";
	  long myTime = (nowdate.getTime() / 1000) - Integer.parseInt(delay) * 24 * 60 * 60;
	  nowdate.setTime(myTime * 1000);
	  mdate = format.format(nowdate);
	  return mdate;
	  }catch(Exception e){
	   return "";
	  }
	 }
	 
	  
	 public static String getNextDay(String nowdate, String delay) {
	   return getNextDay(strToDate(nowdate), delay);
	 }

	 /**
	  * 取未来日
	  * @param nowdate 对象日期
	  * @param delay 加算天数
	  * @return 未来日
	  */
	 public static String getNextDay(Date nowdate, String delay) {
		 try{
			 SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			 String mdate = "";
			 long myTime = (nowdate.getTime() / 1000) + Integer.parseInt(delay) * 24 * 60 * 60;
			 nowdate.setTime(myTime * 1000);
			 mdate = format.format(nowdate);
			 return mdate;
		 }catch(Exception e){
			 return "";
		 }
	 }

    /**
     * 取指定日期的月末日
     * 
     * @param _date 指定日期
     * @return 月末日
     */
    public static Date getMonthEndDay(Date _date) {

        if (_date == null) {
            throw new IllegalArgumentException();
        }

        Calendar calendar = Calendar.getInstance();

        calendar.setTime(_date);
        int monthEndDay = calendar.getActualMaximum(Calendar.DATE);
        calendar.set(Calendar.DATE, monthEndDay);

        return calendar.getTime();
    }

    /**
     * 取指定日期+指定月数后的日期
     * <p>
     * addMonths(2008/01/30, 2) = 2008/03/30<br>
     * addMonths(2008/01/30, 1) = 2008/02/29<br>
     * addMonths(2008/03/30, -1) = 2008/02/29
     * </p>
     * 
     * @param _date 指定日期
     * @param _amount 加算月数
     * @return 月数计算后的日期
     */
    public static Date addMonths(Date _date, int _amount) {
        return org.apache.commons.lang3.time.DateUtils.addMonths(_date, _amount);
    }

    /**
     * 指定日期+指定年数后的日期
     * 
     * @param _date 指定日期
     * @param _amount 加算年数
     * @return 年数计算后的日期
     */
    public static Date addYears(Date _date, int _amount) {
        return org.apache.commons.lang3.time.DateUtils.addYears(_date, _amount);
    }

    /**
     * 取得日期的指定格式
     * 
     * @param _date 日期
     * @param _format 指定格式
     * @return 格式化后的日期
     */
    public static String format(Date _date, String _format) {
        if (_date == null || _format == null || _format.isEmpty()) {
            throw new IllegalArgumentException();
        }

        SimpleDateFormat dateFormat = new SimpleDateFormat(_format);
        return dateFormat.format(_date);
    }

	 public static boolean isLeapYear(String ddate) {
	 
	  
	  Date d = strToDate(ddate);
	  GregorianCalendar gc = (GregorianCalendar) Calendar.getInstance();
	  gc.setTime(d);
	  int year = gc.get(Calendar.YEAR);
	  if ((year % 400) == 0)
	   return true;
	  else if ((year % 4) == 0) {
	   if ((year % 100) == 0)
	    return false;
	   else
	    return true;
	  } else
	   return false;
	 }
	 
	  
	 public static String getEDate(String str) {
	  SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
	  ParsePosition pos = new ParsePosition(0);
	  Date strtodate = formatter.parse(str, pos);
	  String j = strtodate.toString();
	  String[] k = j.split(" ");
	  return k[2] + k[1].toUpperCase() + k[5].substring(2, 4);
	 }
	 
	  
	 public static String getEndDateOfMonth(String dat) {// yyyy-MM-dd
	  String str = dat.substring(0, 8);
	  String month = dat.substring(5, 7);
	  int mon = Integer.parseInt(month);
	  if (mon == 1 || mon == 3 || mon == 5 || mon == 7 || mon == 8 || mon == 10 || mon == 12) {
	   str += "31";
	  } else if (mon == 4 || mon == 6 || mon == 9 || mon == 11) {
	   str += "30";
	  } else {
	   if (isLeapYear(dat)) {
	    str += "29";
	   } else {
	    str += "28";
	   }
	  }
	  return str;
	 }
	 
	  
	 public static boolean isSameWeekDates(Date date1, Date date2) {
	  Calendar cal1 = Calendar.getInstance();
	  Calendar cal2 = Calendar.getInstance();
	  cal1.setTime(date1);
	  cal2.setTime(date2);
	  int subYear = cal1.get(Calendar.YEAR) - cal2.get(Calendar.YEAR);
	  if (0 == subYear) {
	   if (cal1.get(Calendar.WEEK_OF_YEAR) == cal2.get(Calendar.WEEK_OF_YEAR))
	    return true;
	  } else if (1 == subYear && 11 == cal2.get(Calendar.MONTH)) {
	   // 如果12月的最后一周横跨来年第一周的话则最后一周即算做来年的第一周
	   if (cal1.get(Calendar.WEEK_OF_YEAR) == cal2.get(Calendar.WEEK_OF_YEAR))
	    return true;
	  } else if (-1 == subYear && 11 == cal1.get(Calendar.MONTH)) {
	   if (cal1.get(Calendar.WEEK_OF_YEAR) == cal2.get(Calendar.WEEK_OF_YEAR))
	    return true;
	  }
	  return false;
	 }
	 
	  
	 public static String getSeqWeek() {
	  Calendar c = Calendar.getInstance(Locale.CHINA);
	  String week = Integer.toString(c.get(Calendar.WEEK_OF_YEAR));
	  if (week.length() == 1)
	   week = "0" + week;
	  String year = Integer.toString(c.get(Calendar.YEAR));
	  return year + week;
	 }
	 
	  
	 public static String getWeek(String sdate, String num) {
	  // 再转换为时间
	  Date dd = DateUtil.strToDate(sdate);
	  Calendar c = Calendar.getInstance();
	  c.setTime(dd);
	  if (num.equals("1")) // 返回星期一所在的日期
	   c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
	  else if (num.equals("2")) // 返回星期二所在的日期
	   c.set(Calendar.DAY_OF_WEEK, Calendar.TUESDAY);
	  else if (num.equals("3")) // 返回星期三所在的日期
	   c.set(Calendar.DAY_OF_WEEK, Calendar.WEDNESDAY);
	  else if (num.equals("4")) // 返回星期四所在的日期
	   c.set(Calendar.DAY_OF_WEEK, Calendar.THURSDAY);
	  else if (num.equals("5")) // 返回星期五所在的日期
	   c.set(Calendar.DAY_OF_WEEK, Calendar.FRIDAY);
	  else if (num.equals("6")) // 返回星期六所在的日期
	   c.set(Calendar.DAY_OF_WEEK, Calendar.SATURDAY);
	  else if (num.equals("0")) // 返回星期日所在的日期
	   c.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
	  return new SimpleDateFormat("yyyy-MM-dd").format(c.getTime());
	 }
	 
	  
	 public static String getWeek(String sdate) {
	  // 再转换为时间
	  Date date = DateUtil.strToDate(sdate);
	  Calendar c = Calendar.getInstance();
	  c.setTime(date);
	  // int hour=c.get(Calendar.DAY_OF_WEEK);
	  // hour中存的就是星期几了，其范围 1~7
	  // 1=星期日 7=星期六，其他类推
	  return new SimpleDateFormat("EEEE").format(c.getTime());
	 }
	 public static String getWeekStr(String sdate){
	  String str = "";
	  str = DateUtil.getWeek(sdate);
	  if("1".equals(str)){
	   str = "星期日";
	  }else if("2".equals(str)){
	   str = "星期一";
	  }else if("3".equals(str)){
	   str = "星期二";
	  }else if("4".equals(str)){
	   str = "星期三";
	  }else if("5".equals(str)){
	   str = "星期四";
	  }else if("6".equals(str)){
	   str = "星期五";
	  }else if("7".equals(str)){
	   str = "星期六";
	  }
	  return str;
	 }
	 
	  
	 public static long getDays(String date1, String date2) {
	  if (date1 == null || date1.equals(""))
	   return 0;
	  if (date2 == null || date2.equals(""))
	   return 0;
	  // 转换为标准时间
	  SimpleDateFormat myFormatter = new SimpleDateFormat("yyyy-MM-dd");
	  java.util.Date date = null;
	  java.util.Date mydate = null;
	  try {
	   date = myFormatter.parse(date1);
	   mydate = myFormatter.parse(date2);
	  } catch (Exception e) {
	  }
	  long day = (date.getTime() - mydate.getTime()) / (24 * 60 * 60 * 1000);
	  return day;
	 }
	 
	  
	 public static String getNowMonth(String sdate) {
	  // 取该时间所在月的一号
	  sdate = sdate.substring(0, 8) + "01";
	 
	  // 得到这个月的1号是星期几
	  Date date = DateUtil.strToDate(sdate);
	  Calendar c = Calendar.getInstance();
	  c.setTime(date);
	  int u = c.get(Calendar.DAY_OF_WEEK);
	  String newday = DateUtil.getNextDay(sdate, (1 - u) + "");
	  return newday;
	 }
	 
	  
	 
	 public static String getNo(int k) {
	 
	  return getUserDate("yyyyMMddhhmmss") + getRandom(k);
	 }
	 
	  
	 public static String getRandom(int i) {
	  Random jjj = new Random();
	  // int suiJiShu = jjj.nextInt(9);
	  if (i == 0)
	   return "";
	  String jj = "";
	  for (int k = 0; k < i; k++) {
	   jj = jj + jjj.nextInt(9);
	  }
	  return jj;
	 }
	 
	  
	 public static boolean RightDate(String date) {
	 
	  SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	  ;
	  if (date == null)
	   return false;
	  if (date.length() > 10) {
	   sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	  } else {
	   sdf = new SimpleDateFormat("yyyy-MM-dd");
	  }
	  try {
	   sdf.parse(date);
	  } catch (ParseException pe) {
	   return false;
	  }
	  return true;
	 }
	 
	  
//	 public static String getStringDateMonth(String sdate, String nd, String yf, String rq, String format) {
//	  Date currentTime = new Date();
//	  SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
//	  String dateString = formatter.format(currentTime);
//	  String s_nd = dateString.substring(0, 4); // 年份
//	  String s_yf = dateString.substring(5, 7); // 月份
//	  String s_rq = dateString.substring(8, 10); // 日期
//	  String sreturn = "";
//	  roc.util.MyChar mc = new roc.util.MyChar();
//	  if (sdate == null || sdate.equals("") || !mc.Isdate(sdate)) { // 处理空值情况
//	   if (nd.equals("1")) {
//	    sreturn = s_nd;
//	    // 处理间隔符
//	    if (format.equals("1"))
//	     sreturn = sreturn + "年";
//	    else if (format.equals("2"))
//	     sreturn = sreturn + "-";
//	    else if (format.equals("3"))
//	     sreturn = sreturn + "/";
//	    else if (format.equals("5"))
//	     sreturn = sreturn + ".";
//	   }
//	   // 处理月份
//	   if (yf.equals("1")) {
//	    sreturn = sreturn + s_yf;
//	    if (format.equals("1"))
//	     sreturn = sreturn + "月";
//	    else if (format.equals("2"))
//	     sreturn = sreturn + "-";
//	    else if (format.equals("3"))
//	     sreturn = sreturn + "/";
//	    else if (format.equals("5"))
//	     sreturn = sreturn + ".";
//	   }
//	   // 处理日期
//	   if (rq.equals("1")) {
//	    sreturn = sreturn + s_rq;
//	    if (format.equals("1"))
//	     sreturn = sreturn + "日";
//	   }
//	  } else {
//	   // 不是空值，也是一个合法的日期值，则先将其转换为标准的时间格式
//	   sdate = roc.util.RocDate.getOKDate(sdate);
//	   s_nd = sdate.substring(0, 4); // 年份
//	   s_yf = sdate.substring(5, 7); // 月份
//	   s_rq = sdate.substring(8, 10); // 日期
//	   if (nd.equals("1")) {
//	    sreturn = s_nd;
//	    // 处理间隔符
//	    if (format.equals("1"))
//	     sreturn = sreturn + "年";
//	    else if (format.equals("2"))
//	     sreturn = sreturn + "-";
//	    else if (format.equals("3"))
//	     sreturn = sreturn + "/";
//	    else if (format.equals("5"))
//	     sreturn = sreturn + ".";
//	   }
//	   // 处理月份
//	   if (yf.equals("1")) {
//	    sreturn = sreturn + s_yf;
//	    if (format.equals("1"))
//	     sreturn = sreturn + "月";
//	    else if (format.equals("2"))
//	     sreturn = sreturn + "-";
//	    else if (format.equals("3"))
//	     sreturn = sreturn + "/";
//	    else if (format.equals("5"))
//	     sreturn = sreturn + ".";
//	   }
//	   // 处理日期
//	   if (rq.equals("1")) {
//	    sreturn = sreturn + s_rq;
//	    if (format.equals("1"))
//	     sreturn = sreturn + "日";
//	   }
//	  }
//	  return sreturn;
//	 }
//	 
//	 public static String getNextMonthDay(String sdate, int m) {
//	  sdate = getOKDate(sdate);
//	  int year = Integer.parseInt(sdate.substring(0, 4));
//	  int month = Integer.parseInt(sdate.substring(5, 7));
//	  month = month + m;
//	  if (month < 0) {
//	   month = month + 12;
//	   year = year - 1;
//	  } else if (month > 12) {
//	   month = month - 12;
//	   year = year + 1;
//	  }
//	  String smonth = "";
//	  if (month < 10)
//	   smonth = "0" + month;
//	  else
//	   smonth = "" + month;
//	  return year + "-" + smonth + "-10";
//	 }
//	 
//	 public static String getOKDate(String sdate) {
//	  if (sdate == null || sdate.equals(""))
//	   return getStringDateShort();
//	 
//	  if (!VeStr.Isdate(sdate)) {
//	   sdate = getStringDateShort();
//	  }
//	  // 将“/”转换为“-”
//	  sdate = VeStr.Replace(sdate, "/", "-");
//	  // 如果只有8位长度，则要进行转换
//	  if (sdate.length() == 8)
//	   sdate = sdate.substring(0, 4) + "-" + sdate.substring(4, 6) + "-" + sdate.substring(6, 8);
//	  SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
//	  ParsePosition pos = new ParsePosition(0);
//	  Date strtodate = formatter.parse(sdate, pos);
//	  String dateString = formatter.format(strtodate);
//	  return dateString;
//	 }
//	 
//	 public static void main(String[] args) throws Exception {
//	  try {
//	   //System.out.print(Integer.valueOf(getTwoDay("2006-11-03 12:22:10", "2006-11-02 11:22:09")));
//	  } catch (Exception e) {
//	   throw new Exception();
//	  }
//	  //System.out.println("sss");
//	 }
}
