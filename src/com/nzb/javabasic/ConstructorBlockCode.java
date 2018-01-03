package com.nzb.javabasic;

public class ConstructorBlockCode {
	
	{
		System.out.println("first code");
	}

	public ConstructorBlockCode() {
		System.out.println("constructor method");
	}
	
	{
		System.out.println("second block code");
	}
	
	public static void main(String[] args) {
		new ConstructorBlockCode();
		new ConstructorBlockCode();
		new ConstructorBlockCode();
	}
	
	

}
