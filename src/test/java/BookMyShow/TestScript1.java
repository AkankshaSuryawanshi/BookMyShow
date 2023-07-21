package BookMyShow;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestScript1 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new FirefoxDriver();
		driver.get(" https://in.bookmyshow.com/explore/home/");
		Thread.sleep(2000);

		WebElement city = driver.findElement(By.xpath(".//span[contains(.,'Bengaluru')]"));
		city.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//div[@class='sc-iGPElx jsSlsO']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(.//div[@class='sc-RefOD iCukgs'])[2]")).click();
		Thread.sleep(2000);
		for (String win : driver.getWindowHandles()) {
			driver.switchTo().window(win);
			
		}
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//input[@id='emailId']")).sendKeys("suyash3424@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//button[@class='sc-exAgwC dmTBNW']")).click();
		Thread.sleep(2000);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("http://www.yopmail.com/en/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='login']")).sendKeys("suyash3424@yopmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//i[@class='material-icons-outlined f36']")).click();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		WebElement tgt = driver.findElement(By.xpath("(.//div[@class=\"lms\"])[1]"));
		System.out.println(tgt.getText());
		 Thread.sleep(5000);
		//driver.switchTo().defaultContent();
		Set<String> ref=driver.getWindowHandles();
		Iterator<String> itr = ref.iterator();
		String refid=itr.next();
		driver.switchTo().window(refid);
		driver.findElement(By.xpath(".//input[@class='sc-gJWqzi hDJdIS']")).sendKeys("123456");
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//button[@class='sc-eLExRp ctptQL']")).click();
		WebElement userInfo=driver.findElement(By.xpath(".//span[@class='sc-etwtAo kqixli']"));
		String userName=userInfo.getText();
		if(userName.equalsIgnoreCase("Hi,Guest")) {
			System.out.println("HI GUEST IS DISPLAYED");
			System.out.println("PROGRAM EXECUTED SUCCESSFULLY");
		}
		
		
	
	}

}
