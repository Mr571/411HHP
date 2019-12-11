package main.java;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import main.java.classes.*;

public class application 
{
	public static void main(String[] args) 
	{
		ArrayList <Product> stock = new ArrayList <Product>(); //I don't know if we need this
		ArrayList <Product> menu = new ArrayList <Product>(); //Everything we have on the menu, see below
		ArrayList <Employee> employees = new ArrayList <Employee>(); //Our stock employees
		ArrayList <Day> calendar = new ArrayList <Day>(); //Our year of data
		Product pro = new Product();
		Employee emp = new Employee();
		Day day = new Day();
		Random rand = new Random();
		int doughStock = 100;
		
		emp = new Employee("Jimmy", 7.50); //Jimmy, $7.50/hour
		employees.add(emp);
		emp = new Employee("Joe", 9.63);
		employees.add(emp);
		emp = new Employee("Jim", 11.37);
		employees.add(emp);
		emp = new Employee("Bob", 23.98);
		employees.add(emp);
		
		for(int i = 1; i <= (120 + (366 * 4)); i++) // random number of days generated from some Jan. 1 on. Replace 120 with current day.
		{
			day = new Day(i, rand.nextInt(25), rand.nextInt(25), rand.nextInt(25), rand.nextInt(25), rand.nextInt(25), rand.nextInt(25), rand.nextInt(25), rand.nextInt(25), rand.nextInt(25), rand.nextInt(25));
			calendar.add(day);
		}
		
		pro = new Product("Jr.", 4, 6); //Jr, $4, 6oz.
		menu.add(pro);
		pro = new Product("Small", 5, 9);
		menu.add(pro);
		pro = new Product("Medium", 8, 14);
		menu.add(pro);
		pro = new Product("Large", 10, 19);
		menu.add(pro);
		pro = new Product("XL", 14, 27);
		menu.add(pro);
		pro = new Product("Bread", 8, 14);
		menu.add(pro);
		pro = new Product("Regular Sub", 5, 6);
		menu.add(pro);
		pro = new Product("Large Sub", 8, 9);
		menu.add(pro);
		
    }
	
}
