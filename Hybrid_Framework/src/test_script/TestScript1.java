package test_script;


import org.testng.annotations.Test;

import generic.Base_Test;
import generic.Generic_Script_ES;
import pom_script.Pom1;

public class TestScript1 extends Base_Test {
	@Test
	public  void test() throws InterruptedException
	{
		 //String val = Generic_Script_ES.get_data("sheet1",0,0);
		// String val1= Generic_Script_ES.get_data("sheet1",1,0);
			 
	   Pom1 p = new Pom1(driver);
	   
	   for(int i=0;i<2;i++)//i=0,i=row number
	   {
		   p.passUn(Generic_Script_ES.get_data("Sheet1", i, 0));
		   for(int j=1;j<=2;j++)//j=0,j=cell number
		   { 
	   p.passPwd(Generic_Script_ES.get_data("Sheet1",0,j));
	  Thread.sleep(3000);
		 p.logbtn();
	   }
	}
		  
	   }
}





