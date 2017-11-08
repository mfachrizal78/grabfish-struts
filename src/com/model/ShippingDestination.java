package com.model;

import java.io.Serializable;
import java.util.Date;

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
@Table(name="shipping_destination")
public class ShippingDestination extends CommonModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType. AUTO)  
	@Column(name = "shipping_destination_id", unique = true, nullable = false)
	private Long shipping_destination_id;
	@Column(name = "user_id")		
	private Long userId;
	@Column(name = "origin")		
	private String origin;
	@Column(name = "destination")		
	private String destination;
	@Column(name = "effective_date")		
	private Date effectiveDate;

 
}
