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
	
'Verify user navigated to debiting account list screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-212/17_VerifyText - Select debiting account'), 'Select debiting account')

'Take screenshot after selecting debiting account'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3157720038614659842.png')
Mobile.takeScreenshot()

'Verify Text for GAA (USA)'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-212/18_VerifyUSDText - Global Access Account-i (USD)'),
	'Global Access Account-i (USD)')

'Tap on GAA (USD)'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-212/23_TapOnUSD - Global Access Account-i (USD)'), 0)

'Take screenshot after selecting GAA USD '
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot680161985477977004.png')
Mobile.takeScreenshot()

'Tap on continue'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-212/19_TapOnContinue'), 0)

'User navigated to Transfer Overseas screen to enter amount'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-212/20_VerifyText - Transfer Overseas'), 'Transfer Overseas')

'Convert to section does not exist as the conversion is not from MYR'
Mobile.verifyElementNotExist(findTestObject('Object Repository/M25SP5DGA-212/24_VerifyElementNotExist - Convert to'), 0)

'Take screenshot for the Transfer overseas screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7719960980461306686.png')
Mobile.takeScreenshot()

'Tap on Back icon'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-212/21_TapOnBackIcon'), 0)

'User navigated back to Account section list'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-212/17_VerifyText - Select debiting account'), 'Select debiting account')

'Tap on GAA tile having MYR'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-212/25_TapOnGAAMYR - Global Access Account-i (MYR)'), 0)

'Take screenshot for the Account list screen after selecting GAA having MYR as base currency'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6402260911110514169.png')

Mobile.takeScreenshot()

'Tap on Continue'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-212/19_TapOnContinue'), 0)

'User navigated to transfer overseas screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-212/20_VerifyText - Transfer Overseas'), 'Transfer Overseas')

'Take screenshoot once user navigates to transfer overseas screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7719960980461306686.png')
Mobile.takeScreenshot()

Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-212/26_VerifyText- Convert to'), 'Convert to')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-212/27_TapOnDropdown'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3322461459085185750.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-212/28_Tap - Cancel'), 0)

'User navigated to transfer overseas screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-212/20_VerifyText - Transfer Overseas'), 'Transfer Overseas')

'Take screenshoot once user navigates to transfer overseas screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7719960980461306686.png')
Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-212/27_TapOnDropdown'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3322461459085185750.png')

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-212/29_TapOnDone'), 0)

'Tap on Back icon'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-212/21_TapOnBackIcon'), 0)

'Verify user navigated to debiting account list screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-212/17_VerifyText - Select debiting account'), 'Select debiting account')

'Take screenshot after selecting debiting account'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3157720038614659842.png')
Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-212/30_TapOnSGDTile - Global Access Account-i (SGD)'), 0)

'Tap on Continue'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-212/19_TapOnContinue'), 0)

'User navigated to transfer overseas screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-212/20_VerifyText - Transfer Overseas'), 'Transfer Overseas')

'Take screenshoot once user navigates to transfer overseas screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7719960980461306686.png')
Mobile.takeScreenshot()

'Convert to section does not exist as the conversion is not from MYR'
Mobile.verifyElementNotExist(findTestObject('Object Repository/M25SP5DGA-212/24_VerifyElementNotExist - Convert to'), 0)
