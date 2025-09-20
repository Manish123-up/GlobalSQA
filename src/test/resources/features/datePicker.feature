Feature: DatePicker Page


  @ManishTest
  Scenario: User is on Date Picker page
    Given user is on "home-page"
    When they reach to the DatePicker page
    Then they can see the "DatePicker"

  @SmokeTest
  Scenario: User provides valid date in Simple Date Picker
    Given user is on "home-page"
    When they reach to the "DatePicker page"
    And they provide "24" date
    Then they should see date as "10/24/2025"

  @UnitTest
  Scenario: User able to click on DropDownDate Picker
    Given user is on "home-page"
    When they reach to the "DatePicker page"
    And they provide "19" date "0" month and "2030" year
    Then they should see date as "01/19/2030"

  Scenario: User able to click on IconTrigger
    Given user is on "home-page"
    When they reach to the "DatePicker page"
    And they provide "23" date for IconTrigger
    Then they should see date as "10/23/2025"
