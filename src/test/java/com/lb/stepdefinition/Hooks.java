package com.lb.stepdefinition;

import com.lb.resources.CommonActions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends CommonActions{
	CommonActions ca=new CommonActions();
	public static String url="https://storefront:lbbrand2022@sfqa.lanebryant.com/";
	@Before
	public void beforeScenario() {
		System.out.println("Before scenario");
		ca.driverLaunch(url);		
	}

	@After
	public void afterScenario() {
		System.out.println("After scenario");
		ca.driver.quit();
	}
}
