package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetsMain {

	public static void main(String[] args) {


		//sets remove any duplicate stores in order in list with unique elements
		//HashSet - does not maintain storing order and faster
		Set<String> set = new HashSet<String>();
		
		set.add("BMW");
		set.add("Audi");
		set.add("Honda");
		set.add("Honda");
		System.out.println("sets: " + set);
		
		System.out.println("");
		System.out.println("HashSet:");
		for (String string : set) {
			System.out.println("items: " + string);
		}
		
		//linkedHashSet - it maintains the order in which the elements are added
		Set<String> linkedHashSet = new LinkedHashSet<String>();
		linkedHashSet.add("BMW");
		linkedHashSet.add("Audi");
		linkedHashSet.add("Honda");
		linkedHashSet.add("Honda");
		
		System.out.println("");
		System.out.println("LinkedHashSet:");
		for (String string : linkedHashSet) {
			System.out.println(string);
		}
		
		
		//treeSet - it maintains the natural sorting 1,2,3 ... alphabetical
		Set<String> treeSet = new TreeSet<String>();
		treeSet.add("BMW");
		treeSet.add("Audi");
		treeSet.add("Honda");
		treeSet.add("Honda");
		
		System.out.println("");
		System.out.println("TreeSet:");
		for (String string : treeSet) {
			System.out.println(string);
		}
		
		//list you can store any duplicates any way
		List<String> list = new ArrayList<String>();
		list.add("BMW");
		list.add("Audi");
		list.add("Honda");
		list.add("Honda");
		System.out.println("");
		System.out.println("list: " + list);
	}

}
