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
 * @author ����ΰ
 * 
 * �������ڣ�2015��10��24��
 */
public interface IUserDAO {

	public List<User> getAllUser();
	
	public String addUser(User user);
}
