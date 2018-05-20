package com.cghs.core.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cghs.jpa.repository.entity.Asset;
import com.cghs.jpa.repository.entity.Property;

public interface AssetRepository extends JpaRepository<Asset, Long>{
	List<Asset> findBySocietyId(Long societyId);
	
	List<Asset> findByPropertyId(Long propertyId);
	
	List<Asset> findBySocietyIdAndAssetType(Long societyId,short assetType);
	
	List<Asset> findByUserId(Long userId);
	
	List<Asset> findBySocietyIdAndStatus(Long societyId,short staus);
	
	List<Asset> findBySocietyIdAndAssetIdentifier(Long societyId,String assetIdentifier);
	
}
