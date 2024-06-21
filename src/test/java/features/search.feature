Feature: Title of your feature
  I want to use this template for my feature file

 # Scenario: Search experience in offer and landing page
   # Given User is on Greencart landing page
   # When User search with shortened name "Tom" and extract actual name of product
  #  Then user search for "Tom" shortname in offers page
  #  And validate product name in offers page matches with landing page

    
    
     #  When the user enters username "<username>" and password "<password>"
     
    @SearchOrder 
    Scenario Outline:  Search experience in offer and landing page using scenario outline
      
    Given User is on Greencart landing page
    When User search with shortened name  "<name>" and extract actual product
    Then user search for the shortname  "<name>" in offers page
    And validate product name in offers page matches with landing page
    
    Examples:
    
    |name|
    |Tom|
    |Beet|