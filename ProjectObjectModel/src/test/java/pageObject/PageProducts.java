package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PageProducts {

	
	 public WebDriver driver;
	 
	 
	//constructeur
	    
		public PageProducts(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
		//identification des elements

		@FindBy(how = How.XPATH, using = "//a[@data-product-id='1']")
		WebElement bt_AddtoCart;
		
		
		@FindBy(how = How.XPATH, using = "//button[@class='btn btn-success close-modal btn-block']")
		WebElement bt_ContinueShopping;
		
		@FindBy(how = How.XPATH, using = "//a[@data-product-id='2']")
		WebElement bt_Addtocart2;
		
		@FindBy(how = How.XPATH, using = "//a[@href='/view_cart']//u")
		WebElement bt_ViewCart;
		
		
		
		//creation des methodes
		
		public void cliquer_sur_AddtoCart( ) {
			bt_AddtoCart.click();
		}
		
		public void cliquer_sur_ContinueShopping( ) {
			bt_ContinueShopping.click();	
		}
				
		public void cliquer_sur_Addtocart2() {
			bt_Addtocart2.click();
		}		
		public void cliquer_sur_ViewCart( ) {
			bt_ViewCart.click();			
		}
}