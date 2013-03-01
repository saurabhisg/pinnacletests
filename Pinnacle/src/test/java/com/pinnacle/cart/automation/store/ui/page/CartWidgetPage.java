package com.pinnacle.cart.automation.store.ui.page;



import org.junit.Assert;
import org.openqa.selenium.By;



public class CartWidgetPage extends PinnacleBasePage {

	
	public CartWidgetPage()
	{
		
	}
	
	
	/**
	 * Check that item was added successfully
	 * @throws Exception
	 */
	
	public void verifyItemInCart(){
		
    	// Check that item was added successfully
    	
			Assert.assertTrue(driver.getPageSource().contains("Samsung 32GB Galaxy Note 10.1"));
		    logger.info("item was added to the cart");
    }
	
    /**
     *Click on proceed to checkout
     *@throws Exception
     */
    
	public void proceedToChekout() throws Exception {
		// Click on proceed to checkout
		PinnacleUtilPage.click("BTN_TO_CHECKOUT");
		
		logger.info("clicked on proceed to checkout");
		
	}
	
	/**
     *Click on remove under the item
     * @throws Exception
     */
    
	public void removeItemFromCart() throws Exception {
		//Click on remove under the item
		
		PinnacleUtilPage.click("LNK_TO_REMOVE_ITEM");
		
		driver.switchTo().alert().accept();
		PinnacleUtilPage.sleep(5);
		logger.info("Clicked Remove under the item");
		
	}
	
	/**
     *Click on Red X
     * @throws Exception
     */
	
	 public void Red_X() throws Exception {
		//Click on Red X 
		 PinnacleUtilPage.click("LNK_TO_RED_X");
		
		driver.switchTo().alert().accept();
		PinnacleUtilPage.sleep(10);
		logger.info("Clicked on Red X");
	}
	

	/**
	 *check item removed successfully
	 * @throws Exception
	 */
	
   public void verifyItemRemoveFromCart(){
			// check item removed successfully
	        String item_remove=PinnacleUtilPage.getObject("TXT_REMOVE_ITEM").getText();
	        item_remove=item_remove.substring(0,27);
	        if(item_remove.equalsIgnoreCase("your shopping cart is empty"))
	        {
	             Assert.assertTrue("Item not removed successfully",true);
	             logger.info("item was removed");
	        }
	        else
	        {
	        	Assert.assertTrue("Item not removed successfully",false);
	        	logger.info("item was not removed");
	        }
			//Assert.assertTrue(!driver.getPageSource().contains("Samsung 32GB Galaxy Note 10.1"));
			
   }	
		
   /**
    *Change the quantity for the added item
    * @throws Exception
    */
   
   public void changeQuantity(){
		
	        //Change the quantity for the added item
			
			driver.findElement(By.xpath(Orproperty.getProperty("TXT_QUANTITY"))).clear();
			PinnacleUtilPage.setText("TXT_QUANTITY","4");
			logger.info("Changed the quantity for the added item");
   }
   
   /**
    *click on update
    * @throws Exception
    */
   
   public void updateQuantities() throws Exception {
		// click on update 
	   
		PinnacleUtilPage.click("BTN_UPDATE");
		PinnacleUtilPage.sleep(5);
		logger.info("clicked on update");
	}
	
   /**
    *check quantity updated successfully
    * @throws Exception
    */
   
   public void verifyQuantityUpdated() throws Exception{
		//check quantity updated successfully
			
			Assert.assertTrue("Item not updated successfully", driver.getPageSource().contains("4"));
			logger.info("item was updated");
			
   }
   
   /**
    * subtotal should be recalculated correctly
    * @throws Exception
    */
   
   public void recalculatedSubTotal() throws Exception{
	   //check subtotal should be recalculated correctly
	   
	   String Price,Total;
		Double price,subtotal,total;
		
		Price=PinnacleUtilPage.getObject("TXT_PRICE").getText();
		Total=PinnacleUtilPage.getObject("TXT_TOTAL").getText();
		price=Double.parseDouble(Price.substring(1));
		Total=Total.replace(",","");
		total=Double.parseDouble(Total.substring(1));
	    subtotal=price*4;
		if(Double.compare(subtotal,total)==0)
		{
			Assert.assertTrue("Subtotal is not correct", true);
			logger.info("subtotal calculated is correct");
		}
		else
		{
			Assert.assertTrue("Subtotal is not correct", false);
		}
	   
	   
   }
}
