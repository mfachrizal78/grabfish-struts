package com.action;

class Print {
	
	public static void print() {
		System.out.println("hello");
	}
}
public class Test {

	public static void main(String arg[]) {
		int i = 5; 
		int j = i++ + ++i - i-- - --i;
		System.out.println(i);
		System.out.println(j);
		execute(null);
		System.out.println(System.getProperty("sun.arch.data.model")) ;
		
	}
	
	public static void execute(Print t) {
		t.print();
	}
}
