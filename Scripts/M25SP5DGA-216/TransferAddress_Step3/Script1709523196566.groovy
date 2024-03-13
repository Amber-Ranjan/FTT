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

'Verify user is on step 3'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-216/61_VerifyText - Step 3 of 4'), 'Step 3 of 4')

'Take screenshot once user navigated to step 3'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2355016104618219580.png')
Mobile.takeScreenshot()

'User tap on back button'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-216/62_TapOnBackButton'), 0)

'User navigated back to Step 2'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-216/41_VerifyText - Step 2 of 4'), 'Step 2 of 4')

'Take screenshot once user navigate dback to step 2'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2147251951258157016.png')
Mobile.takeScreenshot()

'Tap on Continue button'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-216/60_TapOnContinue'), 0)

'Verify user is on Step 3'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-216/61_VerifyText - Step 3 of 4'), 'Step 3 of 4')
Mobile.takeScreenshot()

'Verify text for the nationality module'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-216/63_VerifyText - Nationality'), 'Nationality')

'User selects Malaysia'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-216/64_TapOn - Malaysian'), 0)

'Verify Name text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-216/65_VerifyText - Name'), 'Name')
Mobile.takeScreenshot()

'Set Name '
Mobile.setText(findTestObject('M25SP5DGA-216/66_SetText - AmberTest'), 'Amber Test', 0)

'Verify IC Passport number header'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-216/67_VerifyText - IC  Passport number  Biz registration No'), 
    'IC / Passport number / Biz registration No.')

'Set Text for Passport'
Mobile.setText(findTestObject('Object Repository/M25SP5DGA-216/68_SetText - e.g. 910102 03 5678'), '910102035678', 0)
Mobile.takeScreenshot()

'Verify Address Line 1'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-216/69_VerifyText - Address line 1'), 'Address line 1')

'Set the Address Line 1'
Mobile.setText(findTestObject('Object Repository/M25SP5DGA-216/70_SetText- e.g. AddressLine1'), 'AddressLine1', 0)
Mobile.takeScreenshot()

'Verify Address Line 2 Text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-216/71_VerifyText - Address line 2'), 'Address line 2')

'Set Address Line 2'
Mobile.setText(findTestObject('Object Repository/M25SP5DGA-216/72_SetText- AddressLine2'), 'AddressLine2', 0)
Mobile.takeScreenshot()

'Verify country text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-216/73_VerifyText- Country'), 'Country')

'Tap on Country dropdown'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-216/74_TapOnDropdown - Please select'), 0)
Mobile.takeScreenshot()

'Tap on search field'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-216/75_TapOnSearch'), 0)

'Set the field as Singapore'
Mobile.setText(findTestObject('Object Repository/M25SP5DGA-216/76_SetText_Singapore'), 'Singapore', 0)

'Hide Keyboard'
Mobile.hideKeyboard()
Mobile.takeScreenshot()

'Tap on Singapore'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-216/77_TapOnSingapore'), 0)

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-216/77_TapOnSingapore'), 0)

'Verify Step 3'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-216/61_VerifyText - Step 3 of 4'), 'Step 3 of 4')

'Take screenshot once user is back to Step 3 screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2355016104618219580.png')
Mobile.takeScreenshot()

'Scroll the screen to the last'
Mobile.scrollToText('Continue')

Mobile.takeScreenshot()
'Verify Mobile Number header'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-216/78_VerifyText - Mobile number'), 'Mobile number')

'Set Mobile Number'
Mobile.setText(findTestObject('Object Repository/M25SP5DGA-216/79_SetMobileNumber - e.g. 6012 3456 789'), '1234567890', 
    0)
Mobile.takeScreenshot()

'Verify Email Address field'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-216/80_VerifyText - Email address (Optional)'), 'Email address (Optional)')

'Set email Address'
Mobile.setText(findTestObject('Object Repository/M25SP5DGA-216/81_SetEmail- e.g. danialgmail.com'), 'amber.ranjan@maybank.com', 
    0)

'Take screenshot for the Step 3'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2087998694799712666.png')
Mobile.takeScreenshot()
'Tap on Continue'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-216/82_UserTapOnContinue'), 0)

