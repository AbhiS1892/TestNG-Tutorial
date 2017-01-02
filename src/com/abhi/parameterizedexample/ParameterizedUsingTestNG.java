package com.abhi.parameterizedexample;

import org.testng.annotations.*;

public class ParameterizedUsingTestNG {
	@Test
	@Parameters("myName")
	public void parameterTest(String myName) {
		System.out.println("Parameterized value is : " + myName);
	}
}
