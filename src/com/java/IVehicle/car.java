package com.java.IVehicle;

public abstract class car implements Vehicle {
	public void wheels() {
		System.out.println("with tube wheels");
	}

	public void Brake()

	{
		System.out.println("Brake system of the car is good");
	}

	public abstract void start();

}
