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

'Launch Application'
Mobile.startExistingApplication('com.maybank2u.life.uat')

'Verify user is on Step 1 of 4'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-216/01_VerifyText - Step 1 of 4'), 'Step 1 of 4')

'Take screenshot once user navigates to Step 1 of 4'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3427090599859691217.png')

'Verify text stating Foreign Telegraphic Transfer'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-216/02_VerifyText - Foreign Telegraphic Transfer'), 
    'Foreign Telegraphic Transfer')

'Verify text requesting to fill the details'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-216/03_VerifyText - Please fill in your details'), 
    'Please fill in your details')

'Verify Text for the Nationality'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-216/04_VerifyText - Nationality'), 'Nationality')

'Tap on Malysian radio button'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-216/05_TapOnRadioButton - Malaysian'), 0)

'VerifyText for the Address Line 1'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-216/06_VerifyText - Address line 1'), 'Address line 1')

'Clear Address Line 1 Text'
Mobile.clearText(findTestObject('Object Repository/M25SP5DGA-216/07_ClearText - LOT 12, JALAN RAUDATUL, TAMAN PERSIARAN'), 
    0)

'Take screenshot once Address Line 1 is cleared'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2744849528130497942.png')

'Set Text for 50 characters'
Mobile.setText(findTestObject('Object Repository/M25SP5DGA-216/08_SetTextFor50char - e.g. Unit noFloorBuilding'), '11111111112222222222333333333344444444445555555555', 
    0)

'Read the count of text which got entered in the Text field'
def add1 = Mobile.getText(findTestObject('Object Repository/M25SP5DGA-216/09_GetText - 1111111111222222222233333333334444444444'), 
    0)

'Count the length of Text'
add1len = add1.length()

'The length of Text is 40 as maximum'
if (add1len > 41) {
    Mobile.comment('The character count is 40')
}

'The character count is reduced to Zero'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-216/10_VerifyText - 0'), '0')

'Clear text for the Address Line 1'
Mobile.clearText(findTestObject('Object Repository/M25SP5DGA-216/07_ClearText - LOT 12, JALAN RAUDATUL, TAMAN PERSIARAN'), 
    0)

'Set text starting as special characters'
Mobile.setText(findTestObject('Object Repository/M25SP5DGA-216/11_InputOnlySpecialCharacters - e.g. Unit noFloorBuilding'), 
    '!@#$%^&*()', 0)

'Validate the error message which is received due to special characters'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-216/12_VerifyErrorText - Please remove invalid special characters'), 
    'Please remove invalid special characters')

'Clear special characters text from Address Line 1'
Mobile.clearText(findTestObject('Object Repository/M25SP5DGA-216/07_ClearText - LOT 12, JALAN RAUDATUL, TAMAN PERSIARAN'), 
    0)

'Set Text as Address Line 1/2'
Mobile.setText(findTestObject('Object Repository/M25SP5DGA-216/13_SetTextAddLine1 - e.g. Unit noFloorBuilding'), 'Address Line 1/2', 
    0)

'Clear Text for Address Line 2'
Mobile.clearText(findTestObject('Object Repository/M25SP5DGA-216/14_ClearAdd2Text - AYER PUTEH'), 0)

Mobile.setText(findTestObject('Object Repository/M25SP5DGA-216/15_SetText - e.g. Street name'), '1111111111222222222233333333334444444444', 
    0)

def add2 = Mobile.getText(findTestObject('Object Repository/M25SP5DGA-216/16_GetTextAdd2 - 11111111112222222222333333333344444'), 
    0)

add2len = add2.length()

if (add2len > 36) {
    Mobile.comment('The character count is 35')
}

Mobile.clearText(findTestObject('Object Repository/M25SP5DGA-216/14_ClearAdd2Text - AYER PUTEH'), 0)

Mobile.setText(findTestObject('Object Repository/M25SP5DGA-216/17_SetTextAdd2 - e.g. Street name'), 'Address Line 2/2', 
    0)

