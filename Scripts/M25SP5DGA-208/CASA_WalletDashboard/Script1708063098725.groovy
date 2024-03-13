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

'Verify User is on Dashboard'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-212/01VerifyText- Quick Actions'), 'Quick Actions')

'Take screenshot of the Dashboard'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8277480836277971301.png')

Mobile.takeScreenshot()

'Tap on Accounts'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-212/02_TapOnAccounts'), 0)

//---------------------------------------------------------------------------------------------------------
/*
//Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-212/31_ElementExist - 6-digit PIN'), 0)


def ele = Mobile.verifyElementExist(findTestObject('Object Repository/M25SP5DGA-212/31_ElementExist - 6-digit PIN'), 0)

if(ele==true) {
	Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-212/32_VerifyText - Enter your 6-digit PIN'), 'Enter your 6-digit PIN')
	
	'User enters the pin as 6 times 1'
	for (int i = 0; i < 6; i++) {
		//Tap on Number 6 times
		Mobile.tap(findTestObject('Object Repository/M25SP5DGA-212/33_TapOnNumber - 1'), 0)
	}	
}
else {
	'Verify screen once user navigated to Accounts'
	Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-212/03_VerifyText - ACCOUNTS'), 'ACCOUNTS')
	
	'Take screenshot of the accounts screen'
	Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3251118884942611166.png')
	
	Mobile.takeScreenshot()
}
*/

'Verify the Text for Global Access Account'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-212/04_VerifyText - Global Access Account-i'), 'Global Access Account-i')
'Take screenshot of the accounts screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3251118884942611166.png')

Mobile.takeScreenshot()
'Verify the Account number Visible'
Mobile.verifyElementVisible(findTestObject('Object Repository/M25SP5DGA-212/05_VerifyElementVisible - 9000 0002 1183'), 
    0)

//'Verify Amount visisble'
//Mobile.verifyElementVisible(findTestObject('Object Repository/M25SP5DGA-212/06_VerifyElementVisible - RM 54,995.17'), 0)

'User taps on GAA'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-212/07_TapOnGAA - Global Access Account-i'), 0)

Mobile.delay(3)

'Verify once user navigated inside GAA account'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-212/08_VerifyText - Accounts'), 'Accounts')

'Take screenshot for the account'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8406552335573930989.png')

Mobile.takeScreenshot()

'Swipe down'
Mobile.swipe(0, 300, 0, 0)

'Tap on Transfer'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-212/09_TapOn - Transfer'), 0)

'Tap on Overseas'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-212/10_TapOn - OVERSEAS'), 0)

'Verify New Transfer is present'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-212/11_VerifyText - New Transfer'), 'New Transfer')

'Take screenshot'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7090934772573225323.png')

Mobile.takeScreenshot()
