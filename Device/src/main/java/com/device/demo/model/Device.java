package com.device.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Device {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long deviceId;
	
	private String name;
	
	private String deviceType;
	
	private String location;
	
	private String status;
	
	private String manufacturer;
	
	public Device(Long deviceId, String name, String deviceType, String location, String status, String manufacturer) {
		super();
		this.deviceId = deviceId;
		this.name = name;
		this.deviceType = deviceType;
		this.location = location;
		this.status = status;
		this.manufacturer = manufacturer;
	}
	public Device() {
		super();
	}

	public Long getDeviceId() {
		return deviceId;
	}

	public String getName() {
		return name;
	}

	public String getDeviceType() {
		return deviceType;
	}

	public String getLocation() {
		return location;
	}

	public String getStatus() {
		return status;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setDeviceId(Long deviceId) {
		this.deviceId = deviceId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	@Override
	public String toString() {
		return "Device [deviceId=" + deviceId + ", name=" + name + ", deviceType=" + deviceType + ", location="
				+ location + ", status=" + status + ", manufacturer=" + manufacturer + "]";
	}
}
