package com.simplilearn;

public class Laptop {

	String brand;
	String colour;
	int price;
	String Ram;
	String Memory;
	Laptop(String b,String c,int p,String r,String m)
	{
		this.brand=b; this.colour=c; this.price=p; this.Ram=r; this.Memory=m;
	}
public static void main(String[] args) {
	Laptop l1=new Laptop("dell","black",30000,"8gb","64gb");
	Laptop l2=new Laptop("hp","silver",40000,"7gb","57gb");
	Laptop l3=new Laptop("lenovo","white",80000,"6gb","78gb");
	System.out.println(l1.brand);
	System.out.println(l1.colour);
	System.out.println(l1.price);
	System.out.println(l1.Ram);
	System.out.println(l1.Memory);
	System.out.println(l2.brand);
	System.out.println(l2.colour);
	System.out.println(l2.price);
	System.out.println(l2.Ram);
	System.out.println(l2.Memory);
	System.out.println(l3.brand);
	System.out.println(l3.colour);
	System.out.println(l3.price);
	System.out.println(l3.Ram);
	System.out.println(l3.Memory);

	}
}
