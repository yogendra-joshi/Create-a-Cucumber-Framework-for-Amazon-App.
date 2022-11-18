@Feature_Login
Feature: This feature would be used to design the login page of the application

  Background: Open the application
    Given I have opened the application in browser

  # This is a comment line
  @Sanity
  Scenario: Validate the successful login
    When I click on the Login link
    And I enter username
    And I enter password
    And I click on the login button
    Then I should be logged in successful and land on home page

  @Regression
  Scenario: Validate the successful login using test data
    When I click on the Login link
    And I enter username "abcd@xyz.com"
    And I enter password "qwErt@123"
    And I click on the login button
    Then I should be logged in successful and land on home page

  @Regression @Rapid
  Scenario Outline: Validate the successful login using multiple test data
    When I click on the Login link
    And I enter username "<UserName>"
    And I enter password "<Password>"
    And I click on the login button
    Then I should be logged in successful and land on home page

    Examples: 
      | UserName     | Password |
      | abc@xyz.com  | Pqrs@123 |
      | try@hard.com | Test@345 |

  Scenario: Validate the failure login using test data
    When I click on the Login link
    And I enter username "abcd@xyz.com"
    And I enter password "Qwert@123"
    And I click on the login button
    Then I should be getting error message as "The email or password you have entered is invalid."
