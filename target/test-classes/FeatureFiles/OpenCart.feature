Feature: Test OpenCart application

  @Register @Functional @Regression
  Scenario: Test Register functionality with valid data
    Given Open Register page
    When User enters all details
      | fname | lname  | email             | telephone | password | cpassword |
      | pavan | sharma | paven18@gmail.com |   9877666 | test123  | test123   |
    And User click yes radio button
    And User check the privacy policy checkbox
    And User click on contineue button
    Then User should be register into app

  @Login @Functional
  Scenario: for register user test login fuctionality
    Given Open opencart login page
    When user enter "paven18@gmail.com" and password "test123"
    When User click on cart login button
    Then User should be navigated to account page
