package com.cghs.jpa.repository.impl;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.cghs.core.domain.UserPropertyMappyingDTO;
import com.cghs.jpa.entity.UserPropertyMappying;
import com.cghs.jpa.repository.UserPropertyRepository;

public class UserPropReposImpl {

	@Autowired
	UserPropertyRepository repos;
	
	public ModelMapper modelMapper() {
	    return new ModelMapper();
	}
	
	List<UserPropertyMappyingDTO> findByUserId(Long userid){
		return convertToDtos(repos.findByUserId(userid));
	}
	List<UserPropertyMappyingDTO> findByPeropertyId(Long propId){
		return convertToDtos(repos.findByPeropertyId(propId));
	}
	List<UserPropertyMappyingDTO> findByOccupancyStatus(Short status){
		return convertToDtos(repos.findByOccupancyStatus(status));
	}
	List<UserPropertyMappyingDTO> findByUserStatus(Short status){
		return convertToDtos(repos.findByUserStatus(status));
	}
	
	
	UserPropertyMappyingDTO convertToDto(UserPropertyMappying mapEnt){
		return modelMapper().map(mapEnt, UserPropertyMappyingDTO.class);
	}
	
	List<UserPropertyMappyingDTO> convertToDtos(List<UserPropertyMappying> mapEnts){
		List<UserPropertyMappyingDTO> mapEntList = new ArrayList<UserPropertyMappyingDTO>();
		mapEnts.forEach(a-> mapEntList.add(modelMapper().map(a, UserPropertyMappyingDTO.class)));
		return mapEntList;
	}
	
	
	UserPropertyMappying convertToEntity(UserPropertyMappyingDTO mapEnt){
		return modelMapper().map(mapEnt, UserPropertyMappying.class);
	}
}
