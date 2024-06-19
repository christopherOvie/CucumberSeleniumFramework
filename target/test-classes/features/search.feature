Feature: Title of your feature
  I want to use this template for my feature file

  Scenario: Title of your scenario
    Given User is on Greencart landing page
    When User search with shortened name "Tom" and extract actual name of product
    Then user search for "Tom" shortname in offers page
    And validate product name in offers page matches with landing page
