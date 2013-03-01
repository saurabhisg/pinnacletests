Feature: Check if we can login into GPS and do something
  
   Scenario: Add Agreement
   Given the user logs in with username "BILLGRPR" and password "Temp1235!"
   When an agreement is added by a perspective of "Executing Firm" with exchange firm "407 - CBT - STRAITS FIN LLC"
   And agreement details are added where agreement reference number is "AGCBT407RE" and agreement date is "07-02-2012" and customer name is "CBT Customer" and EGUS reference number is "EGUS" and customer reference number is "CR407" and executing contact is "407 Exec Contact" and executing phone is "3120012323" and inter fcm agreement is "N" and bill carry firm indicator is "Y" and tiered agreement is "N"  
   Then this agreement should exist upon search
   
   Scenario: Delete Agreement
   Given the user logs in with username "BILLGRPR" and password "Temp1235!"
   Given an agreement exists with perspective of "Executing Firm" with exchange firm "407 - CBT - STRAITS FIN LLC" and agreement reference number is "AGCBT407RE"
   When the agreement is deleted
   Then this agreement should not exist upon search 
   
  