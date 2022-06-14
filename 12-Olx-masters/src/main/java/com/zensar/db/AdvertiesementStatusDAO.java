package com.zensar.db;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zensar.bean.AdvertisementStatus;

@Repository

public interface AdvertiesementStatusDAO extends JpaRepository<AdvertisementStatus, Integer>{
	

}
