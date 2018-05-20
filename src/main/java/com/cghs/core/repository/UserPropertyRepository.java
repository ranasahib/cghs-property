package com.cghs.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cghs.jpa.repository.entity.UserPropertyMappying;

public interface UserPropertyRepository extends JpaRepository<UserPropertyMappying, Long>{

}
