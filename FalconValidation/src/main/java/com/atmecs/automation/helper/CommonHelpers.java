package com.atmecs.automation.helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;





public class CommonHelpers {
	
	public static void SendkeysAction(WebDriver driver, String elementPath, String value) {
		driver.findElement(By.xpath(elementPath)).sendKeys(value);
	}

	public static void clickAction(WebDriver driver, String elementPath) {
		driver.findElement(By.xpath(elementPath)).click();
		
	}
	
	
	}
	/*
	 * public static boolean validateText(WebElement element , String expectedText)
	 * {
	 * 
	 * }
	 * 
	 * actualtext = element.getText(); try { Assert.assertEquals(actualtext,
	 * expectedText); System.out.println(actualtext +" is present"); return true; }
	 * catch (AssertionError assertionError) { System.out.println(actualtext
	 * +" is not present"); return false; }
	 */

	/*
 * public static WebElement element;
 * 
 * public static WebElement findElement(WebDriver driver, String locatorType,
 * String locatorValue) { try { switch (locatorType) { case "Xpath": element =
 * driver.findElement(By.xpath(locatorValue)); break; case "Id": element =
 * driver.findElement(By.id(locatorValue)); break; case "Name": element =
 * driver.findElement(By.name(locatorValue)); break; case "CssSeletor": element
 * = driver.findElement(By.cssSelector(locatorValue)); break; case "LinkText":
 * element = driver.findElement(By.linkText(locatorValue)); break; case
 * "PartialLinkText": element =
 * driver.findElement(By.partialLinkText(locatorValue)); break; case "TagName":
 * element = driver.findElement(By.tagName(locatorValue)); break; } } catch
 * (NullPointerException e) { System.out.println("Element is not clicked"); }
 * return element; }
 * 
 * // public static List <WebElement> findElements(WebDriver driver, String //
 * elementPath) { // List <WebElement> listOfElements = //
 * driver.findElements(By.xpath(elementPath)); // return listOfElements; // }
 * 
 * public static void clickElement(WebDriver driver, String element) {
 * driver.findElement(By.xpath(element)).click(); }
 * 
 * public static void sendKeys(WebDriver driver, WebElement element, String
 * text) { element.sendKeys(text); }
 * 
 * public static void moveOver(WebDriver driver, String elementPath) {
 * WebElement mouseOver = driver.findElement(By.xpath(elementPath)); Actions
 * action = new Actions(driver); action.moveToElement(mouseOver).perform(); }
 * 
 * public static boolean pageValidation(String actualDetails, String
 * expectedDetails) { try { Assert.assertEquals(actualDetails, expectedDetails);
 * System.out.println("validation is done for:" + actualDetails); return true; }
 * catch (AssertionError assertionError) { return false; } }
 * 
 * public static void explicitWait(WebDriver driver, String xpath) {
 * WebDriverWait wait = new WebDriverWait(driver, FilePath.page_load_timeout);
 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
 * element.click(); } public static void getText(String actualDetails, String
 * expectedDetails) { String text=element.getText(); System.out.println(“Text
 * obtained is”); if(text.contains(expectedDetails)){
 * System.out.println(“Expected text is obtained”); }else{
 * System.out.println(“Expected text is not obtained”); }
 * 
 */