package com.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Rizal
 *
 */
@Entity
@Table(name="Code")
public class Code extends CommonModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)  
	@Column(name = "code_id", unique = true, nullable = false)
	private Long codeId;
	@Column(name = "code_group")
	private String codeGroup;
	@Column(name = "code")
	private String code;
	@Column(name = "value1")
	private String value1;
	@Column(name = "value2")
	private String value2;
	@Column(name = "order_no")
	private String orderNo;
	@Column(name = "tag1")
	private String tag1;
	@Column(name = "tag2")
	private String tag2;
	@Column(name = "tag3")
	private String tag3;
	
	public Long getCodeId() {
		return codeId;
	}
	public void setCodeId(Long codeId) {
		this.codeId = codeId;
	}
	public String getCodeGroup() {
		return codeGroup;
	}
	public void setCodeGroup(String codeGroup) {
		this.codeGroup = codeGroup;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getValue1() {
		return value1;
	}
	public void setValue1(String value1) {
		this.value1 = value1;
	}
	public String getValue2() {
		return value2;
	}
	public void setValue2(String value2) {
		this.value2 = value2;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getTag1() {
		return tag1;
	}
	public void setTag1(String tag1) {
		this.tag1 = tag1;
	}
	public String getTag2() {
		return tag2;
	}
	public void setTag2(String tag2) {
		this.tag2 = tag2;
	}
	public String getTag3() {
		return tag3;
	}
	public void setTag3(String tag3) {
		this.tag3 = tag3;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

  
	
	
} 