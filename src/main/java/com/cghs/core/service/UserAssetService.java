package com.cghs.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cghs.jpa.repository.UserPropertyRepository;

@Service
public class UserAssetService {

	@Autowired
	UserPropertyRepository repos;
	
}
