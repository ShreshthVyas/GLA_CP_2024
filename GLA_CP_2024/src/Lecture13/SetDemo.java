package Lecture13;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer>  set = new HashSet<>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(10);
		set.add(10);
		set.add(20);
		set.add(10);
		set.add(40);
		System.out.println(set);
		
		set.contains(10);
		for (Integer i : set) {
			System.out.println(i);
		}
		
		TreeSet<Integer>  tset = new TreeSet<>();
		tset.add(100);
		tset.add(50);
		tset.add(150);
		tset.add(50);
		tset.add(10);
		tset.add(50);
		tset.add(150);
		
		System.out.println(tset);
		
		LinkedHashSet<Integer> lset = new LinkedHashSet<>();
		lset.add(20);
		lset.add(10);
		lset.add(40);
		lset.add(30);
		lset.add(20);
		lset.add(10);
		
		System.out.println(lset);
		
	}

}
