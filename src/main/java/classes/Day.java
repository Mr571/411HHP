package main.java.classes;

import java.util.ArrayList;
import java.util.Date;

public class Day 
{
	private int date;
	private int jr;
	private int small;
	private int medium;
	private int large;
	private int XL;
	private int bread;
	private int smSub;
	private int lgSub;
	private int hours;
	private String empCost;

	public Day(){}
	
	public Day(int date, int jr, int small, int medium, int large, int XL, int bread, int smSub, int lgSub, int hours, String string)
	{
		this.setDate(date);
		this.setJr(jr);
		this.setSmall(small);
		this.setMedium(medium);
		this.setLarge(large);
		this.setXL(XL);
		this.setBread(bread);
		this.setSmSub(smSub);
		this.setLgSub(lgSub);
		this.setEmpCost(string);
		this.setHours(hours);
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public int getJr() {
		return jr;
	}

	public void setJr(int jr) {
		this.jr = jr;
	}

	public int getSmall() {
		return small;
	}

	public void setSmall(int small) {
		this.small = small;
	}

	public int getMedium() {
		return medium;
	}

	public void setMedium(int medium) {
		this.medium = medium;
	}

	public int getLarge() {
		return large;
	}

	public void setLarge(int large) {
		this.large = large;
	}

	public int getXL() {
		return XL;
	}

	public void setXL(int xL) {
		XL = xL;
	}

	public int getBread() {
		return bread;
	}

	public void setBread(int bread) {
		this.bread = bread;
	}

	public int getSmSub() {
		return smSub;
	}

	public void setSmSub(int smSub) {
		this.smSub = smSub;
	}

	public int getLgSub() {
		return lgSub;
	}

	public void setLgSub(int lgSub) {
		this.lgSub = lgSub;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public String getEmpCost() {
		return empCost;
	}

	public void setEmpCost(String string) {
		this.empCost = string;
	}
}
