/**
 * 
 */
package com.ssh.dao;

import java.util.List;

import javax.annotation.Resource;

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

	@Resource
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	@Override
	public List<User> getAllUser() {
		Query query = getSession().createQuery("from User");
		
		List<User> users = query.list();
		
		return users;
	}

	@Override
	public String addUser(User user) {
		if (user == null) {
			throw new IllegalArgumentException("User cannot be null.");
		}
		user.setId(IDGenerator.gen36());
		String id = (String) getSession().save(user);
		return "id:" + id;
	}

	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}
}
