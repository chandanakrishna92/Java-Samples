package com.java.employeee;

public class programEmployee {

	public static void main(String[] args) {
		Employee emp = GetHeighestPaidEmployee();

		emp.CalculateBonus();
		System.out.println("Company Name :"+emp.getCompanyName());

		System.out.println("Result : EmpId : "+emp.empId+", EmpName : " + emp.empName + " , Bonus : " + emp.empBonus);
	}

	public static Employee GetHeighestPaidEmployee() {

		PermnentEmployee p = new PermnentEmployee();
		p.empBasicpay = 50000;
		p.empName = "Vishwas";
		p.empId = 1;

		ContractEmployee c = new ContractEmployee();
		c.empBasicpay = 20000;
		c.empName = "AContractEmp";
		c.empId = 2;

		return p.empBasicpay > c.empBasicpay ? p : c;

	}

}
