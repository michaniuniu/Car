
public class Truck extends Car{

	private int weight;
	
	public Truck(){
		speed = 0;
		price = 0;
		color = "blank";
		weight = 0;
	}
	
	public Truck(int s, float p, String c,int w){
		speed = s;
		price = p;
		color = c;
		weight = w;
	}
	
	
	public float getSalePrice(){
		if(weight<=3000)
			return price;
		else
			return  (float)(price-(price*0.1));			
	}
	
}
