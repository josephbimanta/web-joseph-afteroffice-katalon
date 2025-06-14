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

validFullName = GlobalVariable.global_validFullName

validEmail = GlobalVariable.global_validEmail

CurrentAddress = GlobalVariable.global_CurrentAddress

PermanentAddress = GlobalVariable.global_PermanentAddress

WebUI.openBrowser('https://demoqa.com/text-box')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Text Box/Text Box_Field_Valid Full Name'), validFullName)

WebUI.setText(findTestObject('Text Box/Text Box_Field_Valid Email'), validEmail)

WebUI.setText(findTestObject('Text Box/Text Box_Field_Current Address'), CurrentAddress)

WebUI.scrollToElement(findTestObject('Text Box/Text Box_Field_Permanent Address'), 0)

WebUI.setText(findTestObject('Text Box/Text Box_Field_Permanent Address'), PermanentAddress)

WebUI.click(findTestObject('Text Box/Text Box_Button_Submit'))

WebUI.verifyElementPresent(findTestObject('Text Box/Text Box_Text_Full Name', [('FullName') : validFullName]), 0)

WebUI.verifyElementPresent(findTestObject('Text Box/Text Box_Text_Email', [('Email') : validEmail]), 0)

WebUI.verifyElementPresent(findTestObject('Text Box/Text Box_Text_Current Address', [('CurrentAddress') : CurrentAddress]), 0)

WebUI.verifyElementPresent(findTestObject('Text Box/Text Box_Text_Permanent Address', [('PermanentAddress') : PermanentAddress]), 0)

WebUI.closeBrowser()

