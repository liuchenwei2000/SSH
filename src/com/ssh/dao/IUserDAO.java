/**
 * 
 */
package com.ssh.dao;

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
public interface IUserDAO {

	public String getUserName();
	
	public String addUser(User user);
}
