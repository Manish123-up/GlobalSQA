Feature: ToolTip Page
  Scenario: User is on ToolTip page
    Given user is on home-page
    When they reach to the ToolTip page
    Then they can see the "Tooltip"

  Scenario: user want to see St. Stephen's Cathedral
    Given user is on home-page
    When they reach to the ToolTip page
    Then they can see the "Vienna, Austria"
