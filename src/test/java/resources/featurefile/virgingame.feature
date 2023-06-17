
Feature:Test  navigation functionality for virgingames website
  As an user I want to navigate into virgingames website

@smoke
  Scenario: User should navigate to login page successfully
    Given  I am on the  homepage
    And    I accept cookie on homepage
    When   I click on "Login" link
    Then   I should navigate to verify page successfully

#  Scenario: Test Navigation Functionality
#    Given I am on the homepage
#    When  I click on the "Online Slots" link
#    Then  I navigate to the OnlineSlots page
#
#  Scenario: Test Navigation Functionality
#    Given I am on the homepage
#    When  I click on the "Live Casino" link
#    Then  I navigate to  the Live Casino page