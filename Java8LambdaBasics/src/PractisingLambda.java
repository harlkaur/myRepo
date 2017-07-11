
public class PractisingLambda {

	public static void main(String[] args) {

		Runnable r = () -> System.out.println("My Runnable class");
		r.run();
	}

}
