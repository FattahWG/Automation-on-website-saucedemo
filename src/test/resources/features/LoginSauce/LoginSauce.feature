@Login
Feature: Login
  As a user i want to login to sauce demo

  Scenario: Normal login
    Given User open the web page
    When User input "standard_user" as userName and "secret_sauce" as password

  Scenario Outline: Invalid login
    Given User open the web page
    When User input "<userName>" as userName and "<password>" as password
    Then User will see "<errorText>" on login page
    Examples:
      | userName      | password     | errorText                                                                 |  |  |
      | asd           | secret_sauce | Epic sadface: Username and password do not match any user in this service |  |  |
      | standard_user | 123          | Epic sadface: Username and password do not match any user in this service |  |  |
      | asd           | asd          | Epic sadface: Username and password do not match any user in this service |  |  |
