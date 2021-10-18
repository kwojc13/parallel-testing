Feature: Finding information in Google Search

  @Test @GoogleSearch
Scenario:Find information about JavaScript in Google Search
Given I go to the "https://google.com" page
When I search for "JavaScript"
Then The page title should start with "javascript"