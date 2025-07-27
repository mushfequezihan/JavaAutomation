package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapsMain {

	public static void main(String[] args) {

		// stores in pairs, key -> value : Entry
		// HashMap - does not maintain order - no guarantee
		// hash map only allow one null key - faster
		Map<Integer, String> hashMap = new HashMap<Integer, String>();

		hashMap.put(1, "BMW");
		hashMap.put(6, "Audi");
		hashMap.put(4, "Honda"); // initial key4 value

		String value1 = hashMap.get(1);
		System.out.println("value of key1: " + value1);

		// will return null as there are no key as 2
		String value2 = hashMap.get(2);
		System.out.println("value of key2: " + value2);

		// keys are unique, and values can be duplicated
		hashMap.put(2, "BMW"); // added key 2

		String value3 = hashMap.get(2);
		System.out.println("value of key2: " + value3);

		// keys can not be duplicated but override (Honda with MBenz)
		hashMap.put(4, "M-Benz"); // replaced with previous key4

		String value4 = hashMap.get(4);
		System.out.println("value of key4: " + value4);

		// Iteration can be done below 2 WAY through Maps
		System.out.println("");
		System.out.println("Iteration1 HashMap1:");
		for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {

			int key = entry.getKey();
			String values = entry.getValue();
			System.out.println("Map key: " + key + " values: " + values);
		}

		System.out.println("");
		System.out.println("Iteration2 HashMap2:");
		for (Integer key : hashMap.keySet()) {

			String values = hashMap.get(key);
			System.out.println("Map key: " + key + " values: " + values);
		}

		// linked hash map - maintain the order in which they are added
		Map<Integer, String> linkMap = new LinkedHashMap<Integer, String>();

		linkMap.put(1, "BMW");
		linkMap.put(6, "Audi");
		linkMap.put(4, "Honda");

		System.out.println("");
		System.out.println("Iteration3 linkedMap:");
		for (Integer key : linkMap.keySet()) {

			String values = linkMap.get(key);
			System.out.println("Map key: " + key + " values: " + values);
		}

		// Maintain natural sorting
		Map<Integer, String> treeMap = new TreeMap<Integer, String>();
		treeMap.put(1, "BMW");
		treeMap.put(6, "Audi");
		treeMap.put(4, "Honda");

		System.out.println("");
		System.out.println("Iteration4 treeMap:");
		for (Integer key : treeMap.keySet()) {

			String values = treeMap.get(key);
			System.out.println("Map key: " + key + " values: " + values);
		}
	}

}
