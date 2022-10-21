package com.napmkmk.test;

public class BMIcalculator {
	
	private double normal;//정상
	private double lowWeight;//저체중
	private double overWeight;//과체중
	private double obesity;//비만	
	
	
	public void bmiCalculation(double weight, double height) {
		
		// BMI 지수 : 몸무게 / (키*0.01)**2
		
		double h = height * 0.01;
		double bmiResult = weight/(h*h); // bmi 지수
		
		System.out.println("당신의 BMI 지수 : " + bmiResult);
		
		if(bmiResult > obesity) {
			System.out.println("당신은 비만입니다!");
		} else if(bmiResult > overWeight) {
			System.out.println("당신은 과체중입니다!");
		} else if(bmiResult > normal) {
			System.out.println("당신은정상입니다!");
		} else {
			System.out.println("당신은 저체중입니다!");			 
		}
		
	}


	public void setNormal(double normal) {
		this.normal = normal;
	}


	public void setLowWeight(double lowWeight) {
		this.lowWeight = lowWeight;
	}


	public void setOverWeight(double overWeight) {
		this.overWeight = overWeight;
	}


	public void setObesity(double obesity) {
		this.obesity = obesity;
	}
	
	
	

}