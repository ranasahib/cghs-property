package com.cghs.core.domain;

import java.io.Serializable;


public class PropertyDTO implements Serializable{
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

    private Long id;
    private Long societyId;
    
    private Double effectiveArea;
    private String houseNumber;
    private String type;
    private String block;
    private short floor;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getSocietyid() {
		return societyId;
	}
	public void setSocietyid(Long societyid) {
		this.societyId = societyid;
	}
	public Double getEffectiveArea() {
		return effectiveArea;
	}
	public void setEffectiveArea(Double effectiveArea) {
		this.effectiveArea = effectiveArea;
	}
	public String getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getBlock() {
		return block;
	}
	public void setBlock(String block) {
		this.block = block;
	}
	public short getFloor() {
		return floor;
	}
	public void setFloor(short floor) {
		this.floor = floor;
	}
	
	public PropertyDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PropertyDTO(Long id, Long societyid, Double effectiveArea, String houseNumber, String type, String block,
			short floor) {
		super();
		this.id = id;
		this.societyId = societyid;
		this.effectiveArea = effectiveArea;
		this.houseNumber = houseNumber;
		this.type = type;
		this.block = block;
		this.floor = floor;
	}
	@Override
	public String toString() {
		return "Property [id=" + id + ", societyid=" + societyId + ", effectiveArea=" + effectiveArea + ", houseNumber="
				+ houseNumber + ", type=" + type + ", block=" + block + ", floor=" + floor + "]";
	}
    
    

}
