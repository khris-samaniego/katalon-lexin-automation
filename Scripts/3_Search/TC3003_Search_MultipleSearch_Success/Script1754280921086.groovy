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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://lexinqa.lexinsolutions.com/')

WebUI.setText(findTestObject('Object Repository/1_Security and Login/Login_Input_Email'), 'demo+1@nymbl.app')

WebUI.setEncryptedText(findTestObject('Object Repository/1_Security and Login/Login_Input_Password'), 'JlrLFiaChPTP/Psp+sMNCg==')

WebUI.sendKeys(findTestObject('Object Repository/1_Security and Login/Login_Input_Password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/2_Navigation/Nav_Button_Search'))

WebUI.click(findTestObject('3_Search/Search_Button_SearchFromInput'))

WebUI.click(findTestObject('3_Search/Search_Button_NewButtonFromInput'))

WebUI.click(findTestObject('3_Search/Search_DropdownInput_Field'))

WebUI.click(findTestObject('3_Search/Search_Dropdown_Field_MaterialNumber'))

WebUI.click(findTestObject('Object Repository/3_Search/Search_DropdownInput_Operator'))

//WebUI.click(findTestObject('3_Search/Search_Dropdown_Operator_IsEqualTo'))
//WebUI.click(findTestObject('Object Repository/3_Search/div_contains'))
WebUI.click(findTestObject('3_Search/span_contains'))

WebUI.setText(findTestObject('Object Repository/3_Search/input_Value_mantine-nt2s8vypn'), 'T')

WebUI.click(findTestObject('3_Search/Search_Dropdown_Button_AddFilter'))

WebUI.click(findTestObject('Object Repository/3_Search/button_New'))

WebUI.click(findTestObject('Object Repository/3_Search/input_Field_mantine-cs11nqey2'))

WebUI.click(findTestObject('Object Repository/3_Search/div_Description'))

WebUI.click(findTestObject('Object Repository/3_Search/input_Operator_mantine-ayrlcm2by'))

WebUI.click(findTestObject('Object Repository/3_Search/div_contains_1'))

WebUI.setText(findTestObject('Object Repository/3_Search/input_Value_mantine-g55gghpwx'), 'Designer')

WebUI.click(findTestObject('3_Search/Search_Dropdown_Button_AddFilter'))

WebUI.click(findTestObject('3_Search/Search_Dropdown_Button_Search'))

WebUI.waitForElementVisible(findTestObject('Object Repository/3_Search/div_HT-1068'), 10)

WebUI.verifyElementPresent(findTestObject('Object Repository/3_Search/div_HT-1068'), 0)

WebUI.closeBrowser()

