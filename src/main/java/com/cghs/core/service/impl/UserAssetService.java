package com.cghs.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cghs.core.repository.UserPropertyRepository;

@Service
public class UserAssetService {

	@Autowired
	UserPropertyRepository repos;
	
}
