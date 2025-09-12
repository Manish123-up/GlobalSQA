Feature: DatePicker Page

  Scenario: User is on Date Picker page
    Given user is on "home-page"
    When they reach to the DatePicker page
    Then they can see the "DatePicker"

  Scenario: User provides valid date in Simple Date Picker
    Given user is on "home-page"
    When they reach to the DatePicker page
    Then they can see the provided "25" date value in the "10/25/2025" date
