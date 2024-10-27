Feature: Test SwagLabs application

  Scenario: Test Login functionality with valid credentials
    Given Open SwagLab application using url "https://www.saucedemo.com/v1/"
    When User enter valid username "standard_user" and enter valid password "secret_sauce"
    And User click on SwagLabs login button
    Then User should navigate to Inventory page for sucessfull login
