package com.Interface;

public abstract class Animal implements Travel,Owner {
	

}
 class Dog extends Animal {
	
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
 class Cat extends Animal {

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
 }
 class Rabbit extends Animal{

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
 }
 
 }
	 

