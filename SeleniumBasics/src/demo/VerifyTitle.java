package demo;

import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitle {

	public static void main(String[] args) {
		ChromeDriver  driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String expectedTitle = "Facebook – log in or sign up";
		String actualTitle = driver.getTitle();
		
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("test case passed");
		}
		else {
			System.out.println("test case failed");
		}
		driver.quit();
	}

}
