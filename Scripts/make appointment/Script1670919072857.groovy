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

WebUI.callTestCase(findTestCase('login test'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.selectOptionByValue(findTestObject('Object Repository/LoginObject/AppointmentObject/select_facility'), 'Hongkong CURA Healthcare Center', false)
WebUI.verifyOptionSelectedByValue(findTestObject('Object Repository/LoginObject/AppointmentObject/select_facility'), 'Hongkong CURA Healthcare Center', false, 10)
WebUI.check(findTestObject('Object Repository/LoginObject/AppointmentObject/input_Apply for hospital readmission_hospital_readmission'))
WebUI.click(findTestObject('Object Repository/LoginObject/AppointmentObject/label_Medicaid'))
WebUI.click(findTestObject('Object Repository/LoginObject/AppointmentObject/input_Visit Date (Required)_visit_date'))
WebUI.click(findTestObject('Object Repository/LoginObject/AppointmentObject/td_19'))
WebUI.setText(findTestObject('Object Repository/LoginObject/AppointmentObject/textarea_Comment_comment'), "Katalon comment")
WebUI.click(findTestObject('Object Repository/LoginObject/AppointmentObject/button_Book Appointment'))
WebUI.verifyElementPresent(findTestObject('Object Repository/LoginObject/AppointmentObject/h2_Appointment Confirmation'), 3)
WebUI.closeBrowser()