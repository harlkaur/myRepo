
public class Greeting {

	public void grt(Greeter greeting){
		greeting.perform();
	}
	
	public static void main(String[] args) {
		Greeting greeting = new Greeting();

		Greeter myExpression = () -> System.out.println("hello greeting");
		
		Greeter grt = new Greeter(){
			public void perform(){
				System.out.println("hello greeter");
			}
		};
		//myExpression.perform();
		greeting.grt(myExpression);
		greeting.grt(grt);
	}

	
}
