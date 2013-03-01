Feature: This feature is used to test Purchase Gift Certificate

Scenario:Test that the user can purchase a gift certificate

	Given that admin is login to the application
	When navigate to Categories & Products to Gift Certificates
	And go to Gift Certificates Settings and move to Enable Module button
	Then as a guest user start a application
	And navigate to Gift Certificates link
	When user fill the from and add item to cart 
	And Proceed to checkout
	Then order status should be complete,payment received and ensure email contains Voucher code
