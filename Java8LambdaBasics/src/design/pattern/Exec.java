package design.pattern;

public class Exec {

	public static void main(String[] args) {

		Customer c1 = new Customer();
		c1.setCustName("Harleen");
		
		Customer c2 = new Customer();
		c2.setCustName("Eshleen");
		
		Product pixel = new Product();
		pixel.setProductName("Google pixel");
		
		pixel.setIsavailable(false);

		pixel.registerObserver(c1);
		pixel.registerObserver(c2);
		pixel.notifyObserver();
	}

}
