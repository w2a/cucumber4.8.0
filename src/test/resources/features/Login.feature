Feature: Login
  
  In order to perform successful login
  As a user
  I want to enter correct username and password

  Background: 
    Given user navigates to facebook website
    When user validates the homepage title

  Scenario Outline: In order to verify login to Facebook
    Then user entered "<username>" username
    And user entered "<password>" password
    And user select the age category
      | Age      | Location |
      | below 18 | India    |
      | above 18 | USA      |
    Then user "<loginType>" succesfully logged in

    Examples: 
      | username | password | loginType |
      | valid    | valid    | should    |
      | invalid  | invalid  | shouldnot |
