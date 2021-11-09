package org.test;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Device\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");

		
		WebElement dd = driver.findElement(By.id("Skills"));
	Select s = new Select (dd);
	
	s.selectByIndex(10);
	
	List<WebElement> options = s.getOptions();
	
	int len = options.size();
	System.out.println(len);
	
	WebElement element = options.get(10);
	String data = element.getText();
	System.out.println(data);
	
	String data1 = element.getAttribute("value");
	System.out.println(data1);
	
	for (int i = 0; i <options.size(); i++) {
		
		WebElement element2 = options.get(i);
	String data2 = element2.getText();
	System.out.println(data2);
	
	}
	/*for (WebElement e : options) {
		String text = e.getText();
		System.out.println(text);
	}*/
	
	
	
	
	
	
	}
	
}
