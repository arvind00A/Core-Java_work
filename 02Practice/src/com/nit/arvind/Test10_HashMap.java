//HashMap.java
package com.nit.arvind;

import java.util.HashMap;

public class Test10_HashMap {
	public static void main(String[] args) {
		HashMap<Object, Object> hs = new HashMap<>();
		
		System.out.println("size\t\t\t\t:" + hs.size());
		System.out.println("elem	\t\t:" + hs);
		
		System.out.print(hs.put("a", 5));			System.out.println("\t\t"+hs);
		//System.out.print(hs.put("a", 1));			System.out.println("\t\t"+hs);
		System.out.print(hs.put("b", 6));			System.out.println("\t\t"+hs);
		System.out.print(hs.put("a", 7));			System.out.println("\t\t"+hs);
		
	}
}
