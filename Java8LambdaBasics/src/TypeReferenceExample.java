
public class TypeReferenceExample {

	public static void main(String[] args) {

		lambda myLambda = (s) -> s.length();
		System.out.println(myLambda.getLength("Hello Harleen"));
	}

	public interface lambda {

		public int getLength(String s);
	}
}
