package com.ms.repo;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.ms.Utility;
import com.ms.entity.User;

public class UserRepository {
	
	private SessionFactory sessionFactory;
	
	public UserRepository() {
		sessionFactory=Utility.getSessionFactory();
	}

	public User saveUser(User user) {
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(user);
		transaction.commit();
		session.close();
		return user;
	}
	public User updateUser(User user) {
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		session.update(user);
		transaction.commit();
		session.close();
		return user;
	}	
	public User deleteUser(String userId) {
		User user=findById(userId);
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		session.delete(user);
		transaction.commit();
		session.close();
		return user;
	}
	public User findById(String user_id) {
		Session session=sessionFactory.openSession();
		User user=session.get(User.class, user_id);
		session.close();
		return user;
	}
	public List<User> findAll(){
		Session session=sessionFactory.openSession();
		Criteria criteria=session.createCriteria(User.class);
		List<User> users=criteria.list();
		return users;
	}
	
	//we will write many more as per requirement.
	
}
