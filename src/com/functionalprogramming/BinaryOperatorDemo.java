package com.functionalprogramming;

import java.util.function.BinaryOperator;

public class BinaryOperatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerRecords cr = new CustomerRecords();
		

		BinaryOperator<Customer> binaryOperator =  BinaryOperator.maxBy((a,b)->{
			if(a.getPlanAmount() == b.getPlanAmount()) {
				return 0; 
			}
			else if(a.getPlanAmount() > b.getPlanAmount()) {
				return 1;
			}
			else {
				return -1;
			}
		});
		
		System.out.println(binaryOperator.apply(cr.list.get(0), cr.list.get(1)));
		
	}

}
