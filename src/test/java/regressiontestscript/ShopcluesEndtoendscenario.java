package regressiontestscript;

import org.testng.annotations.Test;

import GenericMethods.Generictest;
import pom_Shopclues.Addtocart_page3;
import pom_Shopclues.Clickproduct2_page;
import pom_Shopclues.Removeproduct;
import pom_Shopclues.Selectproduct_page;

public class ShopcluesEndtoendscenario extends Generictest {
	@Test
	public void shopcluesEndtoendscenario() throws InterruptedException 
	{
		Selectproduct_page Selectprd = new Selectproduct_page(driver);
		test=reports.createTest("shopcluesEndtoendscenario", "Shop clue application scenario");
		Selectprd.Mousover_women();
		test.pass("Mousehover to women tab");
		Selectprd.ClickonSaree();
		test.pass("Clicked on saree");
		Clickproduct2_page prdclick = new Clickproduct2_page(driver);
		prdclick.Clickonprodimg();
		Addtocart_page3 addcart = new Addtocart_page3(driver);
		addcart.Selectcolor();
		addcart.Addtocart();
		addcart.Viewthecart();
		Removeproduct rmv = new Removeproduct(driver);
		rmv.Clickremove();
		rmv.Clickremoveconfirm();
		rmv.emptycart();
		
	}

}
