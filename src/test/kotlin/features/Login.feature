feature LoginFeature

  Scenario: Login with correct username and password
  Given I get main page
  And I enter username pil_1 and password qwerty
  And I click submit button
  Then I should see start page