/**
 * 
 */
package com.ssh.service;

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
public interface IUserService {

	public List<User> getAllUser();
	
	public String addNewUser(User user);
	
	public void deleteUser(String userid);
}
