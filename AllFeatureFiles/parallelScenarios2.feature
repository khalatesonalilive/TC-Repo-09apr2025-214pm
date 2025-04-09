Feature: Test Parallel Scenarios Functionality

  #Run the Scenarios Parallely by using the Cucumber with TestNG
  Scenario: Test Google HomePage Functionality
    Given user is on google homepage
    And user validate the google homepage url

  Scenario: Test Facebook HomePage Functionality
    Given user is on Facebook homepage
    And user validate  the facebook homepage url

  Scenario: Test Amazom HomePage Functionality
    Given user is on amazon homepage
    And user validate the amazon homepage url
