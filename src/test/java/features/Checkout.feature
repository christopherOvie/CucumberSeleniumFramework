Feature: Title of your feature
  I want to use this template for my feature file


     
     @PlaceOrder
    Scenario Outline:  Search experience in offer and landing page using scenario outline
      
    Given User is on Greencart landing page
    When User search with shortened name  "<name>" and extract actual product
   And Added "5" items of the selected product to cart
   Then User proceeds to Checkout and validate the "<name>" items in checkout page
   And verify user has ability to enter code and place the order
    
    Examples:
    
    |name|
    |Tom|
  