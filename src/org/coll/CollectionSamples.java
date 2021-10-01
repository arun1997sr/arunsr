package org.coll;

import java.util.LinkedList;
import java.util.List;

public class CollectionSamples {
	public static void main(String[] args) {
		
	List <Integer> s=new LinkedList<>();
	
	s.add(1);
	s.add(5);
	s.add(15);
	s.add(17);
	s.add(5);
	
	System.out.println(s);
	
	//iterate
	for (Integer integer : s) {
		System.out.println(integer);
	}
	
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	


