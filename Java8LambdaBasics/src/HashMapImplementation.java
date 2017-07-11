import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapImplementation {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Harleen");
		map.put(1, "Soeleen");

		// Iterator<Integer> iter = map.
		Set<Map.Entry<Integer, String>> iter = map.entrySet();
		for (Entry entry : iter) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

		LinkedHashMap<Integer, String> lmap = new LinkedHashMap<Integer, String>();
		lmap.put(2, "Eshleen");
	}

}
