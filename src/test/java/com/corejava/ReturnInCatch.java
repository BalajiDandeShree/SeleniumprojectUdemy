package com.corejava;

public class ReturnInCatch {

	public static void main(String[] args) {
     int a=3;
     int b;
     
     try {
    	 b=a/0;
     }catch (Exception e) {
		System.out.println("catch found");
		return;
	}finally {
		System.out.println("Finally");
	}

	}

}
