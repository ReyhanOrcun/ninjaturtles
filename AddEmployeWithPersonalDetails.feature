Feature: Add Employee With Personal Details

  Background: 
    Given user is logged in with valid credentials
    And user navigates to AddEmployee page

  @HW4
  Scenario Outline: Add and Modify Employee Details
    When user enters employee first name "<FirstName>" and last name "<LastName>"
    And user selects a location
    And user clicks on save button
    Then I am able to modify Employee Details "<DriverLicense>", "<ExpirationDate>", "<Smoker>", "<Gender>", "<Nationality>"
    And I click on Personal Details Save

    Examples: 
      | FirstName | LastName | DriverLicense | ExpirationDate   | Smoker | Gender | Nationality |
      | Lionel    | Messi    | N78787886     | Thu, 09 Jun 2022 | yes    | Male   | Argentinean |
      | Angelina  | Jolie    | T55578855     | Wed, 17 Dec 2025 | No     | Female | American    |

  @HW4DataTable
  Scenario: Add and Modify Employee Details
    When user enters employee first name and last name
    And user selects a location
    And user clicks on save button
    Then I am able to modify Employee Details with Driver Licence, expirationDates, Smoker, Gender, Nationality
    And I click on Personal Details Save
      | FirstName | LastName | DriverLicense | ExpirationDate   | Smoker | Gender | Nationality |             |
      | Lionel    | Messi    | N78787886     | Thu, 09 Jun 2022 | yes    | No     | Male        | Argentinean |
      | Angelina  | Jolie    | T55578855     | Wed, 17 Dec 2025 | No     | Female | American    |             |
