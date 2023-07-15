package com.bus.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Bus {



	private int startStopId;

	private int endStopId;

	private String source;

	private String destination;

	private String[] stops = { "H.S.R. Layout", "Madiwala", "Forum", "Shanthinagara", "Richmond Circle",
			"Chancery Pavillion", "Bowring Institute", "Bangalore Club", "Indian Express", "Vasantanagara",
			"RM Guttahalli", "Mekhri Circle", "Hebbala", "BIAL" };

	private int[] distance = { 0, 5, 11, 15, 18, 23, 25, 27, 29, 30, 33, 35, 37, 62 };

	private int getFare;

	public Bus() {
	}

	public Bus(int startStopId, int endStopId, String source, String destination, String[] stops, int[] distance,
			int getFare) {
		super();

		this.startStopId = startStopId;
		this.endStopId = endStopId;
		this.source = source;
		this.destination = destination;
		this.stops = stops;
		this.distance = distance;
		this.getFare = getFare;
	}

	public int getStartStopId() {
		return startStopId;
	}

	public void setStartStopId(int startStopId) {
		this.startStopId = startStopId;
	}

	public int getEndStopId() {
		return endStopId;
	}

	public void setEndStopId(int endStopId) {
		this.endStopId = endStopId;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String[] getStops() {
		return stops;
	}

	public void setStops(String[] stops) {
		this.stops = stops;
	}

	public int[] getDistance() {
		return distance;
	}

	public void setDistance(int[] distance) {
		this.distance = distance;
	}

	public int getGetFare() {
		return getFare;
	}

	public void setGetFare(int getFare) {
		this.getFare = getFare;
	}

}