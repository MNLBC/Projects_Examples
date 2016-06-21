package com.oocl.mnlbc.homework.w2.d1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class TestWorker {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		List<Worker> wList = new ArrayList<>();
		wList.add(new Worker("Simon", 20, 10000));
		wList.add(new Worker("Jame", 25, 13000));
		wList.add(new Worker("Alex", 22, 12000));

		System.out.println("Name:\t\tAge:\t\tSalary:");
		for (Worker worker : wList) {
			System.out.println(worker.getName() + "\t\t" + worker.getAge() + "\t\t" + worker.getSalary());
		}
		System.out.println("--------------");

		wList.add(1, new Worker("Steven", 24, 15000));
		System.out.println("Name:\t\tAge:\t\tSalary:");
		for (Worker worker : wList) {
			System.out.println(worker.getName() + "\t\t" + worker.getAge() + "\t\t" + worker.getSalary());
		}
		System.out.println("--------------");

		wList.remove(3);

		System.out.println("\nFor Each");
		System.out.println("Name:\t\tAge:\t\tSalary:");
		for (Worker worker : wList) {
			System.out.println(worker.getName() + "\t\t" + worker.getAge() + "\t\t" + worker.getSalary());
		}

		System.out.println("\nIterator");
		Iterator<Worker> wIter = wList.iterator();
		while (wIter.hasNext()) {
			Worker worker = (Worker) wIter.next();
			worker.work();
		}

		System.out.println("\nSort");
		Collections.sort(wList);
//        Collections.sort(wList,new Comparator<Worker>(){
//            public int compare(Worker arg0, Worker arg1) {
//                return arg0.getSalary().compareTo(arg1.getSalary());
//            }
//        });
		
		
		for (Worker worker : wList) {
			System.out.println("Name: " + worker.getName() + "\t\tSalary: " + worker.getSalary());
		}

		Map<String, Worker> workMap = new HashMap<String, Worker>();
		int c = 0;
		for (Worker worker : wList) {
			workMap.put(Integer.toString(c + 1), worker);
			worker.setId(c);
			c++;
		}

		System.out.println("\nHashMap");
		for (Entry<String, Worker> entry : workMap.entrySet()) {
			String key = entry.getKey();
			Worker value = entry.getValue();
			System.out.println("Worker ID: " + key + "\t\tName: " + value.getName() + "\t\tAge: " + value.getAge()
					+ "\t\tSalary: " + value.getSalary());

		}
		System.out.println();
		for (String key : workMap.keySet()) {
			Worker value = workMap.get(key);
			System.out.println("Worker ID: " + key + "\t\tName: " + value.getName() + "\t\tAge: " + value.getAge()
					+ "\t\tSalary: " + value.getSalary());
		}
		System.out.println();

		for (Worker w : workMap.values()) {
			System.out.println("Worker ID: " + w.getId() + "\t\tName: " + w.getName() + "\t\tAge: " + w.getAge()
					+ "\t\tSalary: " + w.getSalary());
		}

	}
}