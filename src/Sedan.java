
public class Sedan extends Car{
	private int length;
	
	public Sedan(){
		speed = 0;
		price = 0;
		color = "blank";
		length = 0;
	}
	
	public Sedan(int s, float p, String c, int l){
		speed = s;
		price = p;
		color = c;
		length = l;
	}
	
	public float getSalePrice(){
		if(length>=4500)
			return price;
		else
			return (float)(price-(price*0.1));
	}
}
