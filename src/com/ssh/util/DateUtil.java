/**
 * 
 */
package com.ssh.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * <p>
 * 
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2015��10��29��
 */
public class DateUtil {

	private static SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	public static Date now(){
		return new Date();
	}
	
	public static String getTs(){
		return formatter.format(now());
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(getTs());
	}
}
