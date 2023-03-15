package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatersTest {

	public static void main(String[] args) throws Exception {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.apsrtconline.in/oprs-web/");
		//driver.findElement(By.id("searchBtn")).click();// By id
		//driver.findElement(By.name("searchBtn")).click();//Byname
		//driver.findElement(By.className("chkavailabilityBtn")).click();//by class
		//driver.findElement(By.xpath("/html/body/div[4]/div/form/div[1]/div/div[1]/input[9]")).click();//absolute xpath
		//driver.findElement(By.xpath("//input[@type='button']")).click();//relative xpath
		//driver.findElement(By.xpath("//input[@name='searchBtn']")).click();
		driver.findElement(By.cssSelector("input[name='searchBtn']")).click();//cssSelector
		Thread.sleep(3000);
		driver.quit();
	}

}
