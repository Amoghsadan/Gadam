package pom_script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.Base_Page;

public class Pom1 extends Base_Page {
	@FindBy(name ="email")
	private WebElement uName;
	@FindBy(name ="pass")
	private WebElement pword;
	@FindBy(name = "login")
	private WebElement loginbtn;

public Pom1(WebDriver driver)
{
	super(driver);//constructor chaining
}
public void passUn(String un)
{
	uName.sendKeys(un);
}
public void passPwd(String pwd)
{
	pword.sendKeys(pwd);
}
public void logbtn()
{
	loginbtn.click();
}
}



