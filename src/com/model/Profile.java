package com.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import org.hibernate.annotations.GenericGenerator;

/**
 * @author Rizal
 *
 */
@Entity
@Table(name="Profile")
public class Profile extends CommonModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//@Id  
	//@Column(name = "user_id")
	
	@GenericGenerator(name = "generator", strategy = "foreign",
	parameters = @Parameter(name = "property", value = "user"))
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "user_id", unique = true, nullable = false)
	private Long userId;
	
	@Column(name = "name")
	private String name;
	@Temporal(TemporalType.DATE)
	@Column(name = "dob")
	private Date dob;
	@Column(name = "origin")
	private String origin;
	@Column(name = "phone")
	private String phone;
	@Column(name = "Address1")
	private String address1;
	@Column(name = "Address2")
	private String address2;
	@Column(name = "Address3")
	private String address3;
	@Column(name = "postal_code")
	private String postalCode;
	@Column(name = "country")
	private String country;
	@Column(name = "bank_code")
	private String bankCode;
	@Column(name = "account_number")
	private String accountNumber; 
	@Column(name = "account_name")
	private String accountName; 
	
	
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	private User user;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}

	
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getAddress3() {
		return address3;
	}
	public void setAddress3(String address3) {
		this.address3 = address3;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getBankCode() {
		return bankCode;
	}
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	} 
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
