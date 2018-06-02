package com.cghs.jpa.repository.impl;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cghs.core.domain.AssetDTO;
import com.cghs.jpa.entity.Asset;
import com.cghs.jpa.repository.AssetRepository;

@Component
public class AssetReposImpl{

	@Autowired
	AssetRepository repos;
	
	public ModelMapper modelMapper() {
	    return new ModelMapper();
	}
	
	
	public List<AssetDTO> findBySocietyId(Long societyId){
		return convertToDtos(repos.findBySocietyId(societyId));
	}
	
	public List<AssetDTO> findByPropertyId(Long propertyId){
		return convertToDtos(repos.findByPropertyId(propertyId));
	}
	
	public List<AssetDTO> findBySocietyIdAndAssetType(Long societyId,short assetType){
		return convertToDtos(repos.findBySocietyIdAndAssetType(societyId,assetType));
	}
	
	public List<AssetDTO> findByUserId(Long userId){
		return convertToDtos(repos.findByUserId(userId));
	}
	
	public List<AssetDTO> findBySocietyIdAndStatus(Long societyId,short staus){
		return convertToDtos(repos.findBySocietyIdAndStatus(societyId,staus));
	}
	
	public List<AssetDTO> findBySocietyIdAndAssetIdentifier(Long societyId,String assetIdentifier){
		return convertToDtos(repos.findBySocietyIdAndAssetIdentifier(societyId, assetIdentifier));
	}

	
	public AssetDTO save(AssetDTO dto){
		return convertToDto(repos.save(convertToEntity(dto)));
	}
	
	public void delete(AssetDTO dto){
		repos.delete(convertToEntity(dto));
	}
	
	public void deleteById(Long id){
		repos.deleteById(id);
	}
	
	AssetDTO convertToDto(Asset asset){
		return modelMapper().map(asset, AssetDTO.class);
	}
	
	List<AssetDTO> convertToDtos(List<Asset> assets){
		List<AssetDTO> assetDTOs = new ArrayList<AssetDTO>();
		
		assets.forEach(a-> assetDTOs.add(modelMapper().map(a, AssetDTO.class)));
		
/*		for(Asset asset:assets){
			assetDTOs.add(modelMapper().map(asset, AssetDTO.class));
		}*/
		return assetDTOs;
	}
	
	
	Asset convertToEntity(AssetDTO asset){
		return modelMapper().map(asset, Asset.class);
	}
}
