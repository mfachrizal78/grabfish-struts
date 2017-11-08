package com.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * @author Rizal
 *
 */
@Entity
@Table(name="Order")
public class Order extends CommonModel implements Serializable { 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType. AUTO)  
	@Column(name = "schedule_id", unique = true, nullable = false)
	private Long order_id;	
	@Column(name = "date") 
	private Long seller_id;
	@Column(name = "date") 	
	private Long buyer_id;	
	@Temporal(TemporalType.DATE)
	@Column(name = "date") 
	private Date date;
	@Column(name = "date") 
	private Long product_type_id;	
	private int quantity;	
	@Column(name = "date") 
	private String currency;
	@Column(name = "date") 
	private Long price;	
	@Column(name = "date") 
	private String destination;
	@Column(name = "date") 
	private Long schedule_id;
	@Column(name = "date") 
	private String payment_status;
	@Column(name = "date") 
	private String shipping_status;
	
	
}
