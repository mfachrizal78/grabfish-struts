package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.User;
 
/**
 * @author Rizal
 *
 */
@Repository("userDao")  
public class UserDaoImpl implements UserDao {

	@Autowired  
	private SessionFactory sessionFactory;  
	
	@Override
	public void saveUser(User user) {
		sessionFactory.getCurrentSession().saveOrUpdate(user);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> getUserList() {
		return (List<User>) sessionFactory.getCurrentSession().createCriteria(User.class).list();
	}
	
	@Override
	public User getUser(User user) {
		user = (User)sessionFactory.getCurrentSession().get(User.class, user.getUserId());
		return user;
	}
 

	@Override
	public User findByUsername(String username) { 
		Query query = sessionFactory.getCurrentSession().createQuery("from User where username=?");
		query.setParameter(0,username);
		
		List list = query.list();
		if (list.size()>0)
			return (User)list.get(0);
		
		return null;
 	} 

}
