package com.functionalprogramming;

import java.util.function.Predicate;

public class MethodReferenceDemo {
	int arr[] = {12,23,11,19,25,32,16,22};
	public void checkForEven(Predicate<Integer> p) {
		for(int i:arr) {
			if(p.test(i)) {
				System.out.println(i);
			}
		}
	}
	
	
	
	public static void main(String args[]) {
		MethodReferenceDemo m = new MethodReferenceDemo();
		MethodInterface mi = m::checkForEven;
		mi.checkEven((e)->e%2==0);
		
	}
}
