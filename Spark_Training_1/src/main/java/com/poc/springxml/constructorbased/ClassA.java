package com.poc.springxml.constructorbased;

public class ClassA {

	private String key;
	
	public ClassA(String key){
		this.key = key;
	}
	
	public void doWork(){
		System.out.println("-------inside ClassA: doWork -------- value of key =" + key);
	}
		
}
