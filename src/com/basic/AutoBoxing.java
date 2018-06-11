package com.basic;

public class AutoBoxing {
	public static void main(String[] args) {
		Integer var = new Integer(12);
		int a = var*2;
		System.out.println(a);
		
		getItem(15,new PoliceCar(),new SportsCar(),new Taxi());
	}
	private static void getItem(int i, PoliceCar policeCar, SportsCar sportsCar, Taxi taxi) {
		// TODO Auto-generated method stub
		
	}
	public static void getItem(int a,Car...car) {
		for (int i = 0; i < car.length; i++) {
			System.out.println(car[i]);
		}
	}
}



