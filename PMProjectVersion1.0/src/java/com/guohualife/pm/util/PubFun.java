package com.guohualife.pm.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**  
 * 创建时间：2015-8-14 下午1:29:43  
 * 项目名称：TestSpringVersion3.3  
 * @author lixm  
 * @version 1.0   
 * @since JDK 1.5.0_22 
 * 文件名称：PubFun.java  
 * 类说明：  
 */
public class PubFun {
   /**
    *  @return: Date
    *  得到系统当前日期 
    */
   public static Date getCurrentDate(){
     Calendar cal = Calendar.getInstance();
     Date date = cal.getTime();
     return  date;
   }
   
   /**
    *  @return: int
    *  得到系统当前年 
    */
   public static int getCurrentYear(){
     Calendar cal = Calendar.getInstance();
     int year = cal.get(Calendar.YEAR);
     return  year;
   }
   
   /**
    *  @return: int
    *  得到系统当前月 
    */
   public static int getCurrentMonth(){
     Calendar cal = Calendar.getInstance();
     int month = cal.get(Calendar.MONTH);
     return  month;
   }
   
   /**
    *  @return: String
    *  得到系统当前时间
    */
   public static String getCurrentTime(){
      SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");
      String time = df.format(new Date());
      return time;
   }
   public static void main(String[] args) {
     System.out.println("ll"+getCurrentTime());
  }
}

