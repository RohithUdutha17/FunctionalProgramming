package com.functionalprogramming;

import java.util.ArrayList;
import java.util.function.Function;

public class RechargeConsumerData {

	ArrayList<Recharge> list = new ArrayList<>();
	public RechargeConsumerData(){
		list.add(new Recharge(1,150,"20th sep 2023"));
		list.add(new Recharge(2,250,"20th oct 2023"));
		list.add(new Recharge(3,100,"24th sep 2023"));
		list.add(new Recharge(4,450,"18th nov 2023"));
	}
	public void rechargeData(Function<Recharge,String> function) {
		for(Recharge r:list) {
			System.out.println(function.apply(r));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RechargeConsumerData rcd = new RechargeConsumerData();
		rcd.rechargeData((r)->r.getCustomerId()+" "+r.getAmount());
	}

}
