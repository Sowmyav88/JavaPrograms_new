package Programs;

public class DriverClass {
	public static void main(String[] args) {
		BikeClass bc = new BikeClass("TVS", 200000, 220, "Red", 25.0);
		bc.capacitykm(220);
		TvsApache tvs = new TvsApache("TVS", 210000, 350, "Black", 25.0, "Apache", "Red", 150000);
		
		tvs.color("red");
		
	}

}
