
public class Car {

	public int speed;
	public float price;
	public String color;
	
	public Car(){
		speed = 0;
		price = 0;
		color = "blank";
	}
	
	public Car(int s, float p, String c){
		speed = s;
		price = p;
		color = c;
	}
	
	public float getSalePrice(){
		return price;
	}
	
	
}
