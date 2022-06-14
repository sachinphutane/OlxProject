package com.zensar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.bean.AdvertisementStatus;
import com.zensar.db.AdvertiesementStatusDAO;

@Service
public class AdvertiesementStatusService {
	
	@Autowired
	AdvertiesementStatusDAO dao;
	
	public AdvertisementStatus addAdvertiesementStatus(AdvertisementStatus advertiesementStatus) {
		return this.dao.save(advertiesementStatus);
		
	}
	
	public List<AdvertisementStatus> getAllAdvertiesementStatus(){
		return this.dao.findAll();
	}
	
	

}
