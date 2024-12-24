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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://orange.katalon.com/web/index.php/auth/login')

WebUI.setText(findTestObject('Object Repository/Employee-Onboarding/Employee_Salary_Details/Page_OrangeHRM/input_Username_username'), 
    'mahtab')

WebUI.setEncryptedText(findTestObject('Object Repository/Employee-Onboarding/Employee_Salary_Details/Page_OrangeHRM/input_Password_password'), 
    'p7egalF197zCPQnMaznrNq5yBULcTkKN')

WebUI.click(findTestObject('Object Repository/Employee-Onboarding/Employee_Salary_Details/Page_OrangeHRM/button_Login'))

WebUI.click(findTestObject('Object Repository/Employee-Onboarding/Employee_Salary_Details/Page_OrangeHRM/a_PIM'))

WebUI.setText(findTestObject('Object Repository/Employee-Onboarding/Employee_Salary_Details/Page_OrangeHRM/input'), 'Alice Johnson')

WebUI.click(findTestObject('Object Repository/Employee-Onboarding/Employee_Salary_Details/Page_OrangeHRM/button_Search'))

WebUI.click(findTestObject('Object Repository/Employee-Onboarding/Employee_Salary_Details/Page_OrangeHRM/div_0034008'))

WebUI.click(findTestObject('Object Repository/Employee-Onboarding/Employee_Salary_Details/Page_OrangeHRM/a_Salary'))

WebUI.click(findTestObject('Object Repository/Employee-Onboarding/Employee_Salary_Details/Page_OrangeHRM/button_Add'))

WebUI.setText(findTestObject('Object Repository/Employee-Onboarding/Employee_Salary_Details/Page_OrangeHRM/input_Salary Component_oxd-input oxd-input--focus'), 
    'ctc')

WebUI.click(findTestObject('Object Repository/Employee-Onboarding/Employee_Salary_Details/Page_OrangeHRM/div_-- Select --'))

WebUI.click(findTestObject('Object Repository/Employee-Onboarding/Employee_Salary_Details/Page_OrangeHRM/div_-- Select --_1'))

WebUI.click(findTestObject('Object Repository/Employee-Onboarding/Employee_Salary_Details/Page_OrangeHRM/div_-- Select --_1_2'))

WebUI.setText(findTestObject('Object Repository/Employee-Onboarding/Employee_Salary_Details/Page_OrangeHRM/input_Amount_oxd-input oxd-input--focus'), 
    '20000')

WebUI.setText(findTestObject('Object Repository/Employee-Onboarding/Employee_Salary_Details/Page_OrangeHRM/textarea_Comments_oxd-textarea oxd-textarea_6464fb'), 
    'ctc component')

WebUI.click(findTestObject('Object Repository/Employee-Onboarding/Employee_Salary_Details/Page_OrangeHRM/button_Save'))

WebUI.closeBrowser()

