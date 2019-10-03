package DesignPattern;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Configuration.Constants;
import Configuration.TestBase;

public class FreeCrm {
	
	@BeforeMethod
	public void setUp() {
		TestBase.initialize();
	}
	@Test(priority=1)
	public void verifyFreeCrmTitleTest(){
	String title = TestBase.driver.getTitle();
	System.out.println("Actual---------page title is: ------------"+ title);
	Assert.assertEquals(title, Constants.loginPageTitle);
	System.out.println(title);
	}

	@Test(priority=2)
	public void logoTest(){
	Assert.assertEquals(TestBase.driver.findElement(By.xpath("//*[@id='pbs-close-confirm']")).isEnabled(), true);
	System.out.println("-------------THURSDAY OCTOBER 3 ----------");
	//	TestBase.driver.findElement(By.xpath("//*[@id=\"pbs-close-confirm\"]")).click();
	}
	@AfterMethod
	public void tearDown() {
		System.out.println("Add NEW**********output message at tearDown");
		TestBase.quit();
		
	}
}
