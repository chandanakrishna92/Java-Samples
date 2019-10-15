package com.java.samples;
public class consultant extends employee2 
{
	private double consultingFees;

	public double getConsultingFees() {
		return consultingFees;
	}

	public void setConsultingFees(double consultingFees) {
		this.consultingFees = consultingFees;
	}

	public consultant(int empid, String name, double basicPay) {
		super(empid, name, basicPay);
		// TODO Auto-generated constructor stub
	}

	@Override
	double calculatesalary() {
		// TODO Auto-generated method stub
		return getbasicPay()+getConsultingFees();
	}

}
