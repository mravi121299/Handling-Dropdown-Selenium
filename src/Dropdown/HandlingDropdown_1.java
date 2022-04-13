package Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HandlingDropdown_1 {
	@Test
	public void jspromptdemo() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\DXC Training testing tools\\DXC Selenium Automation  Class\\LaunchChromeBroweser\\chromebrowersjars\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/campaign/landing.php");
		
		
		//For month
		
		WebElement month_Dropdown = driver.findElement(By.id("month"));
		Select month_dd = new Select(month_Dropdown);
		/*
		  month_dd.selectByIndex(3);
		Thread.sleep(10000);
		month_dd.selectByValue("9");
		Thread.sleep(10000);
		month_dd.selectByVisibleText("Aug");
		*/
		
		List<WebElement> month_List = month_dd.getOptions();
		int total_month = month_List.size();
		System.out.println("Total months is...." + total_month);
		
		for (WebElement ele: month_List) {
			String month_name =ele.getText();
			System.out.println("Month name is :"+month_name);
		}
		
		
		
		

}}
