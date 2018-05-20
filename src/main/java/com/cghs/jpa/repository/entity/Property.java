package com.cghs.jpa.repository.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="property")
public class Property implements Serializable{
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
	
	public Property() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Property(Long id, Long societyid, Double effectiveArea, String houseNumber, String type, String block,
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
