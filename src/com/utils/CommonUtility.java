package com.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
 

/**
 * @author Rizal
 *
 */
public class CommonUtility {
	
	public final static String DATE_FORMAT_SIMPLE = "dd-MM-yyy";
	public final static String DATE_FORMAT_LONG = "dd MMM yyy";
	
//	public static User createModel(UserBean userBean){
//		User user = new User();
//		user.setUserName(userBean.getUserName());
//		user.setUserAge(userBean.getUserAge());
//		user.setUserGender(userBean.getUserGender());
//		user.setUserJobType(userBean.getUserJob());
//		user.setUserHobbies(convertArrayToCsv(userBean.getUserHobbies()));
//		return user;
//	}
//	
//	public static List<UserBean> createUserBeanList(List<User> users){
//		List<UserBean> beans = new ArrayList<UserBean>();
//		UserBean userBean = null;
//		for(User user : users){
//			userBean = new UserBean();
//			userBean.setUserName(user.getUserName());
//			userBean.setUserAge(user.getUserAge());
//			userBean.setUserGender(user.getUserGender());
//			userBean.setUserJob(user.getUserJobType());
//			userBean.setUserHobbies(convertCsvToArr(user.getUserHobbies()));
//			beans.add(userBean);
//		}
//		return beans;
//		
//	}
	public static String convertArrayToCsv(String [] arr){
		String csv = "";
		for(String value : arr){
			csv += value+",";
		}
		return csv;
	}
	public static String[] convertCsvToArr(String csv){
		String [] values = csv.split(",");
		return values;
	}
	
	public static Date parseDate(String date) {
	     return parseDate(date, DATE_FORMAT_SIMPLE);
	  }	
	
	public static Date parseDate(String date, String format) {
	     try {
	         return new SimpleDateFormat(format).parse(date);
	     } catch (ParseException e) {
	         return null;
	     }
	  }		
	
	public static String formatDate(Date date) {
	     return formatDate(date, DATE_FORMAT_SIMPLE);
	  }	
	
	public static String formatDate(Date date, String format) {
	     return new SimpleDateFormat(format).format(date);
	  }			
}
