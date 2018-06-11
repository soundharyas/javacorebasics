package com.Interface;

public  abstract class Vehicle implements Travel,Owner  {

	
}class Car extends Vehicle {
	
	
	 @Override
	public int getspeed() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getOwnerName() {
		// TODO Auto-generated method stub
		return null;
	}
}class Cycle extends Vehicle {
	@Override
	public int  getspeed(){
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getOwnerName() {
		// TODO Auto-generated method stub
		return null;
	}
}class Bus extends Vehicle{

	@Override
	public int getspeed() {
		
		return 0;
	}

	@Override
	public String getOwnerName() {
		// TODO Auto-generated method stub
		return null;
	}

}

