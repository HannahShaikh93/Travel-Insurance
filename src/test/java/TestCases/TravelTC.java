package TestCases;

import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Components.Travel;
import Utilities.BaseClass;
import Utilities.XLUtils;


public class TravelTC extends BaseClass {
	
		
		
		String expected_ID = "Travel";


		@Test(dataProvider = "TravelerDetailsScenarios", priority = 6)
		public void TravelOnlyFlow(String TestCaseID, String Scenario_Description, String URL, String StartDate, String EndDate, String T1DOB, String T2DOB, String T3DOB,
				String T4DOB, String T5DOB, String T6DOB, String T7DOB, String T8DOB, String T9DOB, String T10DOB,
				String T11DOB, String T12DOB, String Phonenumber, String Email, String FN_Traveler1, String LN_Traveler1, String FN_Traveler2,
				String LN_Traveler2, String FN_Traveler3, String LN_Traveler3, String FN_Traveler4, String LN_Traveler4,
				String FN_Traveler5, String LN_Traveler5, String FN_Traveler6, String LN_Traveler6, String FN_Traveler7,
				String LN_Traveler7, String FN_Traveler8, String LN_Traveler8, String FN_Traveler9, String LN_Traveler9,
				String FN_Traveler10, String LN_Traveler10, String FN_Traveler11, String LN_Traveler11,
				String FN_Traveler12, String LN_Traveler12, String Address_Line1, String city, 
				String PostCode, String med_conditionT1, String med_conditionT2, String med_conditionT3,
				String med_conditionT4, String med_conditionT5, String med_conditionT6, String med_conditionT7,
				String med_conditionT8, String med_conditionT9, String med_conditionT10, String med_conditionT11,
				String med_conditionT12,  String cardnumber, String securityCVV)
				throws InterruptedException, IOException {

			Travel SC_Travel = new Travel();


			driver.get(URL);
			 
		//	if (TestCaseID.equalsIgnoreCase(expected_ID)) {

				System.out.println(TestCaseID);
				System.out.println("Verify user able to create Travel policy");
				SC_Travel.GetQuoteTest();
				takeScreenshot("Scenario_TravelOnly");
				SC_Travel.PreExistingMedicalQuesTest();
				SC_Travel.ChooseCover();
				SC_Travel.Details();
				SC_Travel.Summary();
				SC_Travel.Payment();
				
			}
		
		@DataProvider(name = "TravelerDetailsScenarios")
		public String[][] Traveller_Details(Method m) throws IOException {
			System.out.println(m.getName());
			String path =  System.getProperty("user.dir") + "\\src\\test\\java\\TestData\\Insurefor_TestData_New.xls";
			XLUtils xlpath = new XLUtils(path);

			int totalrows = xlpath.getRowCount("Validation_scenarios_3");
			System.out.println("Number of rows " + totalrows);

			int totalcols = xlpath.getCellCount("Validation_scenarios_3", 1);
			System.out.println("Number of Column " + totalcols);

			String TravellerDetails[][] = new String[totalrows][totalcols];

			for (int i = 1; i <= totalrows; i++) {
				for (int j = 0; j < totalcols; j++) {

					TravellerDetails[i - 1][j] = xlpath.getCellData("Validation_scenarios_3", i, j);
					System.out.println(TravellerDetails[i - 1][j]);
				}

			}
			return TravellerDetails;
		}
}




	

