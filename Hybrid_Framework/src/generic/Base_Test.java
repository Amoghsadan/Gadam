package generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_Test implements Framework_constant{
	 public WebDriver driver;
	@BeforeMethod
	public void openappln()
	{
		System.setProperty(chrome_key,chrome_value);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseURL);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	@AfterMethod
	public void closeappln(ITestResult res) throws IOException
	{
		if(ITestResult.FAILURE==res.getStatus())
		{
			Generic_Scipt_SS.getPhoto(driver);
		}
		driver.close();
	}

}
