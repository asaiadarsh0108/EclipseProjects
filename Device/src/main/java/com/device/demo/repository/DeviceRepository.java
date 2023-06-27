package com.device.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.device.demo.model.Device;

public interface DeviceRepository extends JpaRepository<Device, Long>{

}
