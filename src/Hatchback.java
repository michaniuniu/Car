
public class Hatchback extends Car{
	private int year;
	private float manufacturerDiscount;
	
	public Hatchback(){
		speed = 0;
		price = 0;
		color = "blank";
		year = 0;
		manufacturerDiscount = 0;
	}
	
	public Hatchback(int s, float p, String c,int y, float m){
		speed = s;
		price = p;
		color = c;
		year = y;
		manufacturerDiscount = m;
	}
	
	public float getSalePrice(){
		return (float)(price-(price*(manufacturerDiscount/100)));
	}
}
