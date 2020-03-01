Feature: Product search from amazon.com
  User wants to search for Product 

  Scenario: Product Search should appear
    Given user is on Home Page
    When user search for "Software Development"
    And click on search button
    Then results should appear for "Software Development "

	Scenario: Product Search should  appear
        Given user is on Home Page
	When user search for " "
	And click on search button
	Then results should appear for " "
