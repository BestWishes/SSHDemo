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
 * ���ڹ�����
 * @author ljj
 *
 */
public class DateUtil {
	
	/**
	 * ��ȡ��ǰ���� yyyy-MM-dd HH:mm:ss
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
	 * ��ȡ��ǰ���� yyyy-MM-dd ʱ����Ϊ0��00:00
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
	 * ��ȡ��ǰ�����ַ��� yyyy-MM-dd HH:mm:ss
	 * @return ��ǰ���ڵ��ַ���������ʱ����
	 */
	public static String getNowDateString() {
		Date currentTime = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateString = formatter.format(currentTime);
		
		return dateString;
	}
	 
	/**
	 * ��ȡ��ǰ�����ַ��� yyyy-MM-dd
	 * @return ��ǰ���ڵ��ַ�����������ʱ����
	 */
	public static String geNowDateShortString() {
		Date currentTime = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String dateString = formatter.format(currentTime);
		
		return dateString;
	}
	 
	/**
	 * ��ȡ��ǰʱ���ַ��� HH:mm:ss
	 * @return String ��ǰʱ����ַ��� ��������������
	 */
	public static String getTimeString() {
		SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
		Date currentTime = new Date();
		String dateString = formatter.format(currentTime);
		
		return dateString;
	}
	/**
	 *  yyyy-MM-dd HH:mm:ss �ַ��� �������� 
	 * @return Date
	 */
	public static Date strToDate(String strDate) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		ParsePosition pos = new ParsePosition(0);
		Date strtodate = formatter.parse(strDate, pos);
		
