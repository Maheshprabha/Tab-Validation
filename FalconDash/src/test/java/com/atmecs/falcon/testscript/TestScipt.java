package com.atmecs.falcon.testscript;

import java.util.Properties;

import org.openqa.selenium.By;

import org.testng.annotations.Test;

import com.atmecs.falcon.baseclass.BaseClass;
import com.atmecs.falcon.commonhelpers.CommonHelpers;
import com.atmecs.falcon.dataallcator.DataLocator;
import com.atmecs.falcon.dataallcator.ValidAllacator;

import com.atmecs.falcon.property.PropertyReader;

public class TestScipt extends BaseClass {

	Properties property;
	DataLocator path_name = new DataLocator();
	ValidAllacator valid_name = new ValidAllacator();
	PropertyReader reader = new PropertyReader();

	@Test
	public void action() throws Exception {
		path_name.getPathData();
		valid_name.getvalidData();

		CommonHelpers.clickAction(driver, path_name.firstbutton);
		Thread.sleep(2000);
//	    CommonHelpers.validate(driver, CommonHelpers.findElement(driver, path_name.api),valid_name.valid);
//	    CommonHelpers.imageValidation(driver, path_name.imagevalidate);
		String actual = driver.findElement(By.xpath("(//*[@class=\"list-group-item\"])[1]")).getText();
		System.out.println("Actual :" + actual);

		String expected = reader.propertyRead("./src/test/resources/testdata/dashboard.properties", "restapi");
		System.out.println("Expected :" + expected);

//	   CommonHelpers.validate(driver, actual, expected);
		String bartooltip = driver.findElement(By.xpath("(//td[@class=\"wd-xs hidden-xs hidden-sm\"])[1]"))
				.getAttribute("uib-tooltip");
		System.out.println("bartool :" + bartooltip);
		String expectedbartooltip = reader.propertyRead("./src/test/resources/testdata/dashboard.properties", "bartip");
		CommonHelpers.validate(driver, bartooltip, expectedbartooltip);
		String passtooltip = driver.findElement(By.xpath("(//*[@role=\"progressbar\"])[1]"))
				.getAttribute("uib-tooltip");
		System.out.println("actualpasstooltip ;" + passtooltip);
		String expectedPasstip = reader.propertyRead("./src/test/resources/testdata/dashboard.properties", "passtip");
		System.out.println("expectedpasstooltip :" + expectedPasstip);
		CommonHelpers.validate(driver, passtooltip, expectedPasstip);

	}
}