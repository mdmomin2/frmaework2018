package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Myfristteat {
@Test
public void testingFristName(){}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//init browser
		WebDriver driver = new ChromeDriver();
		//path of the chrome Browser
		driver.get("https://www.facebook.com/");
		System.setProperty("WebDriver.Chrome.Driver",System.getProperty("\\drivers\\chromedriver.exe"));
	

}
}
