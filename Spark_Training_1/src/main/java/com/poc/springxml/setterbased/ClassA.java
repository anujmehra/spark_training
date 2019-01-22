package com.poc.springxml.setterbased;

public class ClassA {

	private String key;
	
	public void doWork(){
		System.out.println("-------inside ClassA: doWork -------- value of key =" + key);
	}

	public void setKey(String key) {
		this.key = key;
	}
	
}
