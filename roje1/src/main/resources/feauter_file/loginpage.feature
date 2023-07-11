Feature: login functionality



  Scenario: login with valid credentials

    Given I am at the audio digest Home Page and validate

    And I click on the profile Login and validate

    When I fill the account username textbox with "<username>"

		When I fill the password textbox with "<password>"

		And I click the Login button

		And I should be appear dashboard page

		Then I logout



    Examples:

        |  username           |  password  |

        |  on_silver@wk.com   |  !QAZxsw2  |

