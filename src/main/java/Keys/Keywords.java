package Keys;

import java.awt.Robot;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.paulhammant.ngwebdriver.NgWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keywords {
	static WebDriver driver;
	static NgWebDriver ngWebDriver;
	static JavascriptExecutor jsDriver;
	static FileInputStream file;
	static Properties props;
	static WebElement element;
	static Robot robot;

	@SuppressWarnings("deprecation")
	public void openBrowser() throws Exception {
		WebDriverManager.chromedriver().setup();
		System.out.println(System.getProperty("user.dir"));
		driver = new ChromeDriver();
    	file = new FileInputStream("object.properties");
		props = new Properties();
		props.load(file);
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	}

	public void navigate(String data) {
		
		driver.get(data);
		driver.manage().window().fullscreen();
	}

	public void intNavigation(String data) throws InterruptedException {
		Thread.sleep(2000);
		driver.navigate().to(data);
	}

	public void closeWindow() throws Exception {
		Thread.sleep(2000);
		driver.close();
	}

	public void input(String data, String objectName) throws Exception {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath(props.getProperty(objectName)));
		element.clear();
		element.sendKeys(data);
	}

	public void click(String objectName) throws Exception {
		Thread.sleep(2000);
		element = driver.findElement(By.xpath(props.getProperty(objectName)));
		element.click();

	}

	public void radio(String objectName) throws Exception {
		Thread.sleep(2000);
		element = driver.findElement(By.xpath(props.getProperty(objectName)));
		element.click();
		if (!element.isSelected()) {
			element.sendKeys(Keys.SPACE);
		}
	}
	
	public void captureMessage(String objectName) throws InterruptedException {
		element = driver.findElement(By.xpath(objectName));
		System.out.println("Hi Inside Capture");
		while(true) {
			if(element.isDisplayed()) {
				System.out.println(element.getText());
				break;
			}
		}
	}
	public void verifyPageTitle(String objectName) throws InterruptedException {
			element = driver.findElement(By.xpath(objectName));
			System.out.println("Hi Inside Capture");
			while(true) {
				if(element.isDisplayed()) {
					System.out.println(element.getText());
					break;
				}
			}
		
		
		
	}

}
