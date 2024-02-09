package Practice;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindowTab {

	public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://courses.letskodeit.com/practice");
	driver.manage().window().maximize();
	System.out.println(driver.getTitle());
	
	String windowId = driver.getWindowHandle();
	driver.switchTo().newWindow(WindowType.WINDOW);
	driver.get("https://google.com");
	System.out.println(driver.getTitle());
	
	driver.switchTo().window(windowId);
	System.out.println("Get current page window = " + driver.getTitle());
	

	}

}
