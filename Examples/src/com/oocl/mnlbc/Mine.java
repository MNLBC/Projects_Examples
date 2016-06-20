package com.oocl.mnlbc;

import java.io.*;

public class Mine {
	public static void main(String argv[]) {
		Mine m = new Mine();
		System.out.println(m.amethod());
	}

	public int amethod() {
		try {
			FileInputStream dis = new FileInputStream("d:/test.txt");
			
			String str1 = "Hello";
			String str2 = null;
			String str3 = str2.concat(str1);//(2, 3);
			System.out.println(str3);
//		} catch (NullPointerException e ) {		
//			System.out.println("Exception : " + e);
		} catch (FileNotFoundException fne) {
			System.out.println("No such file found");
			return -1;
//		} catch (IOException ioe) {
		} finally {
			System.out.println("Doing finally");
		}

		return 0;
	}

}
