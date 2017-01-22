package com.pnc.iag.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pnc.iag.dao.UserDAO;
import com.pnc.iag.entity.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDAO;
	
	@Override
	@Transactional
	public User getUser(String userID) {
		return userDAO.getUser(userID);
	}

}
