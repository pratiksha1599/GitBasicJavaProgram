package HashMap;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapconcept {
	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Apurva");
		hm.put(2, "Vishu");
		hm.put(3, "Anu");
		hm.put(4, "Radha");
		System.out.println(hm.get(4));
		for (Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());

		}

		System.out.println(hm);
		hm.remove(3);
		System.out.println(hm);
	}
}