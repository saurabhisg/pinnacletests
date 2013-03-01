package com.pinnacle.cart.automation.store.ui.page;








public class PaymentMethodsPage extends PinnacleBasePage {
	

	

	/**
	 * Click Active Payment Gateways
	 */
	public void Active_Payment_Gateways()
	{
		//Active_Payment_Gateways
		PinnacleUtilPage.click("LNK_ACTIVE_PAYMENT");
		logger.info("Activated Payment Gateways");
	}
	
	/**
	 * If no custom payment methods
	 */

	public boolean check_custom_payment_methods()
	{
		//checking custom payment method
		String str= PinnacleUtilPage.getObject("TXT_CUSTOM_METHOD").getText();
		if(str.equalsIgnoreCase("custom method payment"))
		{
			logger.info("checked custom payment method");
			return(true);
		}
		else
		{
			logger.info("checked custom payment method");
			return(false);
		}
	}
	
	/**
	 * click Add a New Custom Payment Method
	 */

	public void Add_new_custom_payment_method(){
		//Adding new custom payment method
		PinnacleUtilPage.click("LNK_ADD_NEW_PAYMENT");
		PinnacleUtilPage.sleep(3);
		logger.info("Added new custom payment method");
		
	}
	
	/**
	 * Fill in the form, deselect Accept PayPal Express Checkout
	 */
	
	public void Fill_form()
	{
		//Filling a form
		putil.selectValueInDropDown("SELCT_METHOD","Yes");
		PinnacleUtilPage.setText("TXT_PAYMENT_METHOD_NAME", "custom method payment");
		PinnacleUtilPage.setText("TXT_PAYMENT_FORM_TITLE", "custom method payment");
		PinnacleUtilPage.click("CHK_ACCEPT_PAYPAL");
		logger.info("Filled a form");
	}
	
	/**
	 * click Save Changes
	 */
	
	public void Save_Changes()
	{
		//Save changes
		PinnacleUtilPage.click("BTN_ADD");
		PinnacleUtilPage.sleep(3);
		logger.info("Save the changes");
		
	}
	

}
