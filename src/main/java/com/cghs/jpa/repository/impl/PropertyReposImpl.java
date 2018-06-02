package com.cghs.jpa.repository.impl;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.cghs.core.domain.PropertyDTO;
import com.cghs.jpa.entity.Property;
import com.cghs.jpa.repository.PropertyRepository;

public class PropertyReposImpl {

	@Autowired
	PropertyRepository repos;
	
	
	public ModelMapper modelMapper() {
	    return new ModelMapper();
	}
	
	
	List<PropertyDTO> findBySocietyId(Long societyId){
		return convertToDtos(repos.findBySocietyId(societyId));
	}

	PropertyDTO findBySocietyIdAndBlockAndHouseNumber(Long societyId,String block,String hNo){
		return convertToDto(repos.findBySocietyIdAndBlockAndHouseNumber(societyId, block, hNo));
	}

	List<PropertyDTO> findBySocietyIdAndBlock(Long societyId,String block){
		return convertToDtos(repos.findBySocietyIdAndBlock(societyId, block));
	}

	List<PropertyDTO> findBySocietyIdAndBlockAndType(Long societyId,String block,String type){
		return convertToDtos(repos.findBySocietyIdAndBlockAndType(societyId, block, type));
	}

	List<PropertyDTO> findBySocietyIdAndType(Long societyId,String type){
		return convertToDtos(repos.findBySocietyIdAndType(societyId, type));
	}
	
	public PropertyDTO save(PropertyDTO dto){
		return convertToDto(repos.save(convertToEntity(dto)));
	}
	
	public void delete(PropertyDTO dto){
		repos.delete(convertToEntity(dto));
	}
	
	public void deleteById(Long id){
		repos.deleteById(id);
	}
	
	PropertyDTO convertToDto(Property prop){
		return modelMapper().map(prop, PropertyDTO.class);
	}
	
	List<PropertyDTO> convertToDtos(List<Property> props){
		List<PropertyDTO> propList = new ArrayList<PropertyDTO>();
		props.forEach(a-> propList.add(modelMapper().map(a, PropertyDTO.class)));
		return propList;
	}
	
	
	Property convertToEntity(PropertyDTO prop){
		return modelMapper().map(prop, Property.class);
	}
}
