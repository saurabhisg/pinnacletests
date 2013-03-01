$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri('com\pinnacle\cart\automation\store\cucumber\Cart01_add item.feature');
formatter.feature({
  "id": "this-feature-is-used-to-test-add-item-to-the-cart",
  "description": "",
  "name": "This feature is used to test add item to the cart",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "this-feature-is-used-to-test-add-item-to-the-cart;check-to-see-if-user-is-able-to-add-an-item-to-the-cart",
  "description": "",
  "name": "Check to see if user is able to Add an item to the cart",
  "keyword": "Scenario",
  "line": 3,
  "type": "scenario"
});
formatter.step({
  "name": "as a guest user start a application",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "user add an item to the cart",
  "keyword": "When ",
  "line": 6
});
formatter.step({
  "name": "click on My Cart",
  "keyword": "And ",
  "line": 7
});
formatter.step({
  "name": "the user can see the added item to the cart",
  "keyword": "Then ",
  "line": 8
});
formatter.match({
  "location": "PinnacleStepDefinitions.start()"
});
formatter.result({
  "duration": 27072478821,
  "status": "passed"
});
formatter.match({
  "location": "PinnacleStepDefinitions.addItemToTheCart()"
});
formatter.result({
  "duration": 8736208614,
  "status": "passed"
});
formatter.match({
  "location": "PinnacleStepDefinitions.clickMyCart()"
});
formatter.result({
  "duration": 4524854008,
  "status": "passed"
});
formatter.match({
  "location": "PinnacleStepDefinitions.verifyItemInCart()"
});
formatter.result({
  "duration": 5298427275,
  "status": "passed"
});
formatter.uri('com\pinnacle\cart\automation\store\cucumber\Cart02_remove item.feature');
formatter.feature({
  "id": "this-feature-is-used-to-test-remove-item-from-the-cart",
  "description": "",
  "name": "This feature is used to test remove item from the cart",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "this-feature-is-used-to-test-remove-item-from-the-cart;check-to-see-if-user-can-remove-an-item-from-the-cart",
  "description": "",
  "name": "Check to see if user can remove an item from the cart",
  "keyword": "Scenario",
  "line": 3,
  "type": "scenario"
});
formatter.step({
  "name": "as a guest user start a application",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "user add an item to the cart",
  "keyword": "When ",
  "line": 6
});
formatter.step({
  "name": "click on My Cart",
  "keyword": "And ",
  "line": 7
});
formatter.step({
  "name": "the user can see the added item to the cart",
  "keyword": "Then ",
  "line": 8
});
formatter.step({
  "name": "user click remove under the item",
  "keyword": "When ",
  "line": 9
});
formatter.step({
  "name": "the item should be removed",
  "keyword": "Then ",
  "line": 10
});
formatter.match({
  "location": "PinnacleStepDefinitions.start()"
});
formatter.result({
  "duration": 3219078016,
  "status": "passed"
});
formatter.match({
  "location": "PinnacleStepDefinitions.addItemToTheCart()"
});
formatter.result({
  "duration": 3231524034,
  "status": "passed"
});
formatter.match({
  "location": "PinnacleStepDefinitions.clickMyCart()"
});
formatter.result({
  "duration": 4276251403,
  "status": "passed"
});
formatter.match({
  "location": "PinnacleStepDefinitions.verifyItemInCart()"
});
formatter.result({
  "duration": 5246726347,
  "status": "passed"
});
formatter.match({
  "location": "PinnacleStepDefinitions.removeItemFromCart()"
});
formatter.result({
  "duration": 5358266433,
  "status": "passed"
});
formatter.match({
  "location": "PinnacleStepDefinitions.verifyItemRemoveFromCart()"
});
formatter.result({
  "duration": 51909038,
  "status": "passed"
});
formatter.uri('com\pinnacle\cart\automation\store\cucumber\Cart03_proceed to checkout.feature');
formatter.feature({
  "id": "this-feature-is-used-to-test-proceed-to-checkout",
  "description": "",
  "name": "This feature is used to test proceed to checkout",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "this-feature-is-used-to-test-proceed-to-checkout;test-that-a-user-can-proceed-to-checkout",
  "description": "",
  "name": "Test that a user can proceed to checkout",
  "keyword": "Scenario",
  "line": 4,
  "type": "scenario"
});
formatter.step({
  "name": "as a guest user start a application",
  "keyword": "Given ",
  "line": 6
});
formatter.step({
  "name": "user add an item to the cart",
  "keyword": "When ",
  "line": 7
});
formatter.step({
  "name": "click on My Cart",
  "keyword": "And ",
  "line": 8
});
formatter.step({
  "name": "the user can see the added item to the cart",
  "keyword": "Then ",
  "line": 9
});
formatter.step({
  "name": "user click on proceed to checkout",
  "keyword": "When ",
  "line": 10
});
formatter.step({
  "name": "user should be redirected to the checkout page OPC",
  "keyword": "Then ",
  "line": 11
});
formatter.match({
  "location": "PinnacleStepDefinitions.start()"
});
formatter.result({
  "duration": 2372358202,
  "status": "passed"
});
formatter.match({
  "location": "PinnacleStepDefinitions.addItemToTheCart()"
});
formatter.result({
  "duration": 3970513673,
  "status": "passed"
});
formatter.match({
  "location": "PinnacleStepDefinitions.clickMyCart()"
});
formatter.result({
  "duration": 7242673330,
  "status": "passed"
});
formatter.match({
  "location": "PinnacleStepDefinitions.verifyItemInCart()"
});
formatter.result({
  "duration": 2681486355,
  "status": "passed"
});
formatter.match({
  "location": "PinnacleStepDefinitions.proceedToCheckout()"
});
formatter.result({
  "duration": 585752381,
  "status": "passed"
});
formatter.match({
  "location": "PinnacleStepDefinitions.verifyCheckoutPage()"
});
formatter.result({
  "duration": 15481167657,
  "status": "passed"
});
formatter.uri('com\pinnacle\cart\automation\store\cucumber\Cart04_update quantities.feature');
formatter.feature({
  "id": "this-feature-is-used-to-test-update-quantities",
  "description": "",
  "name": "This feature is used to test update quantities",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "this-feature-is-used-to-test-update-quantities;test-that-a-user-can-update-quantities-of-an-item-in-the-cart",
  "description": "",
  "name": "Test that a user can update quantities of an item in the cart",
  "keyword": "Scenario",
  "line": 3,
  "type": "scenario"
});
formatter.step({
  "name": "as a guest user start a application",
  "keyword": "Given ",
  "line": 4
});
formatter.step({
  "name": "user add an item to the cart",
  "keyword": "When ",
  "line": 5
});
formatter.step({
  "name": "click on My Cart",
  "keyword": "And ",
  "line": 6
});
formatter.step({
  "name": "the user can see the added item to the cart",
  "keyword": "Then ",
  "line": 7
});
formatter.step({
  "name": "user changes the quantity for the added item",
  "keyword": "When ",
  "line": 8
});
formatter.step({
  "name": "click on update",
  "keyword": "And ",
  "line": 9
});
formatter.step({
  "name": "quantity for that item should be updated",
  "keyword": "Then ",
  "line": 10
});
formatter.step({
  "name": "sub total should be recalculated correctly",
  "keyword": "And ",
  "line": 11
});
formatter.match({
  "location": "PinnacleStepDefinitions.start()"
});
formatter.result({
  "duration": 1744449966,
  "status": "passed"
});
formatter.match({
  "location": "PinnacleStepDefinitions.addItemToTheCart()"
});
formatter.result({
  "duration": 2962091741,
  "status": "passed"
});
formatter.match({
  "location": "PinnacleStepDefinitions.clickMyCart()"
});
formatter.result({
  "duration": 3752047856,
  "status": "passed"
});
formatter.match({
  "location": "PinnacleStepDefinitions.verifyItemInCart()"
});
formatter.result({
  "duration": 1770868767,
  "status": "passed"
});
formatter.match({
  "location": "PinnacleStepDefinitions.changeQuantity()"
});
formatter.result({
  "duration": 142629701,
  "status": "passed"
});
formatter.match({
  "location": "PinnacleStepDefinitions.clickUpdate()"
});
formatter.result({
  "duration": 6105253384,
  "status": "passed"
});
formatter.match({
  "location": "PinnacleStepDefinitions.verifyQuantityUpdated()"
});
formatter.result({
  "duration": 29768629,
  "status": "passed"
});
formatter.match({
  "location": "PinnacleStepDefinitions.recalculatedSubTotal()"
});
formatter.result({
  "duration": 62713039,
  "status": "passed"
});
formatter.uri('com\pinnacle\cart\automation\store\cucumber\Cart05_Cart Widget.feature');
formatter.feature({
  "id": "this-feature-is-used-to-test-cart-widget",
  "description": "",
  "name": "This feature is used to test Cart Widget",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "this-feature-is-used-to-test-cart-widget;test-that-a-user-can-add-an-item-to-the-cart,-and-item-is-displayed-by-cart-widget",
  "description": "",
  "name": "Test that a user can add an item to the cart, and item is displayed by cart widget",
  "keyword": "Scenario",
  "line": 3,
  "type": "scenario"
});
formatter.step({
  "name": "as a guest user start a application",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "user add an item to the cart",
  "keyword": "When ",
  "line": 6
});
formatter.step({
  "name": "click on My Cart",
  "keyword": "And ",
  "line": 7
});
formatter.step({
  "name": "the user can see the added item to the cart",
  "keyword": "Then ",
  "line": 8
});
formatter.match({
  "location": "PinnacleStepDefinitions.start()"
});
formatter.result({
  "duration": 1921018901,
  "status": "passed"
});
formatter.match({
  "location": "PinnacleStepDefinitions.addItemToTheCart()"
});
formatter.result({
  "duration": 2941176196,
  "status": "passed"
});
formatter.match({
  "location": "PinnacleStepDefinitions.clickMyCart()"
});
formatter.result({
  "duration": 3858567166,
  "status": "passed"
});
formatter.match({
  "location": "PinnacleStepDefinitions.verifyItemInCart()"
});
formatter.result({
  "duration": 1754428525,
  "status": "passed"
});
formatter.uri('com\pinnacle\cart\automation\store\cucumber\Cart06_Remove item via Cart Widget.feature');
formatter.feature({
  "id": "this-feature-is-used-to-test-remove-an-item-from-the-cart-using-the-cart-widget",
  "description": "",
  "name": "This feature is used to test remove an item from the cart using the cart widget",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "this-feature-is-used-to-test-remove-an-item-from-the-cart-using-the-cart-widget;test-that-a-user-can-remove-an-item-from-the-cart-using-the-cart-widget",
  "description": "",
  "name": "Test that a user can remove an item from the cart using the cart widget",
  "keyword": "Scenario",
  "line": 3,
  "type": "scenario"
});
formatter.step({
  "name": "as a guest user start a application",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "user add an item to the cart",
  "keyword": "When ",
  "line": 6
});
formatter.step({
  "name": "click on My Cart",
  "keyword": "And ",
  "line": 7
});
formatter.step({
  "name": "the user can see the added item to the cart",
  "keyword": "Then ",
  "line": 8
});
formatter.step({
  "name": "user click Red X next to the item",
  "keyword": "When ",
  "line": 9
});
formatter.step({
  "name": "the item should be removed",
  "keyword": "Then ",
  "line": 10
});
formatter.match({
  "location": "PinnacleStepDefinitions.start()"
});
formatter.result({
  "duration": 1663640669,
  "status": "passed"
});
formatter.match({
  "location": "PinnacleStepDefinitions.addItemToTheCart()"
});
formatter.result({
  "duration": 3326819856,
  "status": "passed"
});
formatter.match({
  "location": "PinnacleStepDefinitions.clickMyCart()"
});
formatter.result({
  "duration": 3887441761,
  "status": "passed"
});
formatter.match({
  "location": "PinnacleStepDefinitions.verifyItemInCart()"
});
formatter.result({
  "duration": 1772443592,
  "status": "passed"
});
formatter.match({
  "location": "PinnacleStepDefinitions.Red_X()"
});
formatter.result({
  "duration": 10303242740,
  "status": "passed"
});
formatter.match({
  "location": "PinnacleStepDefinitions.verifyItemRemoveFromCart()"
});
formatter.result({
  "duration": 42251043,
  "status": "passed"
});
formatter.uri('com\pinnacle\cart\automation\store\cucumber\opc_01-Custom Payment Method.feature');
formatter.feature({
  "id": "this-feature-is-used-to-test-custom-payment-method",
  "description": "",
  "name": "This feature is used to test Custom Payment Method",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "this-feature-is-used-to-test-custom-payment-method;test-that-the-user-can-checkout-using-a-custom-payment-method",
  "description": "",
  "name": "Test that the user can checkout using a Custom Payment Method",
  "keyword": "Scenario",
  "line": 3,
  "type": "scenario"
});
formatter.step({
  "name": "that admin is login to the application",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "admin navigate to active payment gateways",
  "keyword": "And ",
  "line": 6
});
formatter.step({
  "name": "check custom payment methods",
  "keyword": "And ",
  "line": 7
});
formatter.step({
  "name": "as a guest user start a application",
  "keyword": "When ",
  "line": 8
});
formatter.step({
  "name": "user add an item to the cart and place order",
  "keyword": "And ",
  "line": 9
});
formatter.step({
  "name": "Ensure thank you page is displayed",
  "keyword": "Then ",
  "line": 10
});
formatter.step({
  "name": "as an admin navigate to browse orders",
  "keyword": "When ",
  "line": 11
});
formatter.step({
  "name": "Check the checkbox for the new order and Set New Payment Status to Received",
  "keyword": "And ",
  "line": 12
});
formatter.step({
  "name": "Check the checkbox for the order, and Set New Order Status to Complete",
  "keyword": "And ",
  "line": 13
});
formatter.step({
  "name": "Ensure order complete notifications",
  "keyword": "Then ",
  "line": 14
});
formatter.match({
  "location": "PinnacleStepDefinitions.admin_login()"
});
formatter.result({
  "duration": 12652596362,
  "status": "passed"
});
formatter.match({
  "location": "PinnacleStepDefinitions.Navigate_to_Active_Payment_Gateways()"
});
formatter.result({
  "duration": 13545258143,
  "status": "passed"
});
formatter.match({
  "location": "PinnacleStepDefinitions.check_custom_payment_methods()"
});
formatter.result({
  "duration": 23350341,
  "status": "passed"
});
formatter.match({
  "location": "PinnacleStepDefinitions.start()"
});
formatter.result({
  "duration": 1706413388,
  "status": "passed"
});
formatter.match({
  "location": "PinnacleStepDefinitions.Add_Item_And_Place_Order()"
});
formatter.result({
  "duration": 33291562903,
  "status": "passed"
});
formatter.match({
  "location": "PinnacleStepDefinitions.Ensure_Thank_you_Page()"
});
formatter.result({
  "duration": 36032001,
  "status": "passed"
});
formatter.match({
  "location": "PinnacleStepDefinitions.Navigate_To_Orders()"
});
formatter.result({
  "duration": 12347893584,
  "status": "passed"
});
formatter.match({
  "location": "PinnacleStepDefinitions.Check_New_Order_And_Set_New_Payment_Status()"
});
formatter.result({
  "duration": 5969952802,
  "status": "passed"
});
formatter.match({
  "location": "PinnacleStepDefinitions.Check_New_Order_And_Set_New_Order_Status()"
});
formatter.result({
  "duration": 338678407,
  "status": "passed"
});
formatter.match({
  "location": "PinnacleStepDefinitions.Ensure_Order()"
});
formatter.result({
  "duration": 5652867932,
  "status": "passed"
});
formatter.uri('com\pinnacle\cart\automation\store\cucumber\opc_08-Purchase Gift Certificate.feature');
formatter.feature({
  "id": "this-feature-is-used-to-test-purchase-gift-certificate",
  "description": "",
  "name": "This feature is used to test Purchase Gift Certificate",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "this-feature-is-used-to-test-purchase-gift-certificate;test-that-the-user-can-purchase-a-gift-certificate",
  "description": "",
  "name": "Test that the user can purchase a gift certificate",
  "keyword": "Scenario",
  "line": 3,
  "type": "scenario"
});
formatter.step({
  "name": "that admin is login to the application",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "navigate to Categories \u0026 Products to Gift Certificates",
  "keyword": "When ",
  "line": 6
});
formatter.step({
  "name": "go to Gift Certificates Settings and move to Enable Module button",
  "keyword": "And ",
  "line": 7
});
formatter.step({
  "name": "as a guest user start a application",
  "keyword": "Then ",
  "line": 8
});
formatter.step({
  "name": "navigate to Gift Certificates link",
  "keyword": "And ",
  "line": 9
});
formatter.step({
  "name": "user fill the from and add item to cart",
  "keyword": "When ",
  "line": 10
});
formatter.step({
  "name": "Proceed to checkout",
  "keyword": "And ",
  "line": 11
});
formatter.step({
  "name": "order status should be complete,payment received and ensure email contains Voucher code",
  "keyword": "Then ",
  "line": 12
});
formatter.match({
  "location": "PinnacleStepDefinitions.admin_login()"
});
formatter.result({
  "duration": 7653431602,
  "status": "passed"
});
formatter.match({
  "location": "PinnacleStepDefinitions.Navigate_To_Categories_And_Products_To_Gift_Certificates()"
});
formatter.result({
  "duration": 1584799554,
  "status": "passed"
});
formatter.match({
  "location": "PinnacleStepDefinitions.Click_On_Gift_Certificate_Settings_And_Click_Enable_Module()"
});
formatter.result({
  "duration": 13466545813,
  "status": "passed"
});
formatter.match({
  "location": "PinnacleStepDefinitions.start()"
});
formatter.result({
  "duration": 2653407339,
  "status": "passed"
});
formatter.match({
  "location": "PinnacleStepDefinitions.Click_Gift_Certificate_Link()"
});
formatter.result({
  "duration": 326266918,
  "status": "passed"
});
formatter.match({
  "location": "PinnacleStepDefinitions.Fill_Form_And_Click_Add_Cart()"
});
formatter.result({
  "duration": 8983566758,
  "status": "passed"
});
formatter.match({
  "location": "PinnacleStepDefinitions.Proceed_To_Checkout_And_Complete_Order()"
});
formatter.result({
  "duration": 24776612796,
  "status": "passed"
});
formatter.match({
  "location": "PinnacleStepDefinitions.find_the_order_and_status_it_to_Completed_payment_Received_and_ensure_the_email_contains_a_Voucher_Code()"
});
formatter.result({
  "duration": 24359693807,
  "status": "passed"
});
formatter.uri('com\pinnacle\cart\automation\store\cucumber\opc_09- Pay with Gift Certificate.feature');
formatter.feature({
  "id": "this-feature-is-used-to-test-pay-with-gift-certificate",
  "description": "",
  "name": "This feature is used to test Pay with Gift Certificate",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "this-feature-is-used-to-test-pay-with-gift-certificate;test-that-a-user-can-use-a-gift-certificate-to-purchase",
  "description": "",
  "name": "Test that a user can use a gift certificate to purchase",
  "keyword": "Scenario",
  "line": 3,
  "type": "scenario"
});
formatter.step({
  "name": "Retrieve a voucher from previous test",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "as a guest user start a application",
  "keyword": "And ",
  "line": 6
});
formatter.step({
  "name": "user add an item to cart and move to My cart",
  "keyword": "When ",
  "line": 7
});
formatter.step({
  "name": "Fill up billing information,Shipping Address and Method",
  "keyword": "And ",
  "line": 8
});
formatter.step({
  "name": "Fill up gift certifcate entries with voucher code",
  "keyword": "And ",
  "line": 9
});
formatter.step({
  "name": "If gift certificate cannot have enough payment",
  "keyword": "And ",
  "line": 10
});
formatter.step({
  "name": "use other mode of payment",
  "keyword": "Then ",
  "line": 11
});
formatter.step({
  "name": "order should be complete",
  "keyword": "And ",
  "line": 12
});
formatter.match({
  "location": "PinnacleStepDefinitions.Retrieve_Voucher_Code()"
});
formatter.result({
  "duration": 14457708128,
  "status": "passed"
});
formatter.match({
  "location": "PinnacleStepDefinitions.start()"
});
formatter.result({
  "duration": 1731191571,
  "status": "passed"
});
formatter.match({
  "location": "PinnacleStepDefinitions.Add_Item_And_Move_To_My_Cart()"
});
formatter.result({
  "duration": 6375566179,
  "status": "passed"
});
formatter.match({
  "location": "PinnacleStepDefinitions.Fill_Form()"
});
formatter.result({
  "duration": 18902210121,
  "status": "passed"
});
formatter.match({
  "location": "PinnacleStepDefinitions.Fill_Up_Gift_Certificate()"
});
formatter.result({
  "duration": 5240548832,
  "status": "passed"
});
formatter.match({
  "location": "PinnacleStepDefinitions.Check_Gift_Certificate_Fund()"
});
formatter.result({
  "duration": 45728,
  "status": "passed"
});
formatter.match({
  "location": "PinnacleStepDefinitions.Mode_Of_Payment()"
});
formatter.result({
  "duration": 1235619046,
  "status": "passed"
});
formatter.match({
  "location": "PinnacleStepDefinitions.Complete_Order()"
});
formatter.result({
  "duration": 6374199464,
  "status": "passed"
});
formatter.uri('com\pinnacle\cart\automation\store\cucumber\opc_10- Promo Code Discounts.feature');
formatter.feature({
  "id": "this-feature-is-used-to-test-that-an-admin-can-enable-and-create-promo-codes,-and-then-a-user-can-use-a-promo-code-to-receive-a-discount-on-their-order.",
  "description": "",
  "name": "This feature is used to test that an admin can enable and create promo codes, and then a user can use a promo code to receive a discount on their order.",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "this-feature-is-used-to-test-that-an-admin-can-enable-and-create-promo-codes,-and-then-a-user-can-use-a-promo-code-to-receive-a-discount-on-their-order.;test-that-an-admin-can-enable-and-create-promo-codes,-and-that-a-user-can-use-a-promo-code-to-receive-a-discount-on-their-order",
  "description": "",
  "name": "Test that an admin can enable and create promo codes, and that a user can use a promo code to receive a discount on their order",
  "keyword": "Scenario",
  "line": 3,
  "type": "scenario"
});
formatter.step({
  "name": "that admin is login to the application",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "admin move to Discount/Promo code section to enable promo codes",
  "keyword": "When ",
  "line": 6
});
formatter.step({
  "name": "creates new Promo code",
  "keyword": "And ",
  "line": 7
});
formatter.step({
  "name": "promo code should be created",
  "keyword": "Then ",
  "line": 8
});
formatter.step({
  "name": "user add items to the cart with the Promo code",
  "keyword": "When ",
  "line": 9
});
formatter.step({
  "name": "the cart total should display the discounted correct amount",
  "keyword": "Then ",
  "line": 10
});
formatter.match({
  "location": "PinnacleStepDefinitions.admin_login()"
});
formatter.result({
  "duration": 7365122872,
  "status": "passed"
});
formatter.match({
  "location": "PinnacleStepDefinitions.Enable_Promo_Code()"
});
formatter.result({
  "duration": 4984318941,
  "status": "passed"
});
formatter.match({
  "location": "PinnacleStepDefinitions.Create_New_Promo_Code()"
});
formatter.result({
  "duration": 4952022659,
  "status": "passed"
});
formatter.match({
  "location": "PinnacleStepDefinitions.Promo_Code_Created()"
});
formatter.result({
  "duration": 274056446,
  "status": "passed"
});
formatter.match({
  "location": "PinnacleStepDefinitions.Add_Item_with_Promo_Code()"
});
formatter.result({
  "duration": 36149685385,
  "status": "passed"
});
formatter.match({
  "location": "PinnacleStepDefinitions.Check_Discounted_Amount()"
});
formatter.result({
  "duration": 18045103927,
  "status": "passed"
});
formatter.uri('com\pinnacle\cart\automation\store\cucumber\opc_12-Product Level Discounts.feature');
formatter.feature({
  "id": "this-feature-is-used-to-test-than-an-admin-can-create-product-level-discounts,-and-that-a-user-gets-the-correct-discounts-applied-in-their-cart.",
  "description": "",
  "name": "This feature is used to test than an admin can create product level discounts, and that a user gets the correct discounts applied in their cart.",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "this-feature-is-used-to-test-than-an-admin-can-create-product-level-discounts,-and-that-a-user-gets-the-correct-discounts-applied-in-their-cart.;test-than-an-admin-can-create-product-level-discounts,-and-that-a-user-gets-the-correct-discounts-applied-in-their-cart",
  "description": "",
  "name": "Test than an admin can create product level discounts, and that a user gets the correct discounts applied in their cart",
  "keyword": "Scenario",
  "line": 3,
  "type": "scenario"
});
formatter.step({
  "name": "that admin is login to the application",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "move on quantity discounts",
  "keyword": "And ",
  "line": 6
});
formatter.step({
  "name": "Setup a quantity discount",
  "keyword": "When ",
  "line": 7
});
formatter.step({
  "name": "as a guest user start a application",
  "keyword": "And ",
  "line": 8
});
formatter.step({
  "name": "find the product and add to cart",
  "keyword": "And ",
  "line": 9
});
formatter.step({
  "name": "get the discount",
  "keyword": "Then ",
  "line": 10
});
formatter.step({
  "name": "complete order and order total should be calculated correctly",
  "keyword": "And ",
  "line": 11
});
formatter.match({
  "location": "PinnacleStepDefinitions.admin_login()"
});
formatter.result({
  "duration": 7690409431,
  "status": "passed"
});
formatter.match({
  "location": "PinnacleStepDefinitions.Navigate_To_Quantity_Discounts()"
});
formatter.result({
  "duration": 15964301629,
  "status": "passed"
});
formatter.match({
  "location": "PinnacleStepDefinitions.Setup_Quantity_Discount()"
});
formatter.result({
  "duration": 8951109960,
  "status": "passed"
});
formatter.match({
  "location": "PinnacleStepDefinitions.start()"
});
formatter.result({
  "duration": 7851832046,
  "status": "passed"
});
formatter.match({
  "location": "PinnacleStepDefinitions.Find_Product_And_Add_To_Cart()"
});
formatter.result({
  "duration": 4751477652,
  "status": "passed"
});
formatter.match({
  "location": "PinnacleStepDefinitions.Get_Discount()"
});
formatter.result({
  "duration": 10423035377,
  "status": "passed"
});
formatter.match({
  "location": "PinnacleStepDefinitions.Complete_Order_And_Total_Calculated()"
});
formatter.result({
  "duration": 23702700067,
  "status": "passed"
});
});