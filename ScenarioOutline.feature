Feature: Writing Scenario Outline example

  @Outline
  Scenario Outline: 
    When Login with "<username>" and "<password>"
    And Click on the login button
    Then I validate Welcome "<username>" is displayed
    And We want to say Bye "<fullname>"

    Examples: 
      | username | password | fullname             |
      | Sherzod  | s1234    | Sherzod Tokhtakhunov |
      | Emre     | emre123  | Emre Yucel           |
      | Brian    | b3456    |         |
