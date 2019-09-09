package com.wangtao.common.utils;

public class StringUtil {
	
	public static String toHtml(String text){
		
		String str = text.replaceAll(System.getProperty("line.reparator"), "|");
		String[] split = str.split("|");
		String newStr = "";
		for (String string : split) {
			newStr+="<p>"+string+"</p>";
		}
		return newStr;
	}
	
	/**
	 * 
	 * @Title: hasText 
	 * @Description: TODO
	 * @param src
	 * @return
	 * @return: boolean
	 */
	
	public static boolean hasText(String src) {
		
		//测试是否为空
		return null != src&&src.trim().length()>0;
		
	}
	/**
	 * 
	 * @Title: isPhone 
	 * @Description: TODO
	 * @param phone
	 * @return
	 * @return: boolean
	 */
	public static boolean isPhone(String phone) {
		//如果为空返回false，否则true
		if(!hasText(phone)) {
			return false;
		}
		
		String reg ="[1][1-9] {2}[0-9] {8}";
		return phone.matches(reg);
		
		
	}
	/**
	 * 
	 * @Title: isEmail 
	 * @Description: TODO
	 * @param email
	 * @return
	 * @return: boolean
	 */
	public static boolean isEmail(String email) {
		//如果为空返回false，否则true
		if(!hasText(email)) {
			return false;
		}
		
		String reg ="[1-9] {8}+@qq.com";
		return email.matches(reg);
	}
}
