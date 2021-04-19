package StepDefinition;

import org.openqa.selenium.chrome.ChromeDriver;

public class idk {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/Gurjit/Desktop/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.getTitle();
		String i = driver.getTitle();
		driver.close();
		
		System.out.println(i);

	//
	}
	

}
