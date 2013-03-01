package com.pinnacle.cart.automation.store.ui.page;

import org.junit.Assert;

public class ProductPage extends PinnacleUtilPage {
	
	/**
	 * Setup a quantity discount
	 * @throws
	 */

	public void Setup_Quantity_Discount() throws Exception
	{
		//Setup a quantity discount
		PinnacleUtilPage.setText("TXT_MIN_RANGE","2");
		PinnacleUtilPage.setText("TXT_MAX_RANGE", "100");
		PinnacleUtilPage.setText("TXT_DISCOUNT_RANGE","30");
		PinnacleUtilPage.click("CHK_WHOLESALE");
		PinnacleUtilPage.click("BTN_ADD_DISCOUNT");
		Assert.assertTrue("Save Button is not present",PinnacleUtilPage.isObjPresent("BTN_SAVE_DISCOUNT",20));
		PinnacleUtilPage.click("BTN_SAVE_DISCOUNT");
		logger.info("Setup a Quantity Discount");
	}

}
