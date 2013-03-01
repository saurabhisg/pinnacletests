package com.pinnacle.cart.automation.store.ui.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PinnacleUtilPage extends PinnacleBasePage {
	
	/**
	 * sleep a thread 
	 * @param intSeconds
	 */
	
	public static void sleep(int intSeconds){
		
		  try{
			Thread.sleep(1000*intSeconds);
			
		    }catch(Exception e){
			
			 e.printStackTrace();
		 }
	 }
	
	
	
public static WebElement getObject(String xpathKey){
		
		// Initialize the xpath and Checking the type of the locator
		String strXpath = Orproperty.getProperty(xpathKey);
		
		if(strXpath.startsWith("//")){
			
			return driver.findElement(By.xpath(strXpath.trim()));
		
			
		}else{
			
			return driver.findElement(By.cssSelector(strXpath.trim()));
		}
	}

   public static boolean isElementPresent(String xpathKey){
	
	try{
		WebElement webElement = getObject(xpathKey);
		if(!(webElement == null)){
			
			return true;
			
		}else{
			
			return false;
		}
		
	}catch(Exception e){
		
		e.printStackTrace();
		return false;
	}
}
   
public void selectValueInDropDown(String xpathKey, String value){
		
		try{
			Select element = new Select(getObject(xpathKey));
			element.selectByVisibleText(value);
			
			
		}catch(Exception e){
			
			e.printStackTrace();
		}
	}

public void uploadFile(String strAutoITPath, String strWinTitle, String strFilePath){
	
	try{
		String dialog[];
		if(initproperty.getProperty("BROWSER").equalsIgnoreCase("IE")){
			
			dialog = new String[] {strAutoITPath, strWinTitle, strFilePath};
			sleep(3);
			Runtime.getRuntime().exec(dialog);
			sleep(3);
			
		}else{
			
			dialog = new String[] {strAutoITPath, strWinTitle, strFilePath};
			sleep(3);
			Runtime.getRuntime().exec(dialog);
			sleep(3);
		}
		
	}catch(Exception e){
		
		e.printStackTrace();
	}
}

public static boolean isObjPresent(String xpathKey, int intSeconds){
	
	boolean flag = false;
	for(int iCount=0; iCount<=intSeconds; iCount++){
		
		try{
			Thread.sleep(1000);
			if(isElementPresent(xpathKey)){
				
				flag = true;
				break;
				
			}else{
				
				flag = false;
			}
			
		}catch(Exception e){
			
			e.printStackTrace();
		}
	}
	return flag;
}

public static boolean click(String xpathKey){
	
	try{
		boolean blnElementPresent;
		
		// Check the element currently present or not 
		blnElementPresent = isElementPresent(xpathKey);
		
		if((blnElementPresent==true)){
			
			getObject(xpathKey).click();
			return true;
			
		}else{
			
			return false;
		}
		
		
	}catch(Exception e){
		
		e.printStackTrace();
		return false;
	}
}

public static boolean setText(String xpathKey, String value){
	
	try{
		boolean blnElementPresent;
        blnElementPresent = isElementPresent(xpathKey);
        if(blnElementPresent==true){
        	
        	//If this element is a text entry element, this will clear the value
            getObject(xpathKey).clear();
            //Typing into an element, which may set its value
            getObject(xpathKey).sendKeys(value);                          
            return true;
            
        }else{
        	
        	return false;
        }
		
	}catch(Exception e){
		
		e.printStackTrace();
		return false;
	}
}

}
