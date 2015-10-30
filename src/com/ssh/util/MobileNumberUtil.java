/**
 * 
 */
package com.ssh.util;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/**
 * 
 * <p>
 * 
 * 
 * @author 刘晨伟
 * 
 * 创建日期：20"15年10月29日
 */
public class MobileNumberUtil {
	
	public static final int OPERATOR_CM = 0;
	public static final int OPERATOR_CU = 1;
	public static final int OPERATOR_CT = 2;

	private static final Set<String> NO_CM = new HashSet<String>(Arrays.asList("134", "135", "136", "137", "138", "139",
			"147", "150", "151", "152", "157", "158", "159", "178", "182", "183", "184", "187", "188"));

	private static final Set<String> NO_CU = new HashSet<String>(
			Arrays.asList("130", "131", "132", "155", "156", "185", "186", "145", "176"));

	private static final Set<String> NO_CT = new HashSet<String>(
			Arrays.asList("133", "153", "177", "180", "181", "189"));

	private static final String REGEX_MOBILE = "^((13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$";

	public static boolean validate(String mobile) {
		return validateLength(mobile) && Pattern.matches(REGEX_MOBILE, mobile);
	}

	private static boolean validateLength(String mobile) {
		return mobile.trim().length() == 11;
	}

	public static int getOperator(String mobile) {
		String no = mobile.substring(0, 3);
		if (NO_CM.contains(no)) {
			return OPERATOR_CM;
		} else if (NO_CU.contains(no)) {
			return OPERATOR_CU;
		}else if (NO_CT.contains(no)) {
			return OPERATOR_CT;
		}
		throw new IllegalArgumentException(mobile + " 号码有误");
	}

	public static void main(String[] args) {
		System.out.println(validate("15098831739"));
		System.out.println(validate("18678833705"));
		System.out.println(validate("18678839548"));
		System.out.println(validate("1233222123"));
		System.out.println(validate("28678839548"));
		System.out.println(validate("18978839548"));
		
		System.out.println(getOperator("15098831739"));
		System.out.println(getOperator("18678833705"));
		System.out.println(getOperator("18678839548"));
		System.out.println(getOperator("18978839548"));
		System.out.println(getOperator("1233222123"));
		System.out.println(getOperator("28678839548"));
	}
}
