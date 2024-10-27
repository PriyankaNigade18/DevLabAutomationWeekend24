Feature: Test Orangehrm application

  Scenario Outline: Test Hrm login for data driven
    Given Opne Hrm application
    When I enter "<username>" and enter "<password>"
    When I click on Hrm login button
    Then I should able to navigate to Dashboard page for successful login

    Examples: 
      | username | password |
      | Admin    | admin123 |
      | Amit     | test123  |
      | Neha     | test123  |
      | Admin    | admin123 |
