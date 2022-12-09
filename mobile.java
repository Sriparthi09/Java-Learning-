package com.simplilearn;

public class mobile {
String brand;
String color;
int price;
	
	public static void main(String[] args) {
		
		mobile m1 = new mobile();
		m1.brand = "Iphone";
		m1.color = "Green";
		m1.price = 70;
		mobile m2 = new mobile();
		m2.brand = "Oneplus";
		m2.color = "Red";
		m2.price = 30;
		System.out.println(m1.brand);
		System.out.println(m1.color);
		System.out.println(m1.price);
		System.out.println(m2.brand);
		System.out.println(m2.color);
		System.out.println(m2.price);
	}
}
