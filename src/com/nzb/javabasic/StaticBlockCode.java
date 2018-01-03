package com.nzb.javabasic;

class Code {
	{
		System.out.println("Code block");
	}

	static {
		System.out.println("static Code");
	}

	public Code() {
		System.out.println("Code constructor method");
	}

}

public class StaticBlockCode {

	{
		System.out.println("StaticBlockCode block code");
	}

	static {
		System.out.println("StaticBlockCode static code");
	}

	public StaticBlockCode() {
		System.out.println("StaticBlockCode constructor code");
	}

	public static void main(String[] args) {
		System.out.println("StaticBlockCode main method");
		new Code();
		new StaticBlockCode();
	}

}
