Feature: ToolTip Page
  Scenario: User is on ToolTip page
    Given user is on "home-page"
    When they reach to the "ToolTip page"
    Then they can see the "Tooltip"

  Scenario: user want to see St. Stephen's Cathedral
    Given user is on "home-page"
    When they reach to the "ToolTip page"
    Then they can see the "Vienna, Austria"

  Scenario: user wants to fill details
    Given user is on "home-page"
    When they reach to the "ToolTip page"
    And they click on "Forms Based" tab
    Then they can see the "Please provide your firstname."

    Scenario: user wants to fill name details
      Given user is on "home-page"
      When they reach to the "ToolTip page"
      And they click on "Forms Based" tab
      Then they can see the "Please provide your lastname."

    Scenario: user wants to fill address
      Given user is on "home-page"
      When they reach to the "ToolTip page"
      And they click on "Forms Based" tab
      Then they can see the "Your home or work address."

    Scenario: user wants is on video based
      Given user is on "home-page"
      When they reach to the "ToolTip page"
      And they click on "Video Based" tab
      Then they can see the "I like this"

    Scenario: user  is on video based
      Given user is on "home-page"
      When they reach to the "ToolTip page"
      And they click on "Video Based" tab
      Then they can see the "Add to Watch Later"

    Scenario: user is able to on video based
      Given user is on "home-page"
      When they reach to the "ToolTip page"
      And they click on "Video Based" tab
      Then they can see the "Share this video"

