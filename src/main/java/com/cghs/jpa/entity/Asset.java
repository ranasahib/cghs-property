package com.cghs.jpa.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="asset")
public class Asset implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long societyId;
    private Long propertyId;
    private short assetType;
    private String assetIdentifier;
    private short status;
    private Long userId;
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
	public Long getPropertyId() {
		return propertyId;
	}
	public void setPropertyId(Long propertyId) {
		this.propertyId = propertyId;
	}
	public short getAssetType() {
		return assetType;
	}
	public void setAssetType(short assetType) {
		this.assetType = assetType;
	}
	public String getAssetIdentifier() {
		return assetIdentifier;
	}
	public void setAssetIdentifier(String assetIdentifier) {
		this.assetIdentifier = assetIdentifier;
	}
	public short getStatus() {
		return status;
	}
	public void setStatus(short status) {
		this.status = status;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserid(Long userid) {
		this.userId = userid;
	}
	public Asset(Long id, Long societyid, Long propertyId, short assetType, String assetIdentifier, short status,
			Long userid) {
		super();
		this.id = id;
		this.societyId = societyid;
		this.propertyId = propertyId;
		this.assetType = assetType;
		this.assetIdentifier = assetIdentifier;
		this.status = status;
		this.userId = userid;
	}
	public Asset() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Asset [id=" + id + ", societyid=" + societyId + ", propertyId=" + propertyId + ", assetType="
				+ assetType + ", assetIdentifier=" + assetIdentifier + ", status=" + status + ", userid=" + userId
				+ "]";
	}
    
    

}
