package com.posbravo.model;

// Generated Jun 10, 2014 6:20:56 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * CreditCardInfo generated by hbm2java
 */
public class CreditCardInfo implements java.io.Serializable {

	private Integer creditCardInfoId;
	private Address address;
	private int recordNo;
	private Integer lastFourDigits;
	private Integer creditCard;
	private Date dateExpired;
	private String firstName;
	private String lastName;
	private Integer firstSixDigits;
	private String cardType;
	private Set payments = new HashSet(0);

	public CreditCardInfo() {
	}

	public CreditCardInfo(int recordNo) {
		this.recordNo = recordNo;
	}

	public CreditCardInfo(Address address, int recordNo,
			Integer lastFourDigits, Integer creditCard, Date dateExpired,
			String firstName, String lastName, Integer firstSixDigits,
			String cardType, Set payments) {
		this.address = address;
		this.recordNo = recordNo;
		this.lastFourDigits = lastFourDigits;
		this.creditCard = creditCard;
		this.dateExpired = dateExpired;
		this.firstName = firstName;
		this.lastName = lastName;
		this.firstSixDigits = firstSixDigits;
		this.cardType = cardType;
		this.payments = payments;
	}

	public Integer getCreditCardInfoId() {
		return this.creditCardInfoId;
	}

	public void setCreditCardInfoId(Integer creditCardInfoId) {
		this.creditCardInfoId = creditCardInfoId;
	}

	public Address getAddress() {
		return this.address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getRecordNo() {
		return this.recordNo;
	}

	public void setRecordNo(int recordNo) {
		this.recordNo = recordNo;
	}

	public Integer getLastFourDigits() {
		return this.lastFourDigits;
	}

	public void setLastFourDigits(Integer lastFourDigits) {
		this.lastFourDigits = lastFourDigits;
	}

	public Integer getCreditCard() {
		return this.creditCard;
	}

	public void setCreditCard(Integer creditCard) {
		this.creditCard = creditCard;
	}

	public Date getDateExpired() {
		return this.dateExpired;
	}

	public void setDateExpired(Date dateExpired) {
		this.dateExpired = dateExpired;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getFirstSixDigits() {
		return this.firstSixDigits;
	}

	public void setFirstSixDigits(Integer firstSixDigits) {
		this.firstSixDigits = firstSixDigits;
	}

	public String getCardType() {
		return this.cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public Set getPayments() {
		return this.payments;
	}

	public void setPayments(Set payments) {
		this.payments = payments;
	}

}
