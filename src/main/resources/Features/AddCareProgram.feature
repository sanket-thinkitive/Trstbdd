Feature: Verify user creation
  Scenario Outline : Verify user addition with valid inputs
    Given user opens browser and navigates <url> url and enters <username> username and <password> password
    And Clicks on Sign In button
    When User clicks on program
    And  user clicks on Add New Program button
    And enters <Program name> program name and <type> type and <INR price Id> Inr price id and <USD price id> USD price id and <description> description
    And Selects  status and Category and Duration unit and device and duration
    And clicks on save and continue
    And enters <title>title and <General information>general information and selects education
    Then user clicks on Skip and exit
    Examples:
      | url                               | username      | password      | Program name      | type  | INR price Id                     | USD price id                     | description | title  | General information   |
      | "https://qa.trsthealth.com/login" | "super_admin" | "Super1@trst" | "TestAutommation" | "New" | "price_1NH2JmLLaKUxdVb4KVBwojRX" | "price_1NH2EOLLaKUxdVb4TODE4osF" | "New pg"    | "json" | "Namste sada vatsale" |
