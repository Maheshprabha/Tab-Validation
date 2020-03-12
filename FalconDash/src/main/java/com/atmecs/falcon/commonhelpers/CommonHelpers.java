package com.atmecs.falcon.commonhelpers;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.testng.Assert;

public class CommonHelpers {
	public static void SendkeysAction(WebDriver driver, String elementPath, String value) {
		driver.findElement(By.xpath(elementPath)).sendKeys(value);
	}

	public static void clickAction(WebDriver driver, String elementPath) {
		driver.findElement(By.xpath(elementPath)).click();
	}

	public static String findElement(WebDriver driver, String path) {
		String elementList = driver.findElement(By.xpath(path)).getText();
		System.out.println(elementList);
		return elementList;
	}

	public static void validate(WebDriver driver, String actual, String expected) {
		Assert.assertEquals(actual, expected);
		System.out.println(" Passed : " + " Expected : " + expected + " Actual : " + actual);
	}
	
	public static void imageValidation(WebDriver driver,String actual) {
		boolean validimage = driver.findElement(By.xpath(actual)).isDisplayed();
		try {
			Assert.assertEquals(validimage, true);
			System.out.println("image is present in the page");
			}
			catch(AssertionError e) {
			System.out.println("image is not present in the page" +e.getMessage());
			}
		/*
		 * public static void mouseHover(webDriver driver,driver) { Actions toolAct =
		 * new Actions(driver); toolAct.moveToElement(element).build().perform();
		 * WebElement toolTipElement =
		 * driver.findElement(By.cssSelector(".ui-tooltip")); String toolTipText =
		 * toolTipElement.getText(); System.out.println(toolTipText);
		 */
	}
	
//
//	public void Validations(String actualDetails, String expectedDetails) {
//		try {
//
//			Assert.assertEquals(actualDetails, expectedDetails);
//			System.out.println(" Passed : " + " Expected : " + expectedDetails + " Actual : " + actualDetails);
//		} catch (AssertionError assertionError) {
//			System.out.println(" Failed : " + " Expected : " + expectedDetails + " Actual : " + actualDetails);
//		}
//
//	}
	
	
	

}
