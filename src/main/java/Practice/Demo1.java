package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement Email = driver.findElement(By.id("email"));
		Email.sendKeys("pranavnavale1955@gmail.com");
		WebElement Pass =  driver.findElement(By.id("pass"));
		Pass.sendKeys("Pranav@1955");
		driver.findElement(By.name("login")).click();
	}

}
