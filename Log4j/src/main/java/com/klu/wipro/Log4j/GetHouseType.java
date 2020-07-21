package com.klu.wipro.Log4j;

public class GetHouseType {

	public TotalAmount getPlan(String houseType)
	{   
      if(houseType.equalsIgnoreCase("standard material")) {  
             return new StandardMaterial();  
           }   
       else if(houseType.equalsIgnoreCase("Abovestandard material")){  
            return new AboveStandardMaterial();  
        }   
      else if(houseType.equalsIgnoreCase("Highstandard material")) {  
            return new HighStandartMaterial();  
      }
      else if(houseType.equalsIgnoreCase("HighstandardFullautomatic")) {  
    	  return new HighStandardFullautomatic();
      }
  return null;  
}
}
