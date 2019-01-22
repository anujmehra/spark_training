package com.poc.springxml.constructorbased;

public class ClassB {

	private ClassA classARef;

	public ClassB(final ClassA classARef) {
		this.classARef = classARef;
	}

	public void doWork() {
		System.out.println("-------inside ClassB: doWork --------");
		System.out.println("------- calling classA method ------");

		classARef.doWork();
	}

}
