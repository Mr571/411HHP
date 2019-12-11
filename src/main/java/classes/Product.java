package main.java.classes;

public class Product 
{
	private String name;
	private double price;
	private int oz;
	
	public Product(){}
	
	public Product(String name, double price, int oz)
	{
		this.name = name;
		this.price = price;
		this.oz = oz;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getOz() {
		return oz;
	}
	public void setOz(int oz) {
		this.oz = oz;
	}

}
