package garage;

public class Car extends Vehicle{
	protected boolean fourWheelDrive;
	protected boolean sunroof;
	public Car(String a, int b, int c, String d, String e, boolean f, int g, int h, boolean k, String l, String n, boolean r, boolean z, boolean y) {
		super(a, b, c, d, e, f, g, h, k, l, n, r);
		fourWheelDrive = z;
		sunroof = y;
	}
}
