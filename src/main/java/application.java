package main.java;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import main.java.classes.*;

public class application 
{
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException 
	{
		ArrayList <Day> calendar = new ArrayList <Day>(); //Our year of data
		Day day = new Day();
		DecimalFormat df = new DecimalFormat("#.##");
		df.setRoundingMode(RoundingMode.CEILING);
		
		int tempInt = 0;
		
		for(int i = 1; i <= (120 + (366 * 4)); i++) // random number of days generated from some Jan. 1 on. Replace 120 with current day.
		{
			day = new Day(i, ThreadLocalRandom.current().nextInt(25), ThreadLocalRandom.current().nextInt(25), ThreadLocalRandom.current().nextInt(25), ThreadLocalRandom.current().nextInt(25), ThreadLocalRandom.current().nextInt(25), ThreadLocalRandom.current().nextInt(25), ThreadLocalRandom.current().nextInt(25), ThreadLocalRandom.current().nextInt(25), tempInt = ThreadLocalRandom.current().nextInt(16, 81), df.format(tempInt * ThreadLocalRandom.current().nextDouble(7.5, 15.01)));
			calendar.add(day);
		}
		
		PrintWriter writer = new PrintWriter("data.txt", "UTF-8");
		for(int i = 0; i < calendar.size(); i++) // random number of days generated from some Jan. 1 on. Replace 120 with current day.
		{
			String temp = "";
			day = calendar.get(i);
			temp += day.getDate();
			temp += "|";
			temp += day.getJr();
			temp += "|";
			temp += day.getSmall();
			temp += "|";
			temp += day.getMedium();
			temp += "|";
			temp += day.getLarge();
			temp += "|";
			temp += day.getXL();
			temp += "|";
			temp += day.getBread();
			temp += "|";
			temp += day.getSmSub();
			temp += "|";
			temp += day.getLgSub();
			temp += "|";
			temp += day.getHours();
			temp += "|";
			temp += day.getEmpCost();
			temp += ";";
			System.out.print(temp);
			writer.println(temp);
		} 
    }
	
}
