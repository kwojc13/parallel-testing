Feature: Finding information in Google Search

  @Test @GoogleSearchText
  Scenario:Find information about JavaScript in Google Search
  Given I go to the "https://google.com" page
#When I search for "JavaScript"
#Then The page title should start with "javascript"

  @Test @GoogleSearchImage
  Scenario:Find images related to programming in Google Search
    Given I go to the "https://google.com" page