package com.posbravo.model;

// Generated Jan 31, 2014 8:16:08 PM by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Address generated by hbm2java
 */
@Entity
@Table(name = "address", catalog = "posbravo")
public class Address implements java.io.Serializable {

	private Integer addressId;
	private String streetAd;
	private Integer unitNo;
	private String zoneId;

	public Address() {
	}

	public Address(String streetAd, Integer unitNo, String zoneId) {
		this.streetAd = streetAd;
		this.unitNo = unitNo;
		this.zoneId = zoneId;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "AddressId", unique = true, nullable = false)
	public Integer getAddressId() {
		return this.addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	@Column(name = "StreetAd")
	public String getStreetAd() {
		return this.streetAd;
	}

	public void setStreetAd(String streetAd) {
		this.streetAd = streetAd;
	}

	@Column(name = "UnitNo")
	public Integer getUnitNo() {
		return this.unitNo;
	}

	public void setUnitNo(Integer unitNo) {
		this.unitNo = unitNo;
	}

	@Column(name = "ZoneId")
	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
	}

}