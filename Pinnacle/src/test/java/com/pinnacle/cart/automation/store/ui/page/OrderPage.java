package com.pinnacle.cart.automation.store.ui.page;



public class OrderPage  extends PinnacleBasePage{




	
	/**
	 * Check the checkbox for the new order and Set New Payment Status to Received
	 */
	
	public void Check_New_Order_And_Set_New_Payment_Status()
	{
		//Check new order and set new payment status
		PinnacleUtilPage.click("CHK_ORDER");
		putil.selectValueInDropDown("SELCT_PAYMENT_STATUS","Received");
		logger.info("Checked new order and set new payment status");
	}

	/**
	 * click Update status and order should be displayed
	 */
	
	public void Update_Status()
	{
		//Update Status
		PinnacleUtilPage.click("BTN_UPDATE_STATUS");
		driver.switchTo().alert().accept();
		PinnacleUtilPage.sleep(3);
		PinnacleUtilPage.click("LNK_BROWSE_ORDER");
		PinnacleUtilPage.sleep(2);
		logger.info("Updated Status and ordered was displayed");
	}
	
	/**
	 * Check the checkbox for the order, and Set New Order Status to Complete
	 */
	
	public void Check_New_Order_And_Set_New_Order_Status()
	{
		//Check new order and set new order status
		PinnacleUtilPage.click("CHK_ORDER");
		putil.selectValueInDropDown("SELCT_ORDER_STATUS","Completed");
		logger.info("Checked new order and set new order status");
	}
	
	
}
