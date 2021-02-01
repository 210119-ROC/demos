package com.revature.models;

import java.util.ArrayList;
import java.util.List;

public class Cactus {
	
	private double height;
	private double waterStored; // in gallons
	private String color;
	private List<Flower> flowers = new ArrayList<Flower>();
	// This arraylist represents all the flowers that a cactus can have
	// We must create a flower class
	
	public Cactus() {
		super();
	}

	public Cactus(double height, double waterStored, String color, List<Flower> flowers) {
		super();
		this.height = height;
		this.waterStored = waterStored;
		this.color = color;
		this.flowers = flowers;
	}

	public Cactus(double height, double waterStored, String color) {
		super();
		this.height = height;
		this.waterStored = waterStored;
		this.color = color;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWaterStored() {
		return waterStored;
	}

	public void setWaterStored(double waterStored) {
		this.waterStored = waterStored;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public List<Flower> getFlowers() {
		return flowers;
	}

	public void setFlowers(List<Flower> flowers) {
		this.flowers = flowers;
	}
	
	public static int add(int x, int y) {
		// This method always returns the exact sum of the 2 parameters
		return x + y;
		
	}
	
	// This method prints a message with all the flowers that a cactus has
	// then it returns the number of flowers as an integer value.
	public int bloom() {
		System.out.println("This cactus has " + flowers);
		return flowers.size();
	}
	
	
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((flowers == null) ? 0 : flowers.hashCode());
		long temp;
		temp = Double.doubleToLongBits(height);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(waterStored);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cactus other = (Cactus) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (flowers == null) {
			if (other.flowers != null)
				return false;
		} else if (!flowers.equals(other.flowers))
			return false;
		if (Double.doubleToLongBits(height) != Double.doubleToLongBits(other.height))
			return false;
		if (Double.doubleToLongBits(waterStored) != Double.doubleToLongBits(other.waterStored))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Cactus [height=" + height + ", waterStored=" + waterStored + ", color=" + color + ", flowers=" + flowers
				+ "]";
	}
	
	
	

}
