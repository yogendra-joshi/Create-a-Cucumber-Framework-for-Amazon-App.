
@Calculator_Feature
Feature: This feature would be creating a calculator to add and subtract two numbers

  Scenario: Add two numbers
    Given I have a calculator
    When I add 5 and 5
    Then I should get the result 10

  Scenario Outline: Subtract two numbers
    Given I have a calculator
    When I subtract 7 and 6
    Then I should get the result 1

  Scenario Outline: Add two numbers using outline
    Given I have a calculator
    When I add <num1> and <num2>
    Then I should get the result <result>

    Examples: 
      | num1 | num2 | result |
      |    5 |    4 |      9 |
      |  100 |   34 |    134 |

  Scenario Outline: Subtract two numbers using outline
    Given I have a calculator
    When I subtract <num1> and <num2>
    Then I should get the result <result>

    Examples: 
      | num1 | num2 | result |
      |    5 |    4 |      1 |
      |  100 |   34 |     66 |

  Scenario: Add multiple numbers using cucumber data table
    Given I have a calculator
    When I add below numbers
      | 3 |
      | 4 |
      | 5 |
      | 6 |
    Then I should get the result 18

  Scenario: Add multiple numbers using cucumber data table
    Given I have a calculator
    When I add below numbers using list
      | 3 |
      | 4 |
      | 5 |
      | 6 |
      | 7 |
    Then I should get the result 25

  Scenario: To calculate the total bill of the order
    Given I have a calculator
    When I order below items
      | coffee | 23 |
      | Tea    | 27 |
      | Lassi  | 50 |
    Then I should get the result 100

  Scenario: To calculate the total bill of the order using quantity
    Given I have a calculator
    When I order below items using quantity
      | coffee | 1 | 23 |
      | Tea    | 2 | 27 |
      | Lassi  | 3 | 50 |
    Then I should get the result 227
