package edureka.co.gittest;

import org.openqa.selenium.firefox.FirefoxDriver;
public class App {
public void verifylogin() {
	  System.setProperty("webdriver.gecko.driver","/usr/local/share/gecko_driver/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://172.17.0.1:3001/");
		driver.findElementByName("login").sendKeys("Testing");
		driver.findElementByName("password").sendKeys("Selenium");
		driver.findElementByName("click").click();

}
}
