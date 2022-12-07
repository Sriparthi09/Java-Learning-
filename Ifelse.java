package com.simplilearn;

import java.util.Scanner;

public class Ifelse {

	public static void main(String[] args) {
		
		int a;
		int b;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of A:");
		a = sc.nextInt();
		System.out.println("Enter the value of B:");
		b = sc.nextInt();
		
		if(a>b) 
		{
			System.out.println("A is larger than B");
		}
		else
		{
			System.out.println("B is larger than A");
		}
		
	}
}
