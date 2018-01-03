package com.nzb.javabasic;

public class OridinalCodeBlock {
	public static void main(String[] args) {
		{
			int x = 3;
			System.out.println("1, oridinal code variable x: " + x);
		}
		
		int x = 1;
		System.out.println("main method variable x: " + x);
		
		{
			int y = 7;
			System.out.println("2, oridinal code variable y:" +y);
		}
	}

}
