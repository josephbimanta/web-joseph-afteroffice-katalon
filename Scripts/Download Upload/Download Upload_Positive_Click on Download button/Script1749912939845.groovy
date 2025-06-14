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
import java.nio.file.Files as Files
import java.nio.file.Paths as Paths

WebUI.openBrowser('https://demoqa.com/upload-download')

WebUI.maximizeWindow()

WebUI.scrollToElement(findTestObject('Download Upload/Download Upload_Button_Download'), 0)

WebUI.click(findTestObject('Download Upload/Download Upload_Button_Download'))

WebUI.delay(2)

String downloadPath = 'C:/Users/Nexmedis/Downloads/sampleFile.jpeg'

boolean isFileDownloaded = Files.exists(Paths.get(downloadPath))

if (isFileDownloaded) {
    WebUI.comment('File berhasil diunduh.')

    try {
        Files.deleteIfExists(Paths.get(downloadPath))

        WebUI.comment('File berhasil dihapus setelah verifikasi.')
    }
    catch (IOException e) {
        WebUI.comment('⚠️ Gagal menghapus file: ' + e.getMessage())
    } 
} else {
    WebUI.comment('File tidak ditemukan di folder Downloads.')

    assert false : 'File tidak ditemukan setelah proses download.'
}

WebUI.closeBrowser()

