package com.bus.service;

import org.springframework.stereotype.Service;

import com.bus.entity.Bus;

@Service
public interface IBusService {

	int getFare(int startStopId , int endStopId);
	
}
