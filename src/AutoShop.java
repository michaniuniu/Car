
public class AutoShop {
	private Car car;
	private Truck truck;
	private Hatchback hatchback;
	private Sedan sedan;
	
	public AutoShop(){
		car = new Car(250,150000,"¯ó³ty");
		truck = new Truck(90,100000,"Czerwony",3001);
		hatchback = new Hatchback(150,200000,"Zielony",2010,(float)4.5);
		sedan = new Sedan(200,99000,"Czarny",4500);
	};
	
	public void getAutoShop(){
		System.out.println("Cena auta wynosi: " + car.getSalePrice());
		System.out.println("Cena ciê¿arówki wynosi: " + truck.getSalePrice());
		System.out.println("Cena hatchbacka wynosi: " + hatchback.getSalePrice());
		System.out.println("Cena sedana wynosi: " + sedan.getSalePrice());
	}
}
