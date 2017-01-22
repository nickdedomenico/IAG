package com.pnc.iag.dao;


import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.pnc.iag.entity.User;

@Repository
public class UserDAOImpl implements UserDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public User getUser(String userID) {
		Query<User> query = sessionFactory.
			      getCurrentSession().
			      createQuery("from User where userID = :userID",User.class);
			    query.setParameter("userID", userID);
			    
			    List<User> users = query.getResultList();
			    
			    if(users.size() == 0) {
			    	return null;
			    }
			    return users.get(0);

	}
}