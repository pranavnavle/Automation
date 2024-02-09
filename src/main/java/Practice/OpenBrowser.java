package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

	public static void main(String[] args) {
  
	WebDriver driver = new ChromeDriver();
	driver.get("https://courses.letskodeit.com/practice");
	driver.manage().window().maximize();
	WebElement practiceLink=driver.findElement(By.xpath("//*[@id=\"navbar-inverse-collapse\"]/ul/li[6]/a"));
	practiceLink.click();
	
	//driver.findElement(By.xpath("//html/body/div[3]/div/div/div/div[2]/div/form/div[1]/input");
	                   
	}

	}

