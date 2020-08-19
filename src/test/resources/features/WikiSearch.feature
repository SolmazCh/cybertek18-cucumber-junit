
Feature: Wiki title verifications

  Background: User is on the Wiki home page
    Given User is on the Wikipedia home page

  @wiki
  Scenario: Search functionality title verification
    When User types "Steve Jobs" in the  wiki search page
    Then User should see "Steve Jobs" in the wiki title


  Scenario: Search functionality header verification
    When User types "Steve Jobs" in the  wiki search page
    Then User should see "Steve Jobs" in the main header

@wikiScenarioOutline
  Scenario Outline: Search functionality header verification
    When User types "<searchValue>" in the  wiki search page
    Then User should see "<expectedTitle>" in the wiki title
    Then User should see "<expectedMainHeader>" in the main header
    Then User should see "<expectedImageHeader>" in the image header


    Examples: example test data for wikipedia search
      | searchValue     | expectedTitle   | expectedMainHeader | expectedImageHeader |
      | Steve Jobs      | Steve Jobs      | Steve Jobs         | Steve Jobs          |
      | Albert Einstein | Albert Einstein | Albert Einstein    | Albert Einstein     |
      | Keanu Reeves    | Keanu Reeves    | Keanu Reeves       | Keanu Reeves        |
      | Dua Lipa        | Dua Lipa        | Dua Lipa           | Dua Lipa            |
      | Thomas Edison   | Thomas Edison   | Thomas Edison      | Thomas Edison       |
      | Jeff Bezos      | Jeff Bezos      | Jeff Bezos         | Jeff Bezos          |