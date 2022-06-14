package com.zensar.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.bean.OlxUser;
import com.zensar.db.OlxUsersDAO;

@Service

public class OlxUserService {
	
	@Autowired
	OlxUsersDAO dao;
	
	public OlxUser addOlxUser(OlxUser olxUser) {
		return this.dao.save(olxUser);
	}
	
	public OlxUser findByUser(String username) {
		return this.dao.findByUserName(username);
	}
	
	public OlxUser findUserById(int id) {
		Optional<OlxUser> optional=this.dao.findById(id);
		if(optional.isPresent())
			return optional.get();
		return null;
	}

}
