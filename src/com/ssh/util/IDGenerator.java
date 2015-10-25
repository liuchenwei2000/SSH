/**
 * 
 */
package com.ssh.util;

import java.util.UUID;

/**
 * 
 * <p>
 * 
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2015年10月24日
 */
public class IDGenerator {

	public static String gen36(){
		return UUID.randomUUID().toString();
	}
	
	public static String gen32(){
		return gen36().replaceAll("-", "");
	}
	
	public static String gen32UpperCase(){
		return gen32().toUpperCase();
	}
	
	public static void main(String[] args) {
		System.out.println(gen36());
		System.out.println(gen32());
		System.out.println(gen32UpperCase());
	}
}
