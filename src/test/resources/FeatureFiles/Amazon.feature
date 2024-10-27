@All
Feature: Test Amazon Application

  Background: 
    Given Open Amazon application

  @Homepage @Regression
  Scenario: Test homePage title
    When User get the home page title
    Then title should match with homepage

  @Sellpage @ignore
  Scenario: Test Sell page title
    When User open Sell page
    When User get the sell page title
    Then Title should match with sellpage

  @Mobilepage @ignore
  Scenario: Test Mobile Page title
    When User open Mobile page
    When User get the Mobile page title
    Then Title should match with mobile page
