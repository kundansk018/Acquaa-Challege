package com.bus.serviceimplement;

import org.springframework.stereotype.Service;

import com.bus.entity.Bus;
import com.bus.service.IBusService;

@Service
public class BusService implements IBusService {

	@Override
	public int getFare(int startStopId, int endStopId) {

		int getFare;
		int totalDistance;

		Bus bus = new Bus();
		int[] distance = bus.getDistance();
		String[] stops = bus.getStops();

		if (startStopId < endStopId) {
			totalDistance = distance[endStopId - 1] - distance[startStopId - 1];
		} else {
			totalDistance = distance[startStopId - 1] - distance[endStopId - 1];
		}
		
		if (totalDistance <= 3) {
			getFare = 3;
		} else if (totalDistance <= 20) {
			getFare = 1 * 3 + (totalDistance - 3) * 2;
		} else {
			getFare = 1 * 3 + (17 * 2) + (totalDistance - 20);

		}
		System.out.println(stops[startStopId - 1] + " > " + stops[endStopId - 1] + " = Rs. " + getFare);

		return getFare;

	}

}
