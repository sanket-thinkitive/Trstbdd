Feature: Verify patient addition functionality
  Scenario Outline: Verify patient addition with valid input
    Given user opens browser and navigates <url> url and enters <username> username and <password> password
    When Clicks on SignInbutton
    And clicks on Add patient button
    And add <Firstname> Firstname and <Lastname> lastname and <dob> dob and <Email> email and <phonenumber> phonenumber
    #When selects gender and Maritalstatus and provider
    And clicks on next and next and next and next and next and next and Finish
    Then patient should be added successfully and displayed
    Examples:
      | url                               | username      | password      | Firstname | Lastname | dob          | Email                  | phonenumber  |
      | "https://qa.trsthealth.com/login" | "super_admin" | "Super1@trst" | "chirag"  | "Kumar"  | "08/06/1996" | "Test5@mailinator.com" | "9765298606" |