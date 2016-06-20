/**
 * 
 */
package com.oocl.mnlbc.homework.w1d5;

public class Arg{
static String[] MyArg;
int i;
static int j;

        public static void main(String argv[]){
        	MyArg=argv;
        	
        	int k = i;
        	int m = j;
        	
        	amethod();
        	amethod2();
        }

        public void amethod(){
                System.out.println(MyArg[1]);
        }
        
        public static void amethod2(){
            System.out.println(MyArg[1]);
    }
}

