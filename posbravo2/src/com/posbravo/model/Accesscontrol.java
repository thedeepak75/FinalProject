package com.posbravo.model;

// Generated Jan 31, 2014 8:16:08 PM by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Accesscontrol generated by hbm2java
 */
@Entity
@Table(name = "accesscontrol", catalog = "posbravo")
public class Accesscontrol implements java.io.Serializable {

	private Integer accessControlId;
	private String accessControlName;

	public Accesscontrol() {
	}

	public Accesscontrol(String accessControlName) {
		this.accessControlName = accessControlName;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "AccessControlID", unique = true, nullable = false)
	public Integer getAccessControlId() {
		return this.accessControlId;
	}

	public void setAccessControlId(Integer accessControlId) {
		this.accessControlId = accessControlId;
	}

	@Column(name = "AccessControlName")
	public String getAccessControlName() {
		return this.accessControlName;
	}

	public void setAccessControlName(String accessControlName) {
		this.accessControlName = accessControlName;
	}

}