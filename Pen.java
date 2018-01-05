
public class Pen {
	String color;
	int price;
	String type="writing";

	public static void main(String[] args) {
		Pen p = new Pen();
		p.color="red";
		p.price=30;
		System.out.println(p.color);
		System.out.println(p.price);
		System.out.println(p.type);
		
		
		Pen p1 = new Pen();
		p1.color="black";
		p1.price=20;
		System.out.println(p1.color);
		System.out.println(p1.price);
		System.out.println(p1.type);
		
		
		

	}

}
