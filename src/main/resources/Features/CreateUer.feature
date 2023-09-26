Feature: Verify user creation
  Scenario Outline: Verify user addition with valid inputs
    Given user opens browser and navigates <url> url and enters <username> and <password>
    And Clicks on Sign In button
    When user clicks on user option and Add user button
    And enters <firstname> firstname and <lastname> lastname and <phonenumber> phonenumber
    And enters <email> email and <dob> dob and clicks on save button
    Then user should be added successfully
    Examples:
      | url                               | username      | password      | firstname    | lastname | phonenumber  | email                    | dob          |
      | "https://qa.trsthealth.com/login" | "super_admin" | "Super1@trst" | "chirag"     | "kumar"  | "9403878880" | "vvvuhnm@gmail.com"      | "08/06/1996" |
      | "https://qa.trsthealth.com/login" | "super_admin" | "Super1@trst" | "chirag1221" | "kumar"  | "9403824880" | "liam@gmail.com"         | "08/06/1996" |
      | "https://qa.trsthealth.com/login" | "super_admin" | "Super1@trst" | "viamo"      | "kumar"  | "9403828800" | "nisson@gmail.com"       | "08/06/1996" |
      | "https://qa.trsthealth.com/login" | "super_admin" | "Super1@trst" | "viamo"      | "kumar"  | "9493821230" | "petergriffin@gmail.com" | "08/06/1996" |

