Feature: Product search from amazon.com
  User wants to search for Product and purchase from amazon.com

  Scenario: Product Search should be appear
    Given user is on Home Page
    When user search for "Software Development"
    And click on search button
    Then results should appear for "software"

	
	Scenario: Product Search should be appear
    Given user is on Home Page
	When user search for " "
	And click on search button
	Then results should appear for " "