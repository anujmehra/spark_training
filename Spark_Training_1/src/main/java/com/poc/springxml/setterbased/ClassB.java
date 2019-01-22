package com.poc.springxml.setterbased;

public class ClassB {

	private ClassA classARef;
	
	public void doWork(){
		System.out.println("-------inside ClassB: doWork --------");
		System.out.println("------- calling classA method ------");
		
		classARef.doWork();
	}

	public void setClassARef(ClassA classARef) {
		this.classARef = classARef;
	}
	
}
