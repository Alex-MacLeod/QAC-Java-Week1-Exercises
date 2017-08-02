package garageObjects;

public class Lorry extends Vehicle{
	protected int maxFreight;
	protected int height;
	public Lorry(String a, int b, int c, String d, String e, boolean f, int g, int h, boolean k, String l, String n, boolean r, int v, int w) {
		super(a, b, c, d, e, f, g, h, k, l, n, r);
		maxFreight = v;
		height = w;
	}
}
