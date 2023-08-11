package com.functionalprogramming;

import java.util.ArrayList;
import java.util.function.Consumer;

public class PersonRecords {

	ArrayList<Person> list = new ArrayList<>();
	
	PersonRecords(){
		list.add(new Person("Ram","ram123@gmail.com"));
		list.add(new Person("Raju","raju123@gmail.com"));
		list.add(new Person("Rajesh","rajesh123@gmail.com"));
		list.add(new Person("Rahul","rahul123@gmail.com"));
	}
	
	public void displayRecords() {
		list.forEach(System.out::println);
	}
	
	public static void main(String args[]) {
		PersonRecords pr = new PersonRecords();
		//pr.displayRecords(System.out::println);
		pr.displayRecords();
	}
}
