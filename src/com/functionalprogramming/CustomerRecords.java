package com.functionalprogramming;

import java.util.ArrayList;
import java.util.function.BinaryOperator;

public class CustomerRecords {
	ArrayList<Customer> list = new ArrayList<>();
	public CustomerRecords(){
		list.add(new Customer("ram","prepaid","Hyderabad",200));
		list.add(new Customer("raju","postpaid","Hanamkonda",300));
		list.add(new Customer("rahul","postpaid","Mumbai",20));
		list.add(new Customer("ramesh","prepaid","Warangal",1000));
	}
	
	public void displayRecords() {
		list.forEach(System.out::println);
	}
	public static void main(String args[]) {
		CustomerRecords cr = new CustomerRecords();
		
		cr.list.sort((i,j)->{
			if(i.getPlanAmount() == j.getPlanAmount()) {
				return 0;
			}
			else if(i.getPlanAmount()>j.getPlanAmount()) {
				return 1;
			}
			else {
				return -1;
			}
		});
		
		cr.list.removeIf((i)->i.getPlanAmount()<200);
		cr.displayRecords();
		
	}
}
