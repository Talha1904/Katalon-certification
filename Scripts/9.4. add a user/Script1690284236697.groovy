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

WebUI.callTestCase(findTestCase('9.3. click add users button'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/9.4. add a user/Page_Admin Panel/input_Full Name_name'), 'test automation user')

WebUI.setText(findTestObject('Object Repository/9.4. add a user/Page_Admin Panel/input_Email_email'), 'automation')

WebUI.verifyElementPresent(findTestObject('Object Repository/9.4. add a user/Page_Admin Panel/button_Create'), 0)

WebUI.takeScreenshotAsCheckpoint('create button present')

WebUI.click(findTestObject('Object Repository/9.4. add a user/Page_Admin Panel/button_Create'))

WebUI.verifyElementText(findTestObject('Object Repository/9.4. add a user/Page_Admin Panel/div_User created successfully. An email wit_abb45d'), 
    'User created successfully. An email with password link has been sent to user\'s email')

WebUI.takeScreenshotAsCheckpoint('new user creation success')

new_user_name = 'test automation user'

new_user_verification = WebUI.verifyElementText(findTestObject('Object Repository/9.4. add a user/Page_Admin Panel/p_test automation user'), 
    'test automation user')

not_run: if (new_user_verification == new_user_name) {
    println('New User added in the list')

    WebUI.takeScreenshotAsCheckpoint('new user added')
} 

not_run: WebUI.closeBrowser()

