@sanity
Feature: Login

  Background:
    Given Launch the application
    And User clicks on Accept Cookies
    And User clicks on account

  @sanity @ignore
  Scenario: Login the application
    When User enters valid username and password
    And User clicks Login
    Then User should be redirected to the home page
