package Academy;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://Users//Aqib//Desktop//Selenium Lib//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS );
		driver.navigate().refresh();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("email"))).sendKeys("aqib");
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:/Users/Aqib/Desktop/E2EProject/tests/screenshoot.png"));
		
		Select we = new Select(driver.findElement(By.xpath("tes")));
		we.selectByIndex(1);
		we.selectByVisibleText("jan");
		
		
		
		driver.close();
	}

}
