package com.alataf.location.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

//mapping this model class with database using annotation
//now it is a JPA entity
@Entity
public class Location {
	
	@Id
	@Column(name="id")
	private int locId;
	@Column(name="code")
	private String locCode;
	@Column(name="name")
	private String locName;
	@Column(name="type")
	private String locType;
	
	public int getLocId() {
		return locId;
	}
	public void setLocId(int locId) {
		this.locId = locId;
	}
	public String getLocCode() {
		return locCode;
	}
	public void setLocCode(String locCode) {
		this.locCode = locCode;
	}
	public String getLocName() {
		return locName;
	}
	public void setLocName(String locName) {
		this.locName = locName;
	}
	public String getLocType() {
		return locType;
	}
	public void setLocType(String locType) {
		this.locType = locType;
	}
	
	@Override
	public String toString() {
		return "Location [locId=" + locId + ", locCode=" + locCode + ", locName=" + locName + ", locType=" + locType
				+ "]";
	}
}
