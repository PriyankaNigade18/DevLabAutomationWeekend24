Feature: Test CRM application

  Background: 
    Given Open CRM application
    When User click on SignIn

  Scenario: Test SignIn link functinality
    Then User should navigated to login page

  Scenario: Test Login functionality
    When user enter "test@gmail.com" email and "test123" password
    When User click on submit button
    Then USer should navigate to Customers page
