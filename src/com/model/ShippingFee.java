package com.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class ShippingFee extends CommonModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType. AUTO)  
	@Column(name = "shipping_fee_id", unique = true, nullable = false)
	private Long shipping_fee_id;
	@Column(name = "shipping_destination_id")	
	private Long shipping_destination_id;
	@Column(name = "product_id")	
	private Long productId;
	@Column(name = "shipping_currency")	
	private Long shippingCurrency;
	@Column(name = "shipping_fee")	
	private Long shippingFee;
	@Column(name = "transhipper_id")	
	private Long transhipperId;
	@Column(name = "currency_transhipper_fee")	
	private Long currencyTranshipperFee;
	@Column(name = "transhipper_fee")	
	private Long transhipperFee;
	@Column(name = "effective_date")	
	private Date effectiveDate;

	
	










}
