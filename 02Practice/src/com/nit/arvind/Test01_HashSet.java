//Test01_HashSet.java
package com.nit.arvind;

import java.util.HashSet;
import java.util.Set;

public class Test01_HashSet {
	public static void main(String[] args) {
		Set<Object> hs1 = new HashSet<>();
		
		
		System.out.println("empty       :" + hs1.isEmpty());
		//System.out.println("capacity    :" + hs1.capacity());
		System.out.println("size            :" + hs1.size());
		System.out.println("elem          :" + hs1);
		
		System.out.print(hs1.add("a"));		System.out.println("\t\t   :" + hs1);
		System.out.print(hs1.add("b"));		System.out.println("\t\t   :" + hs1);
		System.out.print(hs1.add(5));			System.out.println("\t\t   :" + hs1);
		System.out.print(hs1.add(6.7));		System.out.println("\t\t   :" + hs1);
		System.out.print(hs1.add('p'));		System.out.println("\t\t   :" + hs1);
		System.out.print(hs1.add(true));	System.out.println("\t\t   :" + hs1);
		System.out.print(hs1.add(null));		System.out.println("\t\t   :" + hs1);
		System.out.print(hs1.add(97));		System.out.println("\t\t   :" + hs1);
		System.out.print(hs1.add(98));		System.out.println("\t\t   :" + hs1);
		System.out.print(hs1.add('a'));		System.out.println("\t\t   :" + hs1);
		System.out.println(((String)"a").hashCode() % 16);
		System.out.println(((Character)'a').hashCode() % 16);
		
		System.out.print(hs1.add(new Integer(97)));		System.out.println("\t\t   :" + hs1);
		System.out.println("size            :" + hs1.size());
	}
}
