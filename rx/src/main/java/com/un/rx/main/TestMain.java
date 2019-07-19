package com.un.rx.main;

class TestMain {

	public static void main(String[] args) {
		String str = "_普维光电";
		byte[] res = str.getBytes();
		for(byte r:res){
			System.out.print(r);
			System.out.print(" ");
		}
	}
}
