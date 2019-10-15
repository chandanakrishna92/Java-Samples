package com.java.employeee;

public class ContractEmployee extends Employee {
	public void CalculateBonus() {
		this.empBonus = this.empBasicpay * 0.02;
	}
}
