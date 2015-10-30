/**
 * 
 */
package com.ssh.dao;

import java.util.List;

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

	public List<User> getAllUser();
	
	public String addUser(User user);
	
	public void deleteUser(String userid);
}
