Feature: Register Testing automation site
  Scenario: Register with valid data
    Given User go to practice automation testing site
    When User enter email and password
    Then User click register button
