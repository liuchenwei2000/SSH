/**
 * 
 */
package com.ssh.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssh.dao.IUserDAO;
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
@Service
@Transactional
public class UserServiceImpl implements IUserService {
	
	@Resource
	private IUserDAO userDao;

	@Override
	@Transactional(readOnly = true)
	public List<User> getAllUser() {
		return userDao.getAllUser();
	}

	@Override
	public String addNewUser(User user) {
		return userDao.addUser(user);
	}
}
