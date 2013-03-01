Feature: This feature is used to test Pay with Gift Certificate

Scenario:Test that a user can use a gift certificate to purchase

	Given Retrieve a voucher from previous test
	And as a guest user start a application
	When user add an item to cart and move to My cart
	And Fill up billing information,Shipping Address and Method
	And Fill up gift certifcate entries with voucher code
	And If gift certificate cannot have enough payment
	Then use other mode of payment 
	And order should be complete
