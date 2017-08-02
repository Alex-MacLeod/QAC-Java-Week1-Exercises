package objects;
//17 Paint Wizard

public class Paint {
	private double costPerTin;
	private int litresPerTin;
	protected String productName;
	private int areaPerLitre;
	private double roomSize = 220;									//declare area of room to be painted
	
	public Paint(String a, double e, int c, int d) {
		productName = a;
		costPerTin = e;
		litresPerTin = c;
		areaPerLitre = d;
	}
	public int coverage(){									//coverage = area/tin, # m^2 a single tin can paint
		return areaPerLitre*litresPerTin;
	}
	public double tinsPerRoom(){							//#tins required to paint room
		 return roomSize/coverage();
	}
	public double paintRoom(){								//cost of painting room
		return Math.ceil(tinsPerRoom())*costPerTin;
	}	
}
