
Feature: Searching in Google

Scenario: Search by typing
Given I navigated to Google
When I type something to the search field
And  I need to click to search button
Then I can see the results of my search
And  I count the number of the results shown

Scenario: Search by voice
Given I navigated to Google
When I say what I want to search
Then I can see the results of my search
And I can count the number of the results
