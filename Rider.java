package com.jsp.application;

public class Rider
{
   private Bike bike;
   public Rider(Bike bike)
	{
		this.bike=bike;
	}
	public static void main(String[] args)
	{
		Rider r=new Rider(new RoyalEnfeild() );
		System.out.println(r.bike.bikeName());
		System.out.println(r.bike.cc());
		Rider r1=new Rider(new Bajaj() );
		System.out.println(r1.bike.bikeName());
		System.out.println(r1.bike.cc());
	}
}

