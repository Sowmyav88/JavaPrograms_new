package Programs;

public class BikeClass {
	
	String brand;
	double price;
	private int capacity;
	String color;
	private double mileage;
	
	public BikeClass(String brand,double price,int capacity,String color,double mileage) {
		this.brand= brand;
		this.price = price;
		this.capacity =capacity;
		this.color = color;
		this.mileage= mileage;
		
		
	}
	
	
	public int getCapacity() {
		return capacity;
	}


	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}


	public double getMileage() {
		return mileage;
	}


	public void setMileage(double mileage) {
		this.mileage = mileage;
	}


	public void capacitykm(int capacity)
	{
		System.out.println("The capacity of the bike is :"+capacity);
	}
	
	public void color(String color)
	{
		System.out.println("The color of the bike is :"+color);
	}
	
	

}
	 
 