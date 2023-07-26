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

not_run: WebUI.callTestCase(findTestCase('9.9.6. click audit trail tab'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/9.9.9.2 click export audit trail button/Page_Admin Panel/button_Export'), 
    0)

WebUI.click(findTestObject('Object Repository/9.9.9.2 click export audit trail button/Page_Admin Panel/button_Export'))

WebUI.verifyElementPresent(findTestObject('Object Repository/9.9.9.2 click export audit trail button/Page_Admin Panel/label_All Columns'), 
    0)

WebUI.click(findTestObject('Object Repository/9.9.9.2 click export audit trail button/Page_Admin Panel/button_Export_1'))

WebUI.verifyElementText(findTestObject('Object Repository/9.9.9.2 click export audit trail button/Page_Admin Panel/div_Activity logs has been sent to your reg_1a23e2'), 
    'Activity logs has been sent to your registered email address')

WebUI.takeScreenshotAsCheckpoint('audit trail export')

WebUI.closeBrowser()

