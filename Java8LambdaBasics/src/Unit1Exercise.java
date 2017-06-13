import java.util.List;
import java.util.Arrays;

public class Unit1Exercise {

	public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(
				new Person("Harleen","Kaur",1),
				new Person("Eshleen","Kaur",2),
				new Person("Eshleen","Kaur",2),
				new Person("Soeleen","Kaur",3)
				);
		
//		String[] arr = {"1,2,3,3,4,5,5,7"};
		
//		System.out.println(people.stream().filter(p->p.getLastname().startsWith("K")).count());
//		people.stream().filter(p->p.getLastname().startsWith("K")).forEach(p->System.out.println(p.getAge()));
		System.out.println(people.stream().filter(p->p.getLastname().equals("Kaur")).distinct().count());
		
	}
}
