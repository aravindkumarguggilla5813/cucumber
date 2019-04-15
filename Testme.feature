Feature: Login Action

  Scenario Outline: Successful Login with Valid Credentials
    Given the login page is opened
    When user enters "<username>" and  user enters "<password>"
    Then user will   Finds a testmeapp homepage

    Examples: 
      | username | password    |
      | lalitha  | password123 |
      | admin    | password456 |
