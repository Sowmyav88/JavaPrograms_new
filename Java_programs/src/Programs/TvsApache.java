package Programs;

public class TvsApache extends BikeClass {
	
	String model;
	String color;
	int price;
	
	public TvsApache(String brand,double price,int capacity,String color,double mileage,String model,String colorChild,int priceChild) 
	{
		super(brand,price,capacity,color,mileage);
		this.model=model;
		this.color= colorChild;
		this.price=priceChild;
	}
	
	public void TvsapacheDetails()
	{
		System.out.println("The child details are"+ model+color+price);
	}

}
