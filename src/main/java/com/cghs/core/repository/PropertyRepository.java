package com.cghs.core.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cghs.jpa.repository.entity.Property;

public interface PropertyRepository extends JpaRepository<Property, Long>{

List<Property> findBySocietyId(Long societyId);

Property findBySocietyIdAndBlockAndHouseNumber(Long societyId,String block,String hNo);

List<Property> findBySocietyIdAndBlock(Long societyId,String block);

List<Property> findBySocietyIdAndBlockAndType(Long societyId,String block,String type);

List<Property> findBySocietyIdAndType(Long societyId,String type);

}
