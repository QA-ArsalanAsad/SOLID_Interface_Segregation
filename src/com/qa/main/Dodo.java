package com.qa.main;

public class Dodo implements EggLayingCreature, ExtinctCreature {
	
	
	private String currentLocation;
	private int numberOfEggs;
	
	public Dodo(int intialNumberOfEggs) {
		this.setNumberOfEggs(intialNumberOfEggs);
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
	public void isExtinct() {
		this.setCurrentLocation("In a museum");
	
		
	}

	@Override
	public void laysEggs() {
		this.setNumberOfEggs(getNumberOfEggs()+1);;
		
		
	}

}
