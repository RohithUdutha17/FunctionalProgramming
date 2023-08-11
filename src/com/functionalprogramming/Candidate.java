package com.functionalprogramming;

import java.util.function.Predicate;

public class Candidate {

	int arr[] = {12,23,11,19,35,22};
	public void checkAge(Predicate<Integer> p) {
		for(int i:arr) {
			if(p.test(i)) {
				System.out.println("valid age");
			}else {
				System.out.println("Invalid age");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Candidate c = new Candidate();
		c.checkAge((e)->e>18);
	}

}
