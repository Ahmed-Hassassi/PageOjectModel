package stepDefinition;

import io.cucumber.java.en.Given;
import pageObject.PageHome;
import pageObject.PageProducts;

import org.openqa.selenium.WebDriver;

import hooks.SetUp;
import io.cucumber.java.en.*;

public class AddProductsInCart {
 
	public static WebDriver driver = SetUp.driver;
    
	PageHome home = new PageHome(driver);
	PageProducts products = new PageProducts(driver);
	
@Given("cliquer sur Products")
public void cliquer_sur_products() {
   home.cliquer_sur_le_bouton_products();
}

@When("survoler sur le premier produit et cliquer sur Add to cart")
public void survoler_sur_le_premier_produit_et_cliquer_sur_add_to_cart() {
    products.cliquer_sur_AddtoCart();
}

@When("cliquer sur continue shopping")
public void cliquer_sur_continue_shopping() {
    products.cliquer_sur_ContinueShopping();
}

@When("survoler sur le deuxieme produit et cliquer sur Add to cart")
public void survoler_sur_le_deuxieme_produit_et_cliquer_sur_add_to_cart() {
   products.cliquer_sur_Addtocart2();
}

@When("cliquer sur View cart")
public void cliquer_sur_view_cart() {
 products.cliquer_sur_ViewCart();
}

@Then("verifier les deux produits ajoutés to cart")
public void verifier_les_deux_produits_ajoutés_to_cart() {
    
}

@Then("verifier leurs prix, quantité et prix totale")
public void verifier_leurs_prix_quantité_et_prix_totale() {
  
}

}
