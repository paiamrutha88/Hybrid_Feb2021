package com.test.TestProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebTable {
	
	public WebDriver driver;
	
	
	@Test
	public void webTableTest() throws InterruptedException
	{
		String company="Tata Steel";
		
		driver = new ChromeDriver();
				
		driver.get("https://portfolio.rediff.com/portfolio-login");
		driver.findElement(By.id("useremail")).sendKeys("paiamrutha88@gmail.com");
		driver.findElement(By.id("userpass")).sendKeys("caps9876");
		driver.findElement(By.id("loginsubmit")).click();
		
		
		int rowNum= getRowNumWithCellData("//table[@id='stock']",company,"xpath");
		
		Assert.assertTrue(rowNum != -1 , "Company name not found " +company);
		String price = driver.findElement(By.xpath("//table[@id='stock']/tbody/tr["+rowNum+"]/td[7]")).getText();
		
		System.out.println(company +" "+ price);
		
		
		
	}
	
	public int getRowNumWithCellData(String tableLocator, String cellData, String identifier)
	{
		List<WebElement> rows = null;
		
		if (identifier.equals("xpath"))
			rows= driver.findElements(By.xpath(tableLocator+"/tbody/tr"));
		else if (identifier.equals("css"))
			rows= driver.findElements(By.cssSelector(tableLocator+">tbody>tr"));
		
		
		for (int rNum=0; rNum<rows.size(); rNum++)
		{
			WebElement row = rows.get(rNum);
			
			List<WebElement> cells = row.findElements(By.tagName("td"));
			
			for (int cellNum=0; cellNum< cells.size(); cellNum++)
			{
				System.out.println(cells.get(cellNum).getText());
				
				if (cellData.equals(cells.get(cellNum).getText()))
					
					return (rNum+1);
				
			}
			
			System.out.println("-----------------");
		}
		
		return -1;
	}

}
