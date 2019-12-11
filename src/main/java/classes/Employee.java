package main.java.classes;

public class Employee 
{
	private String name;
	private double pay;
	
	public Employee(){}
	
	public Employee(String name, double pay)
	{
		this.setPay(pay);
		this.setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPay() {
		return pay;
	}

	public void setPay(double pay) {
		this.pay = pay;
	}
}
