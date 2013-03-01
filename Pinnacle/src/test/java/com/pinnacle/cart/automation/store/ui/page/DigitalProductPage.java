package com.pinnacle.cart.automation.store.ui.page;
public class DigitalProductPage extends PinnacleBasePage{


	
	
	/**
	 * Set Digital Products Active to Yes, and click Save changes
	 */
	
	public void Set_Digital_Product_And_Save_Changes()
	{
		//Set Digital Products Active to Yes, and click Save changes
		PinnacleUtilPage.sleep(3);
		putil.selectValueInDropDown("SELCT_DIGITAL_PRODUCT","Yes");
		PinnacleUtilPage.click("BTN_SAVE_CHANGES");
		logger.info("Set Digital Products Active to Yes, and clicked Save changes");
		PinnacleUtilPage.sleep(5);
	}
	
	

}
