package com.corp.myxof.dp.singleton;

public class SingletonV2 {
	private static SingletonV2 instance = null;
	private SingletonV2(){
		
	}
	public static SingletonV2 getInstance(){
		if(instance == null){
			synchronized (SingletonV2.class) {
				if(instance == null){
					instance = new SingletonV2();
				}
			}
		}
		return instance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
