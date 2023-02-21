package com.migration.code.t8h;

public class FunctionalInterfacesProgram {

	public static void main(String[] args) {

		Runnable r = new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
			}
		};

		Runnable r1 = () -> {
			System.out.println("....");
		};

		Interface1 i1 = (s) -> System.out.println(s);
		i1.method1("ss");
	}
}
