Feature: Appium 
Scenario: user Check expanded items and validate them
    Given user navigate to apidemo application and click on views
    And user click on Tabs
    When user click on Dialog
    And user click on content by factory
    And user click on tabOne
    Then user validate the tabOne text
    And user click on tabTwo
    Then user validate the tabTwo text
    And user click on tabThree
    Then user validate the tabThree text