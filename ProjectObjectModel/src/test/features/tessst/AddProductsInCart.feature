
@AddProductsInCart
Feature: Add Products In Cart
  Je veux ajouter deux produits a la carte
  
 Background: Connexion à l application
    Given Saisir l URL suivant "https://automationexercise.com/"
    When choisir signup login
    And saisir adresse mail "ahmedahmedH@gmail.com" et le mot de passe "Ah123456"
    And cliquer sur le bouton login

  @tag1
  Scenario: add products in cart
    Given cliquer sur Products
    When survoler sur le premier produit et cliquer sur Add to cart 
    And cliquer sur continue shopping
    And survoler sur le deuxieme produit et cliquer sur Add to cart 
    And cliquer sur View cart
   # Then verifier les deux produits ajoutés to cart
   # And verifier leurs prix, quantité et prix totale 

