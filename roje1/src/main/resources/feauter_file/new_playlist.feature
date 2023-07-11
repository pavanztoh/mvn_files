Feature: newly created_Playlist

 Scenario: login with valid credentials

    Given I am at the audio digest Home Page and validate

    And I click on the profile Login and validate

    When I fill the account username textbox with "<username>"

		When I fill the password textbox with "<password>"

		And I click the Login button

		And I should be appear dashboard page

		



    Examples:

        |  username           |  password  |

        |  on_silver@wk.com   |  !QAZxsw2  |




  Scenario: verify validate play all functionality for newly created playlist
  


		And  I click on playlist tab
		
		And I click on Create playlist
		
		When I fill the name of the playlist with "11q"
		
		And I click on Library tab and add two lectures to the newly created playlist
		
		And navigate back to playlist tab
		
		And click on play all icon of newly created playlist 
		
		Then I logout