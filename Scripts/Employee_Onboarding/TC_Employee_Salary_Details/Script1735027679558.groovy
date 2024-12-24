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


WebUI.click(findTestObject('Object Repository/Employee-Onboarding/Employee_Salary_Details/Page_OrangeHRM/div_0034008'))

WebUI.click(findTestObject('Object Repository/Employee-Onboarding/Employee_Salary_Details/Page_OrangeHRM/a_Salary'))

WebUI.click(findTestObject('Object Repository/Employee-Onboarding/Employee_Salary_Details/Page_OrangeHRM/button_Add'))

WebUI.setText(findTestObject('Object Repository/Employee-Onboarding/Employee_Salary_Details/Page_OrangeHRM/input_Salary Component_oxd-input oxd-input--focus'), 
    'CTC')

WebUI.click(findTestObject('Object Repository/Employee-Onboarding/Employee_Salary_Details/Page_OrangeHRM/i_-- Select --_oxd-icon bi-caret-up-fill ox_627fec'))

WebUI.click(findTestObject('Object Repository/Employee-Onboarding/Employee_Salary_Details/Page_OrangeHRM/i_-- Select --_oxd-icon bi-caret-up-fill ox_627fec_1'))

WebUI.click(findTestObject('Object Repository/Employee-Onboarding/Employee_Salary_Details/Page_OrangeHRM/i_-- Select --_oxd-icon bi-caret-up-fill ox_627fec_1_2'))

WebUI.setText(findTestObject('Object Repository/Employee-Onboarding/Employee_Salary_Details/Page_OrangeHRM/input_Amount_oxd-input oxd-input--focus'), 
    '30000')

WebUI.setText(findTestObject('Object Repository/Employee-Onboarding/Employee_Salary_Details/Page_OrangeHRM/textarea_Comments_oxd-textarea oxd-textarea_6464fb'), 
    'CTC of the Employee.')

WebUI.click(findTestObject('Object Repository/Employee-Onboarding/Employee_Salary_Details/Page_OrangeHRM/button_Save'))

WebUI.closeBrowser()

