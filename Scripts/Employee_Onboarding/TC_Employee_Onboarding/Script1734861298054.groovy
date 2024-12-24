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

WebUI.click(findTestObject('Object Repository/Employee-Onboarding/Page_OrangeHRM/a_PIM'))

WebUI.click(findTestObject('Object Repository/Employee-Onboarding/Page_OrangeHRM/button_Add'))

WebUI.click(findTestObject('Object Repository/Employee-Onboarding/Page_OrangeHRM/input_Employee Full Name_firstName'))

WebUI.setText(findTestObject('Object Repository/Employee-Onboarding/Page_OrangeHRM/input_Employee Full Name_firstName'), 
    Firstname)

WebUI.setText(findTestObject('Object Repository/Employee-Onboarding/Page_OrangeHRM/input_Employee Full Name_lastName'), 
    Lastname)

WebUI.clearText(findTestObject('Object Repository/Employee-Onboarding/Page_OrangeHRM/input_Employee Id_oxd-input oxd-input--focus'))

WebUI.setText(findTestObject('Object Repository/Employee-Onboarding/Page_OrangeHRM/input_Employee Id_oxd-input oxd-input--focus'), 
    EmployeeID)

WebUI.click(findTestObject('Object Repository/Employee-Onboarding/Page_OrangeHRM/span_Employee Id_oxd-switch-input oxd-switc_efe210'))

// Retrieve the entered first and last name values and convert them to lowercase
String firstname = WebUI.getAttribute(findTestObject('Object Repository/Employee-Onboarding/Page_OrangeHRM/input_Employee Full Name_firstName'), 
    'value').toLowerCase()

String lastname = WebUI.getAttribute(findTestObject('Object Repository/Employee-Onboarding/Page_OrangeHRM/input_Employee Full Name_lastName'), 
    'value').toLowerCase()

// Concatenate the first name and last name to create a username
String username = (firstname + '.') + lastname

// Set the username field with the generated username
WebUI.setText(findTestObject('Object Repository/Employee-Onboarding/Page_OrangeHRM/input_Username_oxd-input oxd-input--focus'), 
    username)

WebUI.setEncryptedText(findTestObject('Object Repository/Employee-Onboarding/Page_OrangeHRM/input_Password_oxd-input oxd-input--active'), 
    'p7egalF197zCPQnMaznrNq5yBULcTkKN')

WebUI.setEncryptedText(findTestObject('Object Repository/Employee-Onboarding/Page_OrangeHRM/input_Confirm Password_oxd-input oxd-input-_a3aecb'), 
    'p7egalF197zCPQnMaznrNq5yBULcTkKN')

WebUI.click(findTestObject('Object Repository/Employee-Onboarding/Page_OrangeHRM/button_Save'))

