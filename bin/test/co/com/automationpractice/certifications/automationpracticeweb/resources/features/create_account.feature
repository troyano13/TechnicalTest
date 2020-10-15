Feature: User Creates an account
  In order to create account
  As a  user
  I want to check  taken my account page

  @Create_account
  Scenario: User can create an account
    Given The user is on Homepage
    When the user clicks on Sign
    And user enters email
      | email                    |
      | alexa021320093@gmail.com |
    And User Clicks create an account
    And User fills sign up form
      | email              | password        |
      | alexa2@hotmail.com | A2cJC8rrrHLuNm@ |
    And user clicks register
    Then the user is taken my account page

  @log_account
  Scenario: user can log in account
    Given the user has a valid account
      | email                   | password        |
      | alexa02132009@gmail.com | A2cJC8rrrHLuNm@ |
    Then the clicks on sign in
    And enters email
      | email                   |
      | alexa02132009@gmail.com |
    And enters password
      | password        |
      | A2cJC8rrrHLuNm@ |
    And clicks sign in
    Then the user is successfully logged in
