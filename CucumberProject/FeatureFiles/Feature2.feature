
Feature: Website launch feature

  Scenario: To check if the website is able to lauch with valid URL
    Given Website is up and running
    When User enters valid URL
    Then Website should be displayed

