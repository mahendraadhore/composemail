import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {
	
	public static void main(String[] args) {
	    System.setProperty("webdriver.chrome.driver", "F:/Program files/chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			
			driver.get("https://mail.google.com");
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			driver.findElement(By.id("identifierId")).sendKeys("saisha1803");
			
			driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
			
		
			
			driver.findElement(By.cssSelector("input[name='password']")).sendKeys("Mahi0712");
			
			driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/span")).click();

			driver.findElement(By.xpath("//*[@id=\":39\"]/div/div")).click();
			
			WebElement to = driver.findElement(By.cssSelector("body > div:nth-child(38) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(4) > table:nth-child(2) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(2) > form:nth-child(1) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(2) > div:nth-child(1) > div:nth-child(1) > textarea:nth-child(2)"));
			to.sendKeys("smahiaa01@gmail.com");
			to.sendKeys(Keys.TAB);
			
			WebElement subject = driver.findElement(By.cssSelector("body > div:nth-child(38) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(4) > table:nth-child(2) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(2) > form:nth-child(1) > div:nth-child(3) > input:nth-child(1)"));
			
			subject.sendKeys("Incubyte");
			
			subject.sendKeys(Keys.TAB);
			
			driver.findElement(By.cssSelector("body > div:nth-child(38) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(4) > table:nth-child(2) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(2) > table:nth-child(3) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > table:nth-child(2) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(2) > div:nth-child(2) > div:nth-child(1)")).sendKeys("Automation QA test for Incubyte");
		
		
			WebElement Attachment = driver.findElement(By.cssSelector("body > div:nth-child(38) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(4) > table:nth-child(2) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(2) > table:nth-child(3) > tbody:nth-child(1) > tr:nth-child(2) > td:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(4) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(4) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)"));
			
			Attachment.click();
			Attachment.sendKeys("C:/Users/HP-Laptop/Mahendra Adhore.docx");
			
			

		}


}
