package com.bus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.bus.service.IBusService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("api/")
@CrossOrigin(originPatterns = "*")
public class BusController {

	@Autowired
	private IBusService busService;

	@GetMapping("getfare/{startStopId}/{endStopId}")
	public int getFare(@PathVariable("startStopId") int startStopId, @PathVariable("endStopId") int endStopId) {
		System.out.println("Called getFare api in ctrl");
		System.out.println("Bus Data is :: " + startStopId + " and " + endStopId);

		return busService.getFare(startStopId, endStopId);

	}

}
