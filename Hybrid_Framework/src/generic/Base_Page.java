package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base_Page {
	public WebDriver driver;//declare globally to use in pom script(super.driver)
	public Base_Page(WebDriver driver)// declare locally to pass inside initelements
	{
		PageFactory.initElements(driver,this);
	}

}
