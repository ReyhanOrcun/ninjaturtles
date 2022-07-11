Feature: Writing scenarios with DataTable


@DataTable
  Scenario: Add employee with DataTable
    When I login to the HRMS
    And I want to add Employees
    
      | FirstName | MiddleName | LastName |
      | Kamer     | Can        | Akarsu   |
      | Brian     |            | Smith    |
      | Tuba      |            | Kutlu    |

      Then I validate employee added