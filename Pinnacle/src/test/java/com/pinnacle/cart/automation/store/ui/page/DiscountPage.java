package com.pinnacle.cart.automation.store.ui.page;

public class DiscountPage extends PinnacleBasePage{
	/**
	 * Create a New Promo Code
	 */
	
	public void Create_New_Promo_Code()
	{
		//Create a New Promo Code
		PinnacleUtilPage.setText("TXT_CAMPAIGN_NAME","Test_Promo_1");
		PinnacleUtilPage.setText("TXT_PROMO_CODE","00001111");
		putil.selectValueInDropDown("SELCT_END_DATE_MONTH", "April");
		putil.selectValueInDropDown("SELCT_END_DATE_YEAR", "2014");
		PinnacleUtilPage.setText("TXT_DISCOUNT","500");
		PinnacleUtilPage.setText("TXT_MINIMUM_ORDER_SUBTOTAL", "1000");
		logger.info("Created a new promo code");
		
	}
	/**
	 * Promo Code Created
	 */
	public void Promo_Code_Created()
	{
		//Promo Code Created
		PinnacleUtilPage.click("BTN_DISCOUNT_SAVE_CHANGES");
		logger.info("Promo code created");
	}

}
