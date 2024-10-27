Feature: Test Google application

  Background: 
    Given launch Google application

  Scenario: Test google page title
    #Given launch Google application
    When user get the current page title
    Then Application title should match with Google

  Scenario: Test google search frature with valid keyword
    #Given launch Google application
    When User search for "selenium" into serach box
    Then User should get appropriate search result
