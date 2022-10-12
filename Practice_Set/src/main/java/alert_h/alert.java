package alert_h;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://www.issuewire.com/");
		 
		 driver.findElement(By.xpath("//a[@title='login']")).click();
		 
		 driver.findElement(By.xpath("//input[@value='Login']")).click(); //click button
		 
		 Alert alert = driver.switchTo().alert();
		 
		 System.out.println(alert.getText());
		 
		 alert.accept(); //ok button
		 
		 alert.dismiss(); //cancel button
	}

}
