package garageObjects;
//16 Garage
public abstract class Vehicle {
	String make;					//define attributes
	int maxSpeed;
	int horsepower;
	String fuelType;
	String colour;
	boolean automatic;
	int runningCost;
	int mileage;
	boolean insured;
	String model;
	String numberPlate;
	boolean needsRepair;
	
	public Vehicle(String a, int b, int c, String d, String e, boolean f, int g, int h, boolean k, String l, String n, boolean r) {				
			make = a;
			maxSpeed = b;
			horsepower = c;
			fuelType = d;
			colour = e;
			automatic = f;
			runningCost = g;
			mileage = h;
			insured = k;
			model = l;
			numberPlate = n;
			needsRepair = r;
		}
	public int totalCost() {				//Calculates total monthly cost for each object
			if (insured) {
			switch (fuelType) {
				case "diesel":
					if (mileage > 10000) {
						return 750 + runningCost;
					} else if (mileage < 10000 & mileage > 5000) {
						return 675 + runningCost;
					} else {
						return 600 + runningCost;
					}
				case "unleaded":
					if (mileage > 10000) {
						return 600 + runningCost;
					} else if (mileage < 10000 & mileage > 5000) {
						return 550 + runningCost;
					} else {
						return 500 + runningCost;	
					}
				case "hybrid": 
					if (mileage > 10000) {
						return 275 + runningCost;
					} else if (mileage < 10000 & mileage > 5000) {
						return 235 + runningCost;
					} else {
						return 200 + runningCost;
					}
				default:
					return  runningCost;
				}
			} else {
				return runningCost*10;
			}
		}
	public int repairCost() {							//Calculates repair cost for each object
			if (needsRepair) {
					if (runningCost > 1500) {
						return runningCost*50;
					} else if (runningCost < 1500 & runningCost > 900) {
						return runningCost*30;
					} else if (runningCost < 900 & runningCost > 600) {
						return runningCost*15;
					} else {
						return runningCost*7;
					}
			} else {
				return 0;
			}
		}
}