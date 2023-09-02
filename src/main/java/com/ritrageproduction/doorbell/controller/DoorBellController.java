package com.ritrageproduction.doorbell.controller;

import com.ritrageproduction.doorbell.services.CallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoorBellController {
	
	@Autowired
	private CallService callService;
	
	@GetMapping("/ring-door-bell-701")
	public void ringTheDoorBell() {
		callService.callResident();
	}

}
