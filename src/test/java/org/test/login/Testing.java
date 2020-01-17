package org.test.login;

import java.io.IOException;

import org.apache.poi.ss.usermodel.CellValue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Testing extends BaseClass {
	public static void main(String[] args) throws IOException, Throwable {
		//Launch Browser
		BaseClass.launchChromeBrowser();
		BaseClass.deleteCookies();
		
		//open Url
		BaseClass.openUrl("https://www.tillys.com/");
		
		//Maximize
		BaseClass.maximize();
		
		//ScreenShot
		BaseClass.ScreenShot("0111.jpg");
		
		//MouseHover
		WebElement btnMen=driver.findElement(By.id("mens"));
		mouseHover(btnMen);
		
		//ScreenShot
		BaseClass.ScreenShot("0112.jpg");
		
		//click
		WebElement btn=driver.findElement(By.xpath("(//a[contains(text(),'New Arrivals')])[1]"));
		btnClick(btn);
		
		//ScreenShot
		BaseClass.ScreenShot("0113.jpg");
		
		//Scroll down
		WebElement scrl=driver.findElement(By.xpath("//a[@title='Go to Product: SANTA CRUZ x Spongebob Jellyfishing Mens T-Shirt']"));
		scrollDown(scrl);
		
		//Button click
		WebElement btnHoodie=driver.findElement(By.xpath("//a[@title='Go to Product: VANS New Stax Mens Hoodie']"));
		btnClick(btnHoodie);
		
		//ScreenShot
		BaseClass.ScreenShot("0114.jpg");
		
		//btnClick
		WebElement btnSize=driver.findElement(By.xpath("//a[@title='Select Size: M']"));
		btnClick(btnSize);
		
		//Wait
		Thread.sleep(3000);
		
		//Drop Down
		WebElement qty=driver.findElement(By.xpath("//select[@name='Quantity']"));
		selectByValue(qty, "2");
		
		//ScreenShot
		BaseClass.ScreenShot("0115.jpg");
		
		//Scroll Down
		WebElement scrlCart=driver.findElement(By.xpath("(//img[@class='brand-logo'])[1]"));
		scrollDown(scrlCart);
		
		//Wait
		Thread.sleep(3000);
		
		//Button Click
		WebElement btnAddToCart=driver.findElement(By.xpath("//button[@title='Add to Bag']"));
		btnClick(btnAddToCart);
		
		//ScreenShot
		BaseClass.ScreenShot("0116.jpg");
		
		//Wait
		Thread.sleep(6000);
		
		//Button Click
		WebElement signIn=driver.findElement(By.xpath("(//a[@title='User: Sign In'])[4]"));
		btnClick(signIn);
		
		//Wait
		Thread.sleep(5000);
		
		//Button Click
		WebElement email= driver.findElement(By.xpath("//input[@class='input-text email  required']"));
		btnClick(email);
		
		//Excel read
		WebElement emailText= driver.findElement(By.xpath("//input[@class='input-text email  required']"));
		emailText.sendKeys(excelRead(1, 0));
		
		//Button Click
		WebElement pass= driver.findElement(By.xpath("//input[@class='input-text null  required']"));
		btnClick(pass);
		
		//excel read
		WebElement passText= driver.findElement(By.xpath("//input[@class='input-text null  required']"));
		passText.sendKeys(excelRead(1, 1));
		
		//ScreenShot
		BaseClass.ScreenShot("0117.jpg");
		
		//Button click
		WebElement sub= driver.findElement(By.xpath("//button[@value='Sign In']"));
		btnClick(sub);
		
		//ScreenShot
		BaseClass.ScreenShot("0118.jpg");
		
		//ButtonClick
		WebElement btnProfile= driver.findElement(By.xpath("(//a[@title='Show or update your personal information'])[1]"));
		btnClick(btnProfile);
		
		//ScreenShot
		BaseClass.ScreenShot("0119.jpg");
		
		//Wait
		Thread.sleep(3000);
		
		//Button Click
		WebElement btnApply= driver.findElement(By.xpath("(//button[contains(text(),'Apply')])[1]"));
		btnClick(btnApply);
		
		//button click
		WebElement miniCart=driver.findElement(By.xpath("//span[@class='minicart-quantity']"));
		btnClick(miniCart);
		
		//Excel write
		WebElement proName=driver.findElement(By.xpath("//a[@class='product-name-link']"));
		String text = proName.getText();
		writeExcel(1,0,text);
		
		//screenshot
		BaseClass.ScreenShot("01110.jpg");
		
		
	}
	
}
