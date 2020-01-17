package org.test.login;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TillysCredentials extends BaseClass {
	public static void main(String[] args) throws IOException, Throwable {
		WebElement firstNameText= driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		firstNameText.sendKeys(excelRead(1, 2));
		
		WebElement lastNameText= driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		lastNameText.sendKeys(excelRead(1, 3));
		
		WebElement addNameText= driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		addNameText.sendKeys(excelRead(1, 4));
		
		WebElement add1NameText= driver.findElement(By.xpath("(//input[@type='text'])[5]"));
		add1NameText.sendKeys(excelRead(1, 5));
		
		WebElement addcityText= driver.findElement(By.xpath("(//input[@type='text'])[7]"));
		addcityText.sendKeys(excelRead(1, 6));
		
		WebElement addzipText= driver.findElement(By.xpath("(//input[@type='text'])[8]"));
		addzipText.sendKeys(excelRead(1, 7));
		
		WebElement addphoneText= driver.findElement(By.xpath("(//input[@type='text'])[9]"));
		addphoneText.sendKeys(excelRead(1, 8));
		
		Thread.sleep(3000);
		
		WebElement state =driver.findElement(By.xpath("(//select[@class='input-select '])[1]"));
		selectByValue(state, "AK");
		
		Thread.sleep(3000);
		
		WebElement sex =driver.findElement(By.xpath("//select[@name='dwfrm_profile_customer_gender']"));
		selectByValue(sex, "1");
		
		Thread.sleep(3000);
		
		WebElement mnth =driver.findElement(By.xpath("//select[@name='dwfrm_profile_customer_birthdayMonth']"));
		selectByValue(mnth, "1");
		
        Thread.sleep(3000);
		
		WebElement day =driver.findElement(By.xpath("//select[@name='dwfrm_profile_customer_birthdayDay']"));
		selectByValue(day, "27");
		
        Thread.sleep(3000);
		
		WebElement year =driver.findElement(By.xpath("//select[@name='dwfrm_profile_customer_birthdayYear']"));
		selectByValue(year, "1994");
	}

}
