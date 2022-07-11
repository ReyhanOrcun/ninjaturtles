Feature: Background Example


Background:
Given Precondition1     #backround will run before every scenarios
And Precondition2

@background

Scenario: Example1

#Given Precondition1
#And Precondition2
When Test number1   firstname is "Brian" and lastname is "Smith"
And Test number2
And Test number3     age is 30
Then Validation number1
And Validation number2


@background
Scenario: Example2
 
#Given Precondition1
#And Precondition2
When Test number4
And Test number5
And Test number6
Then Validation number3
And Validation number4



#------------------------
# Hooks --> @Before
# Backround steps
# Scenario Example 1
# Hooks --> @After
#------------------------
# Hooks --> @Before
# Backround steps
# Scenario Example 2
# Hooks --> @After