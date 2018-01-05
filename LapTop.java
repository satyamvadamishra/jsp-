
public class LapTop {
	String model;
	int price;
	String ram;
	

	public static void main(String[] args) {
		LapTop l= new LapTop();
		l.model="lenovo";
		l.price=35000;
		l.ram="8gb";
		System.out.println(l.model);
		System.out.println(l.price);
		System.out.println(l.ram);
				
		
		LapTop l1= new LapTop();
		l1.model="hp";
		l1.price=45000;
		l1.ram="16gb";
		System.out.println(l1.model);
		System.out.println(l1.price);
		System.out.println(l1.ram);
				
	}

}
