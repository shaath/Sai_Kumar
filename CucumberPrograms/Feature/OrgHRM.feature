
Feature: Login and Logout Functionality Test

	Scenario: Login Test
	
		Given the browser launch and navigate to the url
		When tester enters username and password
		And clicks on login
		Then should display welcome admin message
		
	Scenario: Logout Test
	
		When Tester clicks on welcome admin link
		And also click on Logout	link
		Then should logout and display login page