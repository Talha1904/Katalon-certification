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

WebUI.callTestCase(findTestCase('9.2. click users tab'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/9.5. deactivate the user added/Page_Admin Panel/Page_Admin Panel/svg_automationtechwards.co_MuiSvgIcon-root _7791bf_1'), 
    0)

WebUI.click(findTestObject('Object Repository/9.5. deactivate the user added/Page_Admin Panel/Page_Admin Panel/svg_automationtechwards.co_MuiSvgIcon-root _7791bf_1'))

WebUI.verifyElementText(findTestObject('Object Repository/9.5. deactivate the user added/Page_Admin Panel/Page_Admin Panel/li_Deactivate'), 
    'Deactivate')

WebUI.click(findTestObject('Object Repository/9.5. deactivate the user added/Page_Admin Panel/Page_Admin Panel/li_Deactivate'))

WebUI.verifyElementText(findTestObject('Object Repository/9.5. deactivate the user added/Page_Admin Panel/Page_Admin Panel/p_Are you sure you want to deactivate this user'), 
    'Are you sure you want to deactivate this user?')

WebUI.click(findTestObject('Object Repository/9.5. deactivate the user added/Page_Admin Panel/Page_Admin Panel/button_Deactivate_1'))

WebUI.verifyElementText(findTestObject('Object Repository/9.5. deactivate the user added/Page_Admin Panel/Page_Admin Panel/div_User is deactivated successfully'), 
    'User is deactivated successfully')

WebUI.verifyElementPresent(findTestObject('Object Repository/9.5. deactivate the user added/Page_Admin Panel/Page_Admin Panel/span_Inactive'), 
    3)

