Feature: Login functionality of ornagehrm

@login
Scenario: user check the login functions
    Given user enter to url of orangehrm
    When user enter below credentials
    	|Admin|admin123|
    And user click the login buttom	
    Then user should be enter to ornagehrm page
 @hari 
Scenario: login functionality using withheader
	Given  enter url of orangerhrm headermethod
	When user enter below username and password
		|username|password|
		|Admin|admin123|
	And user click the login button of ornagehrm
	Then user enter to ornagehrm
@ansari
Scenario Outline: user check the login functions using example keyword
	Given client enter url of ornagehrm examplekeyword
	When user enter username as "<username>" and password "<password>"
	And user click the login
	Then user should be enter to orangehrm
	
	Examples:
	|username|password|
	|admin|admin123|
	|Admin|admin123|
	|admin123|admin1234|