package com.device.demo.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.device.demo.Exception.ResourceNotFoundException;
import com.device.demo.model.Device;

@Service
public class DeviceService {
	
	private Map<Long,Device> devices = new HashMap<>();
	private Long index= 2L;
	
	DeviceService(){
		Device d1 = new Device(1L,"Router-01", "Router", "Server Room", "online", "Cisco");
		Device d2 = new Device(2L, "Switch2", "Switch", "Network Closet", "Offline", "Juniper");
		devices.put(1L, d1);
		devices.put(2L, d2);
	}

	public List<Device> getAll() {
		// TODO Auto-generated method stub
		return new ArrayList<>(devices.values());
	}

	public Device getById(Long id) {
		Device device = devices.get(id);
		return device;
	}

	public Device insert(Device device) throws ResourceNotFoundException {
		if(device.getDeviceType().trim().equals("") || device.getManufacturer().trim().equals("")|| device.getLocation().trim().equals("")
				|| device.getStatus().trim().equals("") || device.getName().trim().equals("")) {
			throw new ResourceNotFoundException("Invalid input");
		}
		index+=1L;
		device.setDeviceId(index);
		devices.put(index, device);
		return device;
	}

	public Device update(Long id, Device newDevice) throws ResourceNotFoundException {
		Device oldDevice = devices.get(id);
		if(oldDevice==null) {
			throw new ResourceNotFoundException("Invalid id given");
		}
		newDevice.setDeviceId(id);
		devices.put(id, newDevice);
		return devices.get(id);
	}

	public Device deleteById(Long id) {
		Device device = devices.get(id);
		if(device==null) {
			return null;
		}
		return devices.remove(id);
	}

	public Optional<Device> getByName(String name) {
		Optional<Device> device = devices.values().stream().filter(d -> d.getName().equalsIgnoreCase(name)).findFirst();
		return device;
	}

}
