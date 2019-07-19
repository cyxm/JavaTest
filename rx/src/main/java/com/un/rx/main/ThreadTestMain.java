package com.un.rx.main;

class ThreadTestMain {

	public static void main(String[] args) {
		int activeCount=Thread.activeCount();
		System.out.println(activeCount);

		Thread.dumpStack();
	}
}
