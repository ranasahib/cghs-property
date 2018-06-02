package com.cghs.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cghs.core.domain.AssetDTO;
import com.cghs.jpa.entity.Asset;
import com.cghs.jpa.repository.AssetRepository;
import com.cghs.jpa.repository.impl.AssetReposImpl;


@Service
public class AssetService {

	@Autowired
	AssetReposImpl repos;
	
	public List<AssetDTO> findBySocietyId(Long societyId){
		return repos.findBySocietyId(societyId);
	}
	
	public List<AssetDTO> findByPropertyId(Long propertyId){
		return repos.findByPropertyId(propertyId);
	}
	
	public List<AssetDTO> findBySocietyIdAndAssetType(Long societyId,short assetType){
		return repos.findBySocietyIdAndAssetType(societyId, assetType);
	}
	
	public List<AssetDTO> findByUserId(Long userId){
		return repos.findByUserId(userId);
	}
	
	public List<AssetDTO> findBySocietyIdAndStatus(Long societyId,short staus){
		return repos.findBySocietyIdAndStatus(societyId, staus);
	}
	
	public List<AssetDTO> findBySocietyIdAndAssetIdentifier(Long societyId,String assetIdentifier){
		return repos.findBySocietyIdAndAssetIdentifier(societyId, assetIdentifier);
	}
	
	/*add and edit below*/
	
	public AssetDTO saveOrUpdate(AssetDTO asset){
		return repos.save(asset);
	}
	
	public void deleteAsset(AssetDTO asset){
		 repos.delete(asset);
	}
	
	public void deleteById(Long id){
		 repos.deleteById(id);
	}
	

	
}
