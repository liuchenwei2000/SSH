/**
 * 
 */
package com.ssh.service;

import com.ssh.vo.User;

/**
 * 
 * <p>
 * 
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2015年10月24日
 */
public interface IUserService {

	public String queryUserName();
	
	public String addNewUser(User user);
}
