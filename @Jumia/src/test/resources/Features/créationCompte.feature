@tag
Feature: Test login functionality
  Scenario Outline: Check login is successful with valid credentials
    Given browser is open
    And user is on login page
    When user enters <username> and clicks on continue  
    And  user enters <password> and clicks on continue  
    Then user is navigated to the home page

    Examples: 
      | username                |      password |
      | ghadaa.ghram@gmail.com  |    Gh11046090 |      