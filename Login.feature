Feature: Practice automation testing login
  Scenario: Login with valid data
    Given I go to practice automation site
    When I enter valid mail and password
    Then I click remember me button
    And I click login button