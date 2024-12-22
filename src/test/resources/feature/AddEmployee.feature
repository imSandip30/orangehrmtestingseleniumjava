Feature: Add Employee in PIM Module

  # Scenario: Add Employee with First Name, Last Name, Middle Name, and Employee ID
  Scenario: Add employee and click save or cancel
   # Given the user is logged in as an admin
    When the user navigates to the Add Employee page
    And the user enters "sujataa" as first name, "sujataa" as last name, "sujataa" as middle name, and "12345" as employee ID
   # And the user clicks the Save button
   # Then the employee should be saved successfully
   # And the user clicks the Cancel button
