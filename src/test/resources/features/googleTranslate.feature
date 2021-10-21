Feature: Translating content using Google Translate

  @Test @GoogleTranslate
  Scenario:Translate a word using Google Translate
    Given I go to the "https://translate.google.com" page
#    When I translate "programming" from "english" to "polish"
#    Then The "polish" translation of "programming" to "programowanie" is displayed