import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

// Click on the employee record to open the salary details page
WebUI.comment('Step 1: Click on the employee record to open the salary details page')
WebUI.click(findTestObject('Object Repository/Employee-Onboarding/Employee_Salary_Detail_Objects/Page_OrangeHRM/div_0034008'))

// Navigate to the "Salary" section of the employee details
WebUI.comment('Step 2: Click on the "Salary" tab to access salary-related information')
WebUI.click(findTestObject('Object Repository/Employee-Onboarding/Employee_Salary_Detail_Objects/Page_OrangeHRM/a_Salary'))

// Click on the "Add" button to add a new salary record
WebUI.comment('Step 3: Click on the "Add" button to add a new salary record')
WebUI.click(findTestObject('Object Repository/Employee-Onboarding/Employee_Salary_Detail_Objects/Page_OrangeHRM/button_Add'))

// Set the salary component field to "CTC"
WebUI.comment('Step 4: Set the salary component field to "CTC"')
WebUI.setText(findTestObject('Object Repository/Employee-Onboarding/Employee_Salary_Detail_Objects/Page_OrangeHRM/input_Salary Component_oxd-input oxd-input--focus'),
	'CTC')

// Click to open the dropdown for selecting the "Grade" option
WebUI.comment('Step 5: Click on the dropdown to select the "Grade" option')
WebUI.click(findTestObject('Object Repository/Employee-Onboarding/Employee_Salary_Detail_Objects/Page_OrangeHRM/i_-- Select --_oxd-icon bi-caret-up-fill ox_627fec'))

// Select "Grade 1" from the custom dropdown for the grade
WebUI.comment('Step 6: Select "Grade 1" from the dropdown for the grade')
WebUI.click(findTestObject('Employee-Onboarding/Employee_Salary_Detail_Objects/Page_OrangeHRM/custom_object_for_dropdown', [('value') : 'Grade 1']), FailureHandling.STOP_ON_FAILURE)

// Click to open the dropdown for selecting the "Frequency" option
WebUI.comment('Step 7: Click on the dropdown to select the "Frequency" option')
WebUI.click(findTestObject('Object Repository/Employee-Onboarding/Employee_Salary_Detail_Objects/Page_OrangeHRM/i_-- Select --_oxd-icon bi-caret-up-fill ox_627fec_1'))

// Select "Monthly" from the custom dropdown for the frequency
WebUI.comment('Step 8: Select "Monthly" from the dropdown for the frequency')
WebUI.click(findTestObject('Employee-Onboarding/Employee_Salary_Detail_Objects/Page_OrangeHRM/custom_object_for_dropdown', [('value') : 'Monthly']), FailureHandling.STOP_ON_FAILURE)

// Click to open the dropdown for selecting the "Currency" option
WebUI.comment('Step 9: Click on the dropdown to select the "Currency" option')
WebUI.click(findTestObject('Object Repository/Employee-Onboarding/Employee_Salary_Detail_Objects/Page_OrangeHRM/i_-- Select --_oxd-icon bi-caret-up-fill ox_627fec_1_2'))

// Select "United States Dollar" from the custom dropdown for the currency
WebUI.comment('Step 10: Select "United States Dollar" from the dropdown for the currency')
WebUI.click(findTestObject('Employee-Onboarding/Employee_Salary_Detail_Objects/Page_OrangeHRM/custom_object_for_dropdown', [('value') : 'United States Dollar']),
	FailureHandling.STOP_ON_FAILURE)

// Set the salary amount to "30000"
WebUI.comment('Step 11: Set the salary amount to "30000"')
WebUI.setText(findTestObject('Object Repository/Employee-Onboarding/Employee_Salary_Detail_Objects/Page_OrangeHRM/input_Amount_oxd-input oxd-input--focus'),
	'30000')

// Set the comments field to "CTC Component"
WebUI.comment('Step 12: Set the comments field to "CTC Component"')
WebUI.setText(findTestObject('Object Repository/Employee-Onboarding/Employee_Salary_Detail_Objects/Page_OrangeHRM/textarea_Comments_oxd-textarea oxd-textarea_6464fb'),
	'CTC Component')

// Click the "Save" button to save the new salary details
WebUI.comment('Step 13: Click the "Save" button to save the new salary details')
WebUI.click(findTestObject('Object Repository/Employee-Onboarding/Employee_Salary_Detail_Objects/Page_OrangeHRM/button_Save'))

// Close the browser after the test execution
WebUI.comment('Step 14: Close the browser')
WebUI.closeBrowser()

