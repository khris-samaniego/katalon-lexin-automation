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

WebUI.navigateToUrl('https://lexinqa.lexinsolutions.com/')

WebUI.click(findTestObject('Object Repository/3_Search/input_Email_email'))

WebUI.setText(findTestObject('Object Repository/3_Search/input_Email_email'), 'khris.samaniego@nymbl.app')

WebUI.setEncryptedText(findTestObject('Object Repository/3_Search/input_Password_password'), 'yMshZXsK3F08rDLxQPhNRw==')

WebUI.click(findTestObject('Object Repository/3_Search/span_Sign in'))

WebUI.click(findTestObject('Object Repository/3_Search/button_Create_mantine-focus-auto _collapsed_a58da2'))

WebUI.setText(findTestObject('Object Repository/3_Search/input_KS_mantine-byhko93g0'), 'water')

WebUI.verifyElementPresent(findTestObject('Object Repository/3_Search/div_Water'), 0)

