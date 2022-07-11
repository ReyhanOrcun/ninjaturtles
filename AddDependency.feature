#Author:Reyhan/BugExterminators
@dependency
Feature: Add Dependency
  I want to test the Add Dependency Functionality

  Background: 
    Given user is logged in with valid credentials
    And Admin navigates to Personal Details Page
    And User clicks more
    And User Selects Dependents from drop down options
    And user should see Assigned Dependents page
    

  @dependency2
  Scenario Outline: Add and Modify Dependents
   
   When  Navigate ADD DEPENDENT Frame
    When user enters name "<Name>"
    And user selects Date of Birth "<DOB>"
    And user selects Relationship "<relationship>" from dropdown
    And user clicks save button
    Then Validate that user is  able to see 'Successfully saved' message

    Examples: 
      | Name     | DOB              | relationship |
      | Cin Ali  | Wed, 18 Mar 1987 | Child        |
      | Keloglan | Thu, 06 Mar 1952 | Father       |

  @dependency3
  Scenario Outline: Add Marriage Info
    When User enters Certificate No "<CertificateNo>"
    And User enters Date of registration "<RegistrationDate>"
    And User enters SAVE button
    Then Admin gets "succesfully saved" message
      
     Examples:  
      | CertificateNo | RegistrationDate |
      |          3456 | Wed, 15 Oct 2025 |
