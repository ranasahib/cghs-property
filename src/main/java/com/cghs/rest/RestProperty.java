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

import com.cghs.core.service.PropertyService;
import com.cghs.jpa.entity.Property;

@RestController
@RequestMapping("/cghs/property/api/v1")
public class RestProperty {

	@Autowired
	PropertyService service;
	
	@RequestMapping(value = {"/find" }, method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public Property find(@RequestParam(name="id", required=true) Long id) {
        return service.findById(id).get();
    }
	
	@RequestMapping(value = {"/all" }, method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public Iterable<Property> findAll() {
        return service.findAll();
    }
	
	@RequestMapping(value = {"/bysoc" }, method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public Iterable<Property> findBySocietyId(@RequestParam(name="id", required=true) Long id) {
        return service.findBySocietyId(id);
    }
	
	@RequestMapping(value = {"/byblock" }, method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public Property findHouse(@RequestParam(name="socId", required=true) Long socId,@RequestParam(name="block", required=true) String block,
    		@RequestParam(name="hNo", required=true) String hNo) {
		return service.findBySocietyAndBlockAndHouse(socId, block, hNo);
    }
	
	@RequestMapping(value = {"/byblocktype" }, method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<Property> findBySocBlockType(@RequestParam(name="socId", required=true) Long socId,
    		@RequestParam(name="block", required=true) String block, @RequestParam(name="type", required=true) String type) {
		return service.findBySocietyAndBlockAndType(socId, block, type);
      
    }
	
	@RequestMapping(value = {"/bytype" }, method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<Property> findSocAndType(@RequestParam(name="socId", required=true) Long socId,@RequestParam(name="type", required=true) String type) {
		return service.findBySocietyAndType(socId, type);
      
    }
	
	
	/*add and edit below*/
	@RequestMapping(value = {"/save" }, method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_VALUE})
	public Property saveOrUpdate(@RequestBody Property prop, UriComponentsBuilder ucBuilder){
		return service.saveOrUpdate(prop);
	}

	@RequestMapping(value = {"/delete" }, method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_VALUE})
	public void deleteAsset(@RequestBody Property prop, UriComponentsBuilder ucBuilder){
		service.deleteAsset(prop);
	}

	@RequestMapping(value = {"/deletebyid" }, method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
	public void deleteById(Long id){
		service.deleteById(id);
	}
	
}
