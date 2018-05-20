package com.cghs.core.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cghs.core.repository.PropertyRepository;
import com.cghs.jpa.repository.entity.Asset;
import com.cghs.jpa.repository.entity.Property;

@Service
public class PropertyService{
	
	@Autowired
	PropertyRepository repos;
	
	public List<Property> findAll(){
		return repos.findAll();
	}
	
	public Optional<Property> findById(Long id){
		return repos.findById(id);
	}
	
	public List<Property> findBySocietyId(Long id){
		return repos.findBySocietyId(id);
	}
	
	public Property findBySocietyAndBlockAndHouse(Long societyId,String block,String hNo){
		return repos.findBySocietyIdAndBlockAndHouseNumber(societyId, block, hNo);
	}

	public List<Property> findBySocietyAndBlock(Long id,String block){
		return repos.findBySocietyIdAndBlock(id, block);
	}
	
	public List<Property> findBySocietyAndType(Long id,String type){
		return repos.findBySocietyIdAndType(id, type);
	}
	
	public List<Property> findBySocietyAndBlockAndType(Long id,String block,String type){
		return repos.findBySocietyIdAndBlock(id, block);
	}
	
	
	/*add and edit below*/
	
	
	public Property saveOrUpdate(Property prop){
		return repos.save(prop);
	}
	
	public void deleteAsset(Property prop){
		 repos.delete(prop);
	}
	
	public void deleteById(Long id){
		 repos.deleteById(id);
	}
}
