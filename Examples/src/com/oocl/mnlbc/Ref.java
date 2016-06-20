package com.oocl.mnlbc;

public class Ref {
	public static void main(String argv[]) {
		Ref r = new Ref();
		r.amethod(r);
	}

	public void amethod(Ref r) {
		int i = 99;
		multi(r);
		System.out.println(i);
	}

//	private void multi(Ref r, int j) {
//		int i =0;
////		r.i = r.i * 2;
//	}
	
	private void multi(Ref r, int j) {//1
		
	}
	
	private void multi(Ref r) {//2
		
	}
	
	private void multi(Ref r, long j) {//3
		
	}
	
}
