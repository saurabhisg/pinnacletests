package com.pinnacle.cart.automation.store.ui.page;

import org.junit.Assert;


public class PlaceOrderPage extends PinnacleBasePage{
	
	
	 /**
		 * click Place Order
		 */
	    
	    public void place_order()
	    {
	    	//Placing a order
	    	Assert.assertTrue("check box is not present", PinnacleUtilPage.isObjPresent("CHK_ACCEPT_TERMS",10));
	    	PinnacleUtilPage.click("CHK_ACCEPT_TERMS");
	    	PinnacleUtilPage.click("BTN_PLACE_ORDER");
	    	PinnacleUtilPage.sleep(5);
	    	logger.info("Placed Order");
	    }
	    
	
	/**
	 *Ensure Thank you page
	 * @throws
	 */
	public void Ensure_Thank_you_Page()throws Exception
	{
		String str= PinnacleUtilPage.getObject("LABEL_ENSURE_ORDER").getText();
		if(str.equalsIgnoreCase("your order has been sent"))
		{
			Assert.assertTrue("Your order has not been sent", true);
			logger.info("Ensured Thank you Page");
		}
		else
		{
			Assert.assertTrue("Your order has not been sent", false);
		}
	}

}
