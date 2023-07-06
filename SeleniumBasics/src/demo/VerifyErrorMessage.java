package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyErrorMessage {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("bothasaikiran@7870");
		driver.findElement(By.id("pass")).sendKeys("7870");
		driver.findElement(By.name("login")).click();
 String expectedErrMsg = "The email address or mobile number you entered isn't connected to an account. Find your account and log in.";
 //String actualErrMsg = driver.findElement(By.cssSelector("#email_container > div._9ay7")).getText();
String actualErrMsg = driver.findElement(By.xpath("//*[@id=\"email_container\"]/div[2]")).getText();
 if (expectedErrMsg.equals(actualErrMsg)) {
	 System.out.println("test case passed");
 }
 else {
	 System.out.println("test case failed");
 }
 driver.quit();
	}

}
