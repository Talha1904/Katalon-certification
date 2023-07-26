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

WebUI.navigateToUrl('https://seedadmin.stage.techwards.org/')

WebUI.setText(findTestObject('Object Repository/6. open language dropdown/Page_Admin Panel/input_Email_email'), 'muhammad.talha@techwards.co')

WebUI.setEncryptedText(findTestObject('Object Repository/6. open language dropdown/Page_Admin Panel/input_Password_password'), 
    'Dpxl7+fjsHaPnN5Bh9tNqA==')

WebUI.click(findTestObject('Object Repository/6. open language dropdown/Page_Admin Panel/button_Sign in'))

WebUI.verifyElementText(findTestObject('Object Repository/6. open language dropdown/Page_Admin Panel/button_English'), 'English')

WebUI.click(findTestObject('Object Repository/6. open language dropdown/Page_Admin Panel/button_English'))

WebUI.takeScreenshotAsCheckpoint('Language dropdown')

WebUI.closeBrowser()

