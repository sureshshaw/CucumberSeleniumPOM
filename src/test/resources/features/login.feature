Feature: Login Tests.

  @GroupTag @SingleTag
  Scenario Outline: DataTable Examples Test
    Given application is open
    When user enters username as <username>
    And user enters password as <password>
    And user clicks on login button
    Then user should see logout button

    Examples: 
      | username  | password             |
      | tomsmith  | SuperSecretPassword! |
      | tomsmith1 | SuperSecretPassword! |

  @SingleTag
  Scenario: Each step data single row without header
    Given application is open
    When user enters below single rowdata as username
      | tomsmith |
    And user enters below single rowdata as password
      | SuperSecretPassword! |
    And user clicks on login button
    Then user should see logout button

  @SingleTag
  Scenario: Each step data multiple row without header
    Given application is open
    When user enters below multi rowdata as username
      | tomsmith  |
      | tomsmith1 |
    And user enters below multi rowdata as password
      | SuperSecretPassword!  |
      | SuperSecretPassword!1 |
    And user clicks on login button
    Then user should see logout button

  @SingleTag
  Scenario: Each step data single row with header
    Given application is open
    When user enters below header single rowdata as username
      | uid       |
      | tomsmith1 |
    And user enters below header single rowdata as password
      | pwd                   |
      | SuperSecretPassword!1 |
    And user clicks on login button
    Then user should see logout button

  @SingleTag
  Scenario: Each step data multiple row with header
    Given application is open
    When user enters below header multi rowdata as username
      | uid       |
      | tomsmith  |
      | tomsmith1 |
    And user enters below header multi rowdata as password
      | pwd                   |
      | SuperSecretPassword!  |
      | SuperSecretPassword!1 |
    And user clicks on login button
    Then user should see logout button
