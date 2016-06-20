package com.oocl.mnlbc.homework.w1d5;

public class StrEq {
	public static void main(String argv[]) {
		StrEq s = new StrEq();
	}

	private StrEq() {
		String s = "Marcus";
		String s2 = new String("Marcus");
		String s3 = new String("Marcus");
		String s4 = "marcus";

		if (s == s2) {
			System.out.println("we have a match");
		} else {
			System.out.println("Not equal");
		}
		
		if (s2 == s3) {
			System.out.println("we have a match");
		} else {
			System.out.println("Not equal");
		}
		
		if (s.equals(s2)) {
			System.out.println("we have a match");
		} else {
			System.out.println("Not equal");
		}
		
		
		if (s.equals(s4)) {
			System.out.println("we have a match");
		} else {
			System.out.println("Not equal");
		}
		
		
		if (s == s4) {
			System.out.println("we have a match");
		} else {
			System.out.println("Not equal");
		}
		
		if (s.equalsIgnoreCase(s4)) {
			System.out.println("we have a match");
		} else {
			System.out.println("Not equal");
		}
	}
}
