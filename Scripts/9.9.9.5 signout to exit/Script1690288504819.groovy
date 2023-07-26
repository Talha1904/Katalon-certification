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

not_run: WebUI.callTestCase(findTestCase('login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/9.9.9.5 signout to exit/Page_Admin Panel/button_Muhammad Talha Khan'), 
    0)

WebUI.click(findTestObject('Object Repository/9.9.9.5 signout to exit/Page_Admin Panel/button_Muhammad Talha Khan'))

WebUI.verifyElementText(findTestObject('Object Repository/9.9.9.5 signout to exit/Page_Admin Panel/li_Sign out'), 'Sign out')

WebUI.click(findTestObject('Object Repository/9.9.9.5 signout to exit/Page_Admin Panel/li_Sign out'))

WebUI.verifyElementText(findTestObject('Object Repository/9.9.9.5 signout to exit/Page_Admin Panel/div_User logout successfully'), 
    'User logout successfully')

WebUI.takeFullPageScreenshotAsCheckpoint('signout successful')

WebUI.closeBrowser()

