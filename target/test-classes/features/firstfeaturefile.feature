@googlesearch @first
Feature: Google search

  Background: user is on the google page
    Given user is in the google page

  @iphone
  Scenario: user searches teapot in google
    And user search teapot
    Then verify the result has teapot

  @nokia
  Scenario: user searches nokia in google
    And user search nokia
    Then verify the result has nokia
