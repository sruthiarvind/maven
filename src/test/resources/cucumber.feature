Feature: logging into the ebay site


  Scenario: loging with valid credentials
    Given Iam on the ebay site
    When I click on sigin_link
    And I submit the form with valid data
      | fields   | value                 |
      | EmailId  | ashreya234@gmail.com |
      | password | akshitha@2             |
    Then I should see the text hi ashu
