package com.nit.arvind;

import java.util.LinkedHashMap;

public class Test11_LinkedHashMap {
	public static void main(String[] args) {
		
		LinkedHashMap<Object, Object> lhm = new LinkedHashMap<>();
		
		System.out.println(lhm.size());
		System.out.println(lhm);
		System.out.println(lhm.put("a", 1));
		System.out.println(lhm.put("b", 2));
		System.out.println(lhm.put(5, 3));
		System.out.println(lhm.put(null, 4));
		System.out.println(lhm.put(new Ex(5, 6), 5));
		System.out.println(lhm);
		System.out.println(lhm.put("a", 7));
		System.out.println(lhm.put(5, 8));
		System.out.println(lhm.put(new Ex(5, 6), 9));
		
		System.out.println(lhm);
		
	}
}
