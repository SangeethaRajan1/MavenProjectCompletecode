package pom_Shopclues;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import GenericMethods.Base_page;
import GenericMethods.GMaction;

public class Selectproduct_page extends Base_page{
	@FindBy(xpath="//a[.='WOMEN']")private WebElement element1;
	@FindBy(xpath="(//a[.='Sarees'])[1]")private WebElement element2;
	public Selectproduct_page(WebDriver driver)
	{
		super(driver);
	}
	public void Mousover_women()
	{
	GMaction g=new GMaction();
	g.Movetoelement(driver,element1);
	}
	public void ClickonSaree() throws InterruptedException 
	{
		Visiblityof(7, element2);
		element2.click();
		Set<String> childbr = driver.getWindowHandles();
		for(String window:childbr)
		{
			driver.switchTo().window(window);
			Thread.sleep(3000);
		}
	}
}
	


