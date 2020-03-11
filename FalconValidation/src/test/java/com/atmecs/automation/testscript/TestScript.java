package com.atmecs.automation.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.ReporterConfig.Property;
//import org.testng.ReporterConfig.Property;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//import org.testng.asserts.Assertion;

//import com.atmecs.automation.datalocator.DataLocator;
//import com.atmecs.automation.helper.CommonHelpers;

public class TestScript {
	public WebDriver driver;
	// Assertion ass = new Assertion();

	/*
	 * Property properties; DataLocator path_name = new DataLocator();
	 * 
	 * @Test public void validation() throws Exception { path_name.getPathData();
	 * CommonHelpers.clickAction(driver, path_name.getFirsticon());
	 * CommonHelpers.clickAction(driver, path_name.getSecondicon());
	 * CommonHelpers.clickAction(driver, path_name.getThirdicon()); //
	 * System.out.println("ok");
	 */
//	}
	@BeforeTest
	public void browserOpen() {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://10.10.10.231:8082/#/app/dashboard");
		driver.manage().window().maximize();

	}

	@Test
	public void viewValidation() throws InterruptedException {
		String currentUrl1 = driver.getCurrentUrl();
		System.out.println(currentUrl1);

		driver.findElement(By.xpath("//*[text()=\"Recent Runs\"]")).click();
		Thread.sleep(1000);

		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		if (currentUrl1 != currentUrl) {
			System.out.println("user successfully navigate into view tab");
		}

	}

	@Test
	public void dashBoardValidation() throws InterruptedException {
		String currentUrl1 = driver.getCurrentUrl();
		System.out.println(currentUrl1);

		driver.findElement(By.xpath("//*[text()=\"View\"]")).click();
		Thread.sleep(1000);

		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		if (currentUrl1 != currentUrl) {
			System.out.println("user successfully navigate into view tab");
		}

	}
}
