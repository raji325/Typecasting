package com.capgemini.typecasting.reference;

public class TestA {

	public static void main(String[] args) {
		Pen p = new Pen();
		System.out.println(p.cost);
		p.write();
		System.out.println("*******************************");
		Marker m = new Marker();
		System.out.println(m.cost);
		m.write();
		System.out.println(m.size);
		m.color();
		System.out.println("*******************************");
		Pen p1 = new Marker();
		System.out.println(p1.cost);
		p1.write();
		
		/*
		 * all the sub class properties are hidden (UpCasting)
		 * System.out.println(p1.size); p1.color();
		 */
		Marker m1=(Marker)p1;
		System.out.println(m1.cost);
		m1.write();
		System.out.println(m1.size);
		m1.color();
		
		/*
		 * before DownCasting always UpCasting
		 * if you try casting without UpCating 
		 * will get java.lang.Classcast Exception
		 * Marker m2=(Marker)p;
		 */
		 
	}
}
