package com.oocl.mnlbc.homework.w2.d1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionSortTest {
	public static void main(String[] args) {  
	        User user1 = new User();  
	        user1.setName("a");  
	        user1.setOrder(11);  
	        User user2 = new User();  
	        user2.setName("b");  
	        user2.setOrder(2);  
	        User user3 = new User();  
	        user3.setName("c");  
	        user3.setOrder(5);  
	  
	        Set<User> Hset = new HashSet<User>();  
	        Hset.add(user2);  
	        Hset.add(user1);  
	        Hset.add(user3);  
	  
	        List<User> list = new ArrayList<User>();  
	        list.addAll(Hset);  
	  
	  
	        Collections.sort(list, new Comparator<User>(){  
	            public int compare(User arg0, User arg1) {  
	                return -arg0.getOrder().compareTo(arg1.getOrder());  
	            }  
	        });  
	        for(User u : list){  
	            System.out.println("Name: " + u.getName() + " Order: " + u.getOrder());  
	        }  
	}
}