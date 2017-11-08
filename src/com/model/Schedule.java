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
@Table(name="Schedule")
public class Schedule extends CommonModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType. AUTO)  
	@Column(name = "schedule_id", unique = true, nullable = false)
	private Long scheduleId;
	@Column(name = "shipping_destination_id")
	private Long shippingDestinationId;
	@Temporal(TemporalType.DATE)
	@Column(name = "date")	
	private Date date;
	@Column(name = "day_of_week")	
	private String dayOfWeek;
	@Column(name = "dayOfMonth")	
	private String day_of_month;
	@Column(name = "status")
	private String status;
	public Long getScheduleId() {
		return scheduleId;
	}
	public void setScheduleId(Long scheduleId) {
		this.scheduleId = scheduleId;
	}
	public Long getShippingDestinationId() {
		return shippingDestinationId;
	}
	public void setShippingDestinationId(Long shippingDestinationId) {
		this.shippingDestinationId = shippingDestinationId;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getDayOfWeek() {
		return dayOfWeek;
	}
	public void setDayOfWeek(String dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}
	public String getDay_of_month() {
		return day_of_month;
	}
	public void setDay_of_month(String day_of_month) {
		this.day_of_month = day_of_month;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
	
	
	
