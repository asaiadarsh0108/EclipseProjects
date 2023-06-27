package com.device.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.device.demo.Exception.ResourceNotFoundException;
import com.device.demo.model.Device;
import com.device.demo.service.DeviceService;

@RestController
@RequestMapping("/device")
public class DeviceController {

	@Autowired
	private DeviceService deviceService;
	
	@GetMapping("/getall")
	public List<Device> getAll(){
		List<Device> list = deviceService.getAll();
		return list;
	}
	
	@GetMapping("/getbyid/{id}")
	public ResponseEntity<?> getById(@PathVariable Long id) {
		Device device = deviceService.getById(id);
		if(device==null) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid Id given");
		}
		return ResponseEntity.status(HttpStatus.OK).body(device);
	}
	
	@GetMapping("/getbyname/{name}")
	public ResponseEntity<?> getById(@PathVariable String name) {
		Optional<Device> device = deviceService.getByName(name);
		if(device.isEmpty()) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid name given");
		}
		return ResponseEntity.status(HttpStatus.OK).body(device);
	}
	
	@PostMapping("/add")
	public ResponseEntity<?> add(@RequestBody Device device) {
		try {
			Device d = deviceService.insert(device);
			return ResponseEntity.status(HttpStatus.OK).body(d);
		} catch (ResourceNotFoundException e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
		}
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<?> update(@PathVariable Long id, @RequestBody Device newDevice){
		try {
			Device device=deviceService.update(id,newDevice);
			return ResponseEntity.status(HttpStatus.OK).body(device);
		} catch (ResourceNotFoundException e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
		}
	}
	
	@DeleteMapping("delete/{id}") 
	public ResponseEntity<?> deleteDevice(@PathVariable Long id) {
		Device d=deviceService.deleteById(id);
		if(d== null) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid Id");
		}
		return ResponseEntity.status(HttpStatus.OK).body("Employee deleted succesfully");
	}
}
