package com.qa.main;

public class Falcon implements EggLayingCreature, FlyingCreature {
	
	
	private String currentLocation;
	private int numberOfEggs;
	
	public Falcon(int initialNumberOfEggs) {
		this.setNumberOfEggs(initialNumberOfEggs);
	}

	public String getCurrentLocation() {
		return currentLocation;
	}

	public void setCurrentLocation(String currentLocation) {
		this.currentLocation = currentLocation;
	}

	public int getNumberOfEggs() {
		return numberOfEggs;
	}

	public void setNumberOfEggs(int numberOfEggs) {
		this.numberOfEggs = numberOfEggs;
	}

	@Override
	public void flys() {
		this.setCurrentLocation("High above the clouds");
		
		
	}

	@Override
	public void laysEggs() {
		this.setNumberOfEggs(getNumberOfEggs()+1);
		
		
	}

}
