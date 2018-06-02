package com.cghs.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cghs.jpa.entity.UserPropertyMappying;

public interface UserPropertyRepository extends JpaRepository<UserPropertyMappying, Long>{
	
	List<UserPropertyMappying> findByUserId(Long userid);
	List<UserPropertyMappying> findByPeropertyId(Long propId);
	List<UserPropertyMappying> findByOccupancyStatus(Short status);
	List<UserPropertyMappying> findByUserStatus(Short status);

}
