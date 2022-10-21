package com.napmkmk.test;

import java.util.ArrayList;

public class MyInfo {
	
	private String name;
	private double weight;
	private double height;
	private ArrayList<String> hobbys;
	private BMIcalculator bmicalculator;
	
	public void bmiCalculation() {
		bmicalculator.bmiCalculation(weight, height);		
	}
	
	public void getInfoOutput() {
		System.out.println("이름 : " + name);
		System.out.println("키 : " + height);
		System.out.println("몸무게 : " + weight);
		System.out.println("취미 : " + hobbys);
		bmiCalculation();		
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setHobbys(ArrayList<String> hobbys) {
		this.hobbys = hobbys;
	}

	public void setBmicalculator(BMIcalculator bmicalculator) {
		this.bmicalculator = bmicalculator;
	}

}