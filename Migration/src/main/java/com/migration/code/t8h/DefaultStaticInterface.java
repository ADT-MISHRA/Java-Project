package com.migration.code.t8h;

public class DefaultStaticInterface implements Interface1, Interface2 {

	@Override
	public void method2() {
		// TODO Auto-generated method stub

	}

	@Override
	public void method1(String str) {
		// TODO Auto-generated method stub

	}

	// compile without having it's own log() implementation
	@Override
	public void log(String str) {
		System.out.println("DefaultStaticInterface logging : " + str);
		Interface1.super.log("Demo");
	}

}
