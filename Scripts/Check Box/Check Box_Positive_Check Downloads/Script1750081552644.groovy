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

WebUI.openBrowser('https://demoqa.com/checkbox')

WebUI.maximizeWindow()

WebUI.scrollToElement(findTestObject('Check Box/Check Box_Dropdown_Home'), 0)

WebUI.verifyElementPresent(findTestObject('Check Box/Check Box_Dropdown_Home'), 0)

WebUI.click(findTestObject('Check Box/Check Box_Dropdown_Home'))

WebUI.verifyElementPresent(findTestObject('Check Box/Check Box_Dropdown_Desktop'), 0)

WebUI.click(findTestObject('Check Box/Check Box_Check Box_Downloads'))

WebUI.verifyElementVisible(findTestObject('Check Box/Check Box_Text_Result'))

String resultText = WebUI.getText(findTestObject('Check Box/Check Box_Text_Result'))

WebUI.verifyMatch(resultText, '.*downloads.*wordFile.*excelFile.*', 
    true)

WebUI.closeBrowser()

