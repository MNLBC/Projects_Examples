package com.oocl.mnlbc;

class Base {
}

class Sub extends Base {
}

class Sub2 extends Base {
}

public class CEx {
	public static void main(String argv[]) {
		Base b = new Base();
		// Sub s=(Sub) b; // error
		Sub s = new Sub();
		
		Base a = new Sub();
		Base b2 = (Base) s;

	}
}
