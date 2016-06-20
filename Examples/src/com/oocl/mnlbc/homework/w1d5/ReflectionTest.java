package com.oocl.mnlbc.homework.w1d5;

import java.lang.reflect.*;
public class ReflectionTest {

	public static void main(String[] args) {
		Camera cam = new Camera("Cannon", 2100.00);
		printObject(cam);
	}
	
	public static void printObject(Object obj){
		Class cls = obj.getClass(); // get the Class object of obj
		System.out.println(cls.getName()); // print out the name of the class "Camera"
		Field[] fields = cls.getDeclaredFields(); // get the declared fields of the class
		for(Field field : fields){
			Class cl = field.getType();
			System.out.println(cl.getName() + ": " + field.getName()); 
                    // "java.lang.String: band" or "double: price"
		}
	}

}