		return strtodate;
	}
	 
	/**
	 *  yyyy-MM-dd �ַ��� ��������
	 *  @return Date
	 */
	public static Date strToShortDate(String strDate) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		ParsePosition pos = new ParsePosition(0);
		Date strtodate = formatter.parse(strDate, pos);
		
		return strtodate;
	}
	 
	/**
	 *  ������ ��yyyy-MM-dd HH:mm:ss�ַ��� 
	 *  @return String
	 */
	public static String toStr(Date dateDate) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateString = formatter.format(dateDate);
		
		return dateString;
	}
	 
	/**
	 * ���� ��yyyy-MM-ddת�ַ��� 
	 * @return String
	 */
	public static String toShortStr(java.util.Date dateDate) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String dateString = formatter.format(dateDate);
		
		return dateString;
	}
	 
	/**
	 * ��ȡ��ǰϵͳʱ��
	 * @Date
	 */
	public static Date getNow() {
		Date currentTime = new Date();	
		return currentTime;
	}
	 
	/**
	 * @param long day
	 * ��ȡday��ǰ������
	 * @return Date
	 */
	public static Date getLastDate(long day) {
		Date date = new Date();
		long date_3_hm = date.getTime() - 3600000 * 24 * day;
		Date date_3_hm_date = new Date(date_3_hm);
		
		return date_3_hm_date;
	}
	 
	/**
	 * ��ȡ��ǰʱ���ַ��� yyyyMMdd HHmmss
	 * @return string
	 */
	public static String getStringToday() {
		Date currentTime = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd HHmmss");
		String dateString = formatter.format(currentTime);
	  
		return dateString;
	}
	 
	/**
	 * ��ȡ��ǰʱ��Сʱ��
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
	 * ��ȡ��ǰʱ�������
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
	   * ��ȡ�û�ָ����ʽ������
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
	  * ȡδ����
	  * @param nowdate ��������
	  * @param delay ��������
	  * @return δ����
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
     * ȡָ�����ڵ���ĩ��
     * 
     * @param _date ָ������
     * @return ��ĩ��
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
     * ȡָ������+ָ�������������
     * <p>
     * addMonths(2008/01/30, 2) = 2008/03/30<br>
     * addMonths(2008/01/30, 1) = 2008/02/29<br>
     * addMonths(2008/03/30, -1) = 2008/02/29
     * </p>
     * 
     * @param _date ָ������
     * @param _amount ��������
     * @return ��������������
     */
    public static Date addMonths(Date _date, int _amount) {
        return org.apache.commons.lang3.time.DateUtils.addMonths(_date, _amount);
    }

    /**
     * ָ������+ָ�������������
     * 
     * @param _date ָ������
     * @param _amount ��������
     * @return ��������������
     */
    public static Date addYears(Date _date, int _amount) {
        return org.apache.commons.lang3.time.DateUtils.addYears(_date, _amount);
    }

    /**
     * ȡ�����ڵ�ָ����ʽ
     * 
     * @param _date ����
     * @param _format ָ����ʽ
     * @return ��ʽ���������
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
	   // ���12�µ����һ�ܺ�������һ�ܵĻ������һ�ܼ���������ĵ�һ��
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
	  // ��ת��Ϊʱ��
	  Date dd = DateUtil.strToDate(sdate);
	  Calendar c = Calendar.getInstance();
	  c.setTime(dd);
	  if (num.equals("1")) // ��������һ���ڵ�����
	   c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
	  else if (num.equals("2")) // �������ڶ����ڵ�����
	   c.set(Calendar.DAY_OF_WEEK, Calendar.TUESDAY);
	  else if (num.equals("3")) // �������������ڵ�����
	   c.set(Calendar.DAY_OF_WEEK, Calendar.WEDNESDAY);
	  else if (num.equals("4")) // �������������ڵ�����
	   c.set(Calendar.DAY_OF_WEEK, Calendar.THURSDAY);
	  else if (num.equals("5")) // �������������ڵ�����
	   c.set(Calendar.DAY_OF_WEEK, Calendar.FRIDAY);
	  else if (num.equals("6")) // �������������ڵ�����
	   c.set(Calendar.DAY_OF_WEEK, Calendar.SATURDAY);
	  else if (num.equals("0")) // �������������ڵ�����
	   c.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
	  return new SimpleDateFormat("yyyy-MM-dd").format(c.getTime());
	 }
	 
	  
	 public static String getWeek(String sdate) {
	  // ��ת��Ϊʱ��
	  Date date = DateUtil.strToDate(sdate);
	  Calendar c = Calendar.getInstance();
	  c.setTime(date);
	  // int hour=c.get(Calendar.DAY_OF_WEEK);
	  // hour�д�ľ������ڼ��ˣ��䷶Χ 1~7
	  // 1=������ 7=����������������
	  return new SimpleDateFormat("EEEE").format(c.getTime());
	 }
	 public static String getWeekStr(String sdate){
	  String str = "";
	  str = DateUtil.getWeek(sdate);
	  if("1".equals(str)){
	   str = "������";
	  }else if("2".equals(str)){
	   str = "����һ";
	  }else if("3".equals(str)){
	   str = "���ڶ�";
	  }else if("4".equals(str)){
	   str = "������";
	  }else if("5".equals(str)){
	   str = "������";
	  }else if("6".equals(str)){
	   str = "������";
	  }else if("7".equals(str)){
	   str = "������";
	  }
	  return str;
	 }
	 
	  
	 public static long getDays(String date1, String date2) {
	  if (date1 == null || date1.equals(""))
	   return 0;
	  if (date2 == null || date2.equals(""))
	   return 0;
	  // ת��Ϊ��׼ʱ��
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
	  // ȡ��ʱ�������µ�һ��
	  sdate = sdate.substring(0, 8) + "01";
	 
	  // �õ�����µ�1�������ڼ�
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
//	  String s_nd = dateString.substring(0, 4); // ���
//	  String s_yf = dateString.substring(5, 7); // �·�
//	  String s_rq = dateString.substring(8, 10); // ����
//	  String sreturn = "";
//	  roc.util.MyChar mc = new roc.util.MyChar();
//	  if (sdate == null || sdate.equals("") || !mc.Isdate(sdate)) { // �����ֵ���
//	   if (nd.equals("1")) {
//	    sreturn = s_nd;
//	    // ��������
//	    if (format.equals("1"))
//	     sreturn = sreturn + "��";
//	    else if (format.equals("2"))
//	     sreturn = sreturn + "-";
//	    else if (format.equals("3"))
//	     sreturn = sreturn + "/";
//	    else if (format.equals("5"))
//	     sreturn = sreturn + ".";
//	   }
//	   // �����·�
//	   if (yf.equals("1")) {
//	    sreturn = sreturn + s_yf;
//	    if (format.equals("1"))
//	     sreturn = sreturn + "��";
//	    else if (format.equals("2"))
//	     sreturn = sreturn + "-";
//	    else if (format.equals("3"))
//	     sreturn = sreturn + "/";
//	    else if (format.equals("5"))
//	     sreturn = sreturn + ".";
//	   }
//	   // ��������
//	   if (rq.equals("1")) {
//	    sreturn = sreturn + s_rq;
//	    if (format.equals("1"))
//	     sreturn = sreturn + "��";
//	   }
//	  } else {
//	   // ���ǿ�ֵ��Ҳ��һ���Ϸ�������ֵ�����Ƚ���ת��Ϊ��׼��ʱ���ʽ
//	   sdate = roc.util.RocDate.getOKDate(sdate);
//	   s_nd = sdate.substring(0, 4); // ���
//	   s_yf = sdate.substring(5, 7); // �·�
//	   s_rq = sdate.substring(8, 10); // ����
//	   if (nd.equals("1")) {
//	    sreturn = s_nd;
//	    // ��������
//	    if (format.equals("1"))
//	     sreturn = sreturn + "��";
//	    else if (format.equals("2"))
//	     sreturn = sreturn + "-";
//	    else if (format.equals("3"))
//	     sreturn = sreturn + "/";
//	    else if (format.equals("5"))
//	     sreturn = sreturn + ".";
//	   }
//	   // �����·�
//	   if (yf.equals("1")) {
//	    sreturn = sreturn + s_yf;
//	    if (format.equals("1"))
//	     sreturn = sreturn + "��";
//	    else if (format.equals("2"))
//	     sreturn = sreturn + "-";
//	    else if (format.equals("3"))
//	     sreturn = sreturn + "/";
//	    else if (format.equals("5"))
//	     sreturn = sreturn + ".";
//	   }
//	   // ��������
//	   if (rq.equals("1")) {
//	    sreturn = sreturn + s_rq;
//	    if (format.equals("1"))
//	     sreturn = sreturn + "��";
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
//	  // ����/��ת��Ϊ��-��
//	  sdate = VeStr.Replace(sdate, "/", "-");
//	  // ���ֻ��8λ���ȣ���Ҫ����ת��
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
