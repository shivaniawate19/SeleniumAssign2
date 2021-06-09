package waits;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitClass {

	public static void main(String[] args, FluentWait<WebDriver> wait) {
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
//		//1.Implicit wait
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.findElement(By.id("email")).sendKeys("abcde");
//		driver.findElement(By.name("email")).sendKeys("12345");
//		
//		//2.Explicit wait - 1st way
//		WebDriverWait wait = new WebDriverWait(driver, 20);
//		WebElement username = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@name='email']"))));
//		username.sendKeys("abcde");
//		
//		//2nd way
//		WebElement pass = driver.findElement(By.xpath("//input[@name='pass']"));
//		wait.until(ExpectedConditions.visibilityOf(pass));
//		pass.sendKeys("1234");
//		
		//3rd way
		String title = "facebook login";
		wait.until(ExpectedConditions.titleContains(title));
		wait.until(ExpectedConditions.titleIs("facebook login"));
		
//		//4th way
//		WebElement button =  driver.findElement(By.xpath("//button[@name=\"login\"]"));
//		wait.until(ExpectedConditions.elementToBeClickable(button));
//		button.click();
//		
//		
//		//3.Fluent wait
//		Wait<WebDriver> wait1 = new FluentWait<WebDriver>(driver)
//				.withTimeout(30, TimeUnit.SECONDS)
//				.pollingEvery(5, TimeUnit.SECONDS)
//				.ignoring(NoSuchElementException.class);
//		
//		WebElement username1 = driver.findElement(By.xpath("//input[@name='email']"));
//		username1.sendKeys("abcd");
//		
		
		
		
				
		
		
	
		

	}

}
