package com.simplilearn;

import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {
	int a;
	int b;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the value of A:");
	a = sc.nextInt();
	System.out.println("Enter the value of b:");
	b = sc.nextInt();
	
	int c = a+b;
	System.out.println("Enter the value of C:"+c);
	int d = a-b;
	System.out.println("Enter the value of C:"+d);
	int e = a*b;
	System.out.println("Enter the value of C:"+e);
	int f = a/b;
	System.out.println("Enter the value of C:"+f);
	int g = a%b;
	System.out.println("Enter the value of C:"+g);
}
}