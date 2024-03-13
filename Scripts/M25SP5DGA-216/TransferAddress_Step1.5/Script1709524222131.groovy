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

'Verify User Navigated to information confirmation guidelines screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-216/27_VerifyText - Before you continue, please ensure you have the following information'), 
    'Before you continue, please ensure you have the following information:')

'Take screenshoot'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6357508002367164689.png')
Mobile.takeScreenshot()

'User tap on back on back button'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-216/28_TapOnBackButton'), 0)

'Verify user is on Step 1 of 4'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-216/01_VerifyText - Step 1 of 4'), 'Step 1 of 4')

'Take screenshot once user navigates to Step 1 of 4'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3427090599859691217.png')
Mobile.takeScreenshot()

'User tap on continue'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-216/26_UserTapOnContinue'), 0)

'Verify Text for the Information header'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-216/27_VerifyText - Before you continue, please ensure you have the following information'), 
    'Before you continue, please ensure you have the following information:')

'Take screenshot'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6357508002367164689.png')
Mobile.takeScreenshot()

'Verify First category text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-216/29_VerifyText - Recipients bank details'), 'Recipient\'s bank details:')

'Verify 1st Point'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-216/30_VerifyText -    Bank name, bank code and address'), 
    '●   Bank name, bank code and address')

'Verify 2nd Point'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-216/31_VerifyTextandroid.widget.TextView -    Account number'), 
    '●   Account number')

'Verify second category text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-216/32_VerifyTextandroid.widget.TextView - Recipients details'), 
    'Recipient\'s details:')

'Verify 3rd Point'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-216/33_VerifyTextandroid.widget.TextView -    ICPassport number'), 
    '●   IC/Passport number')

'Verify 4th Point'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-216/34_VerifyTextandroid.widget.TextView -    Nationality and address'), 
    '●   Nationality and address')

'Verify 5th Point'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-216/35_VerifyTextandroid.widget.TextView -    Full name'), 
    '●   Full name')

'Verify 6th Point'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-216/36_VerifyTextandroid.widget.TextView -    Phone number'), 
    '●   Phone number')

'Take screenshot'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot5883044417121404609.png')
Mobile.takeScreenshot()
'Tap on Continue'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-216/37_TapOnContinue'), 0)

