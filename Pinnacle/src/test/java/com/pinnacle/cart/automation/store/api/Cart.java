package com.pinnacle.cart.automation.store.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class Cart {

    final static Logger logger = LoggerFactory.getLogger(Cart.class);
    
    private String ItemID;
    
    
    
	public String getAgreementID(){
		
		return ItemID;
	}
	
	public void setAgreementID(String strItemID){
		
		this.ItemID = strItemID;
	}
	
}
