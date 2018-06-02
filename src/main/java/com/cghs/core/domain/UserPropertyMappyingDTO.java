package com.cghs.core.domain;

import java.io.Serializable;
import java.util.Date;


public class UserPropertyMappyingDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	

    private Long id;
	
	private Long userId;
	private Long peropertyId;
	private short occupancyStatus;
	private Date startDate;
	private Date endDate;
	private short userStatus;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getUserid() {
		return userId;
	}
	public void setUserid(Long userid) {
		this.userId = userid;
	}
	public Long getPeropertyid() {
		return peropertyId;
	}
	public void setPeropertyid(Long peropertyid) {
		this.peropertyId = peropertyid;
	}
	public short getOccupancyStatus() {
		return occupancyStatus;
	}
	public void setOccupancyStatus(short occupancyStatus) {
		this.occupancyStatus = occupancyStatus;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartdate(Date startdate) {
		this.startDate = startdate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEnddate(Date endDate) {
		this.endDate = endDate;
	}
	public short getUserStatus() {
		return userStatus;
	}
	public void setUserStatus(short userStatus) {
		this.userStatus = userStatus;
	}
	public UserPropertyMappyingDTO(Long id, Long userid, Long peropertyid, short occupancyStatus, Date startdate,
			Date enddate, short userStatus) {
		super();
		this.id = id;
		this.userId = userid;
		this.peropertyId = peropertyid;
		this.occupancyStatus = occupancyStatus;
		this.startDate = startdate;
		this.endDate = enddate;
		this.userStatus = userStatus;
	}
	public UserPropertyMappyingDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "UserPropertyMappying [id=" + id + ", userid=" + userId + ", peropertyid=" + peropertyId
				+ ", occupancyStatus=" + occupancyStatus + ", startdate=" + startDate + ", enddate=" + endDate
				+ ", userStatus=" + userStatus + "]";
	}
	
	
	

}
