/**
 * 
 */
package com.ssh.dao;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.ssh.util.IDGenerator;
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
@Repository
public class UserDAOImpl implements IUserDAO {
	
	private static Logger logger = Logger.getLogger(UserDAOImpl.class);

	@Resource
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	@Override
	public List<User> getAllUser() {
		logger.debug("Enter com.ssh.dao.UserDAOImpl.getAllUser()...");
		Query query = getSession().createQuery("from User");
		
		List<User> users = query.list();
		
		return users;
	}

	@Override
	public String addUser(User user) {
		logger.debug("Enter com.ssh.dao.UserDAOImpl.addUser()...");
		if (user == null) {
			logger.error("User cannot be null.");
			throw new IllegalArgumentException("User cannot be null.");
		}
		user.setId(IDGenerator.gen36());
		String id = (String) getSession().save(user);
		return "id:" + id;
	}
	
	public void deleteUser(String userid) {
		Object user = getSession().load(User.class, userid);
		if (user != null) {
			getSession().delete(user);
		}
	}

	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}
}
