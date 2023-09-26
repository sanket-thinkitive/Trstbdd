Feature: Verify user login
  Scenario Outline:Successful login
    Given user opens browser and navigates <url> url
    When user enters <username> and <password>
    And user clicked on login button
    Then user should be logged in and dashboard page should be displayed
    Examples:
      | url                               | username       | password       |
      | "https://qa.trsthealth.com/login" | "super_admin"  | "Super1@trst"  |
      | "https://qa.trsthealth.com/login" | "super_admin"  | "Super2@trst"  |
      | "https://qa.trsthealth.com/login" | "super_admin1" | "Super1@trst"  |
      | "https://qa.trsthealth.com/login" | "super_admin2" | "Super21@trst" |


