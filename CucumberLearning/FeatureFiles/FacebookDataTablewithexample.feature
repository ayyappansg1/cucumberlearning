Feature: This is login for Fb page
Scenario Outline:: This is login scenario fb 
		Given user is on login of fb home
		When user enter the "<username>" password "<password>"
				
		Examples:
		|username|password|
		|ayya007@gmail.com|sangar@123|
		|ayya007@gmail.com|sangasadr@123|
		|ayya00sds7@gmail.com|sangasadar@123|