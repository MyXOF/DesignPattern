package com.corp.myxof.dp.singleton;

public class Singleton {
	private static Singleton instance = new Singleton();
	
	private Singleton(){
		
	}
	
	public static Singleton getInstance(){
		return instance;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
