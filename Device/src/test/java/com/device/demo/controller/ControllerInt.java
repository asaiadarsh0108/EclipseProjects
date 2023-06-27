package com.device.demo.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.device.demo.AbstractTest;
import com.device.demo.model.Device;
import com.device.demo.service.DeviceService;

public class ControllerInt extends AbstractTest{

	@Autowired
	private DeviceService deviceService;
	
	@Test
	@Order(1)
	public void testCreateDevice1() throws Exception{
		Device device = new Device();
		device.setName("Router1");
		device.setDeviceType("Router");
		device.setLocation("Server Room");
		device.setStatus("Online");
		device.setManufacturer("Cisco");
		
		MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.post("/device/add")
				.contentType(MediaType.APPLICATION_JSON_VALUE)
				.content(mapToJson(device)))
				.andReturn();
		int status = mvcResult.getResponse().getStatus();
		assertEquals(200,status);
		String content = mvcResult.getResponse().getContentAsString();
		Device createdDevice = super.mapFromJson(content, Device.class);
		assertEquals(3L,createdDevice.getDeviceId());
		
		assertNotEquals(null, deviceService.getById(3L));
	}
	
	@Test
	@Order(2)
	public void testCreateDevice2() throws Exception{
		Device device = new Device();
		device.setName("Switch2");
		device.setDeviceType("Switch");
		device.setLocation("Network Closet");
		device.setStatus("Offline");
		device.setManufacturer("Juniper");
		
		MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.post("/device/add")
				.contentType(MediaType.APPLICATION_JSON_VALUE)
				.content(mapToJson(device)))
				.andReturn();
		int status = mvcResult.getResponse().getStatus();
		assertEquals(200,status);
		String content = mvcResult.getResponse().getContentAsString();
		Device createdDevice = super.mapFromJson(content, Device.class);
		assertEquals(4L,createdDevice.getDeviceId());
		
		assertNotEquals(null, deviceService.getById(4L));
	}
	
	@Test
	@Order(3)
	public void testCreateDevice3() throws Exception{
		Device device = new Device();
		device.setName("");
		device.setDeviceType("");
		device.setLocation("");
		device.setStatus("");
		device.setManufacturer("");
		
		MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.post("/device/add")
				.contentType(MediaType.APPLICATION_JSON_VALUE)
				.content(mapToJson(device)))
				.andReturn();
		int status = mvcResult.getResponse().getStatus();
		assertEquals(400,status);
	}
	
	@Test
	@Order(4)
	public void testGetAll() throws Exception{
		MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/device/getall")
				.accept(MediaType.APPLICATION_JSON_VALUE))
				.andReturn();
		int status = mvcResult.getResponse().getStatus();
		assertEquals(200, status);
		String content = mvcResult.getResponse().getContentAsString();
		Device[] device = super.mapFromJson(content, Device[].class);
		assertTrue(device.length == 4);
	}
	
	@Test
	@Order(5)
	public void testGetById1() throws Exception{
		MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/device/getbyid/1")
				.accept(MediaType.APPLICATION_JSON_VALUE))
				.andReturn();
		int status = mvcResult.getResponse().getStatus();
		assertEquals(200,status);
		String content = mvcResult.getResponse().getContentAsString();
		Device device= super.mapFromJson(content, Device.class);
		assertEquals(1,device.getDeviceId());
	}
	
	@Test
	@Order(6)
	public void testGetById2() throws Exception{
		MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/device/getbyid/10")
				.accept(MediaType.APPLICATION_JSON_VALUE))
				.andReturn();
		int status = mvcResult.getResponse().getStatus();
		assertEquals(400,status);
	}
	
	@Test
	@Order(7)
	public void testUpdate1() throws Exception{
		Device device = new Device();
		device.setName("Router5");
		device.setDeviceType("Router");
		device.setLocation("Hyderabad");
		device.setStatus("online");
		device.setManufacturer("Capge");
		
		MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.put("/device/update/2")
				.contentType(MediaType.APPLICATION_JSON_VALUE)
				.content(mapToJson(device)))
				.andReturn();
		int status = mvcResult.getResponse().getStatus();
		assertEquals(200, status);
		String content = mvcResult.getResponse().getContentAsString();
		Device updateDevice = super.mapFromJson(content, Device.class);
		assertEquals("Router5", updateDevice.getName());
		assertEquals("Router", updateDevice.getDeviceType());
		assertEquals("Hyderabad", updateDevice.getLocation());
		assertEquals("online", updateDevice.getStatus());
	}
	
	@Test
	@Order(8)
	public void testNonExistingUpdate() throws Exception{
		Device device = new Device();
		device.setName("Router5");
		device.setDeviceType("Router");
		device.setLocation("Hyderabad");
		device.setStatus("online");
		device.setManufacturer("Capge");
		
		MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.put("/device/update/100")
				.contentType(MediaType.APPLICATION_JSON_VALUE)
				.content(mapToJson(device)))
				.andReturn();
		int status = mvcResult.getResponse().getStatus();
		assertEquals(400, status);
	}
	
	@Test
	@Order(9)
	public void testDeleteExisting() throws Exception{
		 MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.delete("/device/delete/3"))
				 .andReturn();
		 int status = mvcResult.getResponse().getStatus();
		 assertEquals(200, status);
	}
	
	@Test
	@Order(10)
	public void testDeleteNonExisting() throws Exception{
		 MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.delete("/device/delete/10"))
				 .andReturn();
		 int status = mvcResult.getResponse().getStatus();
		 assertEquals(400, status);
	}
}
