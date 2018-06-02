package com.cghs.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.cghs.core.domain.AssetDTO;
import com.cghs.core.service.AssetService;



@RestController
@RequestMapping("/cghs/asset/api/v1")
public class RestAsset {
	
	@Autowired
	AssetService service;
	

@RequestMapping(value = {"/findbysoc" }, method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
public List<AssetDTO> findBySocietyId(@RequestParam(name="socId", required=true) Long socId){
	return service.findBySocietyId(socId);
}

@RequestMapping(value = {"/byproperty" }, method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})	
public	List<AssetDTO> findByPropertyId(@RequestParam(name="propertyId", required=true) Long propertyId){
	return service.findByPropertyId(propertyId);
}

@RequestMapping(value = {"/bysoctype" }, method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})	
public List<AssetDTO> findBySocietyIdAndAssetType(@RequestParam(name="societyId", required=true) Long societyId,
		@RequestParam(name="assetType", required=true) Short assetType){
	return service.findBySocietyIdAndAssetType(societyId, assetType);	
	}
	
@RequestMapping(value = {"/byuser" }, method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})	
public	List<AssetDTO> findByUserId(@RequestParam(name="userId", required=true) Long userId){
	return service.findByUserId(userId);
}

@RequestMapping(value = {"/bysocandstatus" }, method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
public List<AssetDTO> findBySocietyIdAndStatus(Long societyId,short staus){
	return service.findBySocietyIdAndStatus(societyId, staus);
}
	
@RequestMapping(value = {"/bysocandid" }, method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
public List<AssetDTO> findBySocietyIdAndAssetIdentifier(@RequestParam(name="societyId", required=true) Long societyId,
			@RequestParam(name="assetIdentifier", required=true) String assetIdentifier){
	return service.findBySocietyIdAndAssetIdentifier(societyId, assetIdentifier);
}
	
	
/*add and edit below*/
@RequestMapping(value = {"/save" }, method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_VALUE})
public AssetDTO saveOrUpdate(@RequestBody AssetDTO asset, UriComponentsBuilder ucBuilder){
	return service.saveOrUpdate(asset);
}

@RequestMapping(value = {"/delete" }, method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_VALUE})
public void deleteAsset(@RequestBody AssetDTO asset, UriComponentsBuilder ucBuilder){
	service.deleteAsset(asset);
}

@RequestMapping(value = {"/deletebyid" }, method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
public void deleteById(Long id){
	service.deleteById(id);
}
	
	
}
