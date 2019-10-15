package com.java.employeee;

public class PermnentEmployee extends Employee {

	@Override
	public void CalculateBonus() {
		this.empBonus = this.empBasicpay * 0.05;
	}
	
}


 