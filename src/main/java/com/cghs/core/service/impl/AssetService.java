package com.cghs.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cghs.core.repository.AssetRepository;
import com.cghs.jpa.repository.entity.Asset;

@Service
public class AssetService {

	@Autowired
	AssetRepository repos;
	
	public List<Asset> findBySocietyId(Long societyId){
		return repos.findBySocietyId(societyId);
	}
	
	public List<Asset> findByPropertyId(Long propertyId){
		return repos.findByPropertyId(propertyId);
	}
	
	public List<Asset> findBySocietyIdAndAssetType(Long societyId,short assetType){
		return repos.findBySocietyIdAndAssetType(societyId, assetType);
	}
	
	public List<Asset> findByUserId(Long userId){
		return repos.findByUserId(userId);
	}
	
	public List<Asset> findBySocietyIdAndStatus(Long societyId,short staus){
		return repos.findBySocietyIdAndStatus(societyId, staus);
	}
	
	public List<Asset> findBySocietyIdAndAssetIdentifier(Long societyId,String assetIdentifier){
		return repos.findBySocietyIdAndAssetIdentifier(societyId, assetIdentifier);
	}
	
	/*add and edit below*/
	
	public Asset saveOrUpdate(Asset asset){
		return repos.save(asset);
	}
	
	public void deleteAsset(Asset asset){
		 repos.delete(asset);
	}
	
	public void deleteById(Long id){
		 repos.deleteById(id);
	}
	

	
}
