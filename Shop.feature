Feature:Shop Section
  Scenario: Shop page loads with correct title
    Given The user login successfully
    When User click shop link
    Then User navigate to the shop page
    And User get the productNames
