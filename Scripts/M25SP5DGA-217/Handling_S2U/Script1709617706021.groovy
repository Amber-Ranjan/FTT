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

//-----------------------------------------S2U Expire---------------------------------------------------------------------------
'Verify user is navigated to S2U Screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-217/06_VerifyText - Secure2u authorisation'), 'Secure2u authorisation')

'Verify the Statement mentioned in brackets'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-217/07_VerifyText - (Amount displayed excludes fees stated)'), 
    '(Amount displayed excludes fees stated)')

'Verify Transfer to'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-217/08_VerifyText- Transfer to'), 'Transfer to')

'Verify Transfer from'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-217/09_VerifyText - Transfer from'), 'Transfer from')

'Verify Transaction Type'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-217/10_VerifyText - Transaction type'), 'Transaction type')

'Verify Service Fee'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-217/11_VerifyText - Service fee'), 'Service fee')

'Verify Agent Fee text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-217/12_VerifyText AgentBeneficiary bank fee'), 'Agent/Beneficiary bank fee')

'Take screenshot'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8413824092435873751.png')
Mobile.takeScreenshot()

'Delay for 50 sec to ket Secure2U expire'
Mobile.delay(49)

'Verify Decision screen Text stating Transaction declined'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-217/13_VerifyDSText - Transaction declined'), 'Transaction declined')

'Verify the reason of the failure'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-217/14_VerifyDSRejectReason - Secure2u has expired. Please perform the transaction again'), 
    'Secure2u has expired. Please perform the transaction again.')

'Verify Refrence ID'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-217/15_VerifyText- Reference ID'), 'Reference ID')

'Verify Date and Time'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-217/16_VerifyText - Date  time'), 'Date & time')

'Take screenshot for the decision screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6751610619327032873.png')
Mobile.takeScreenshot()

'Tap On Done'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-217/17_TapOnDone'), 0)

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

'Complete all the steps again to reach Secure2U screen'
WebUI.callTestCase(findTestCase('M25SP5DGA-217/CallPreviousAction'), [:], FailureHandling.STOP_ON_FAILURE)

//-----------------------------------------------------------------Secure2U Reject----------------------------------------------------------------------------

'Verify user is navigated to S2U Screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-217/06_VerifyText - Secure2u authorisation'), 'Secure2u authorisation')

'Verify the Statement mentioned in brackets'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-217/07_VerifyText - (Amount displayed excludes fees stated)'), 
    '(Amount displayed excludes fees stated)')

'Verify Transfer to'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-217/08_VerifyText- Transfer to'), 'Transfer to')

'Verify Transfer from'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-217/09_VerifyText - Transfer from'), 'Transfer from')

'Verify Transaction Type'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-217/10_VerifyText - Transaction type'), 'Transaction type')

'Verify Service Fee'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-217/11_VerifyText - Service fee'), 'Service fee')

'Verify Agent Fee text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-217/12_VerifyText AgentBeneficiary bank fee'), 'Agent/Beneficiary bank fee')

'Take screenshot'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8413824092435873751.png')
Mobile.takeScreenshot()

'User Tp on Reject'


'Verify Decision screen Text stating Transaction declined'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-217/13_VerifyDSText - Transaction declined'), 'Transaction declined')

'Verify the reason of the failure'

'Verify Refrence ID'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-217/15_VerifyText- Reference ID'), 'Reference ID')

'Verify Date and Time'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-217/16_VerifyText - Date  time'), 'Date & time')

'Take screenshot for the decision screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6751610619327032873.png')
Mobile.takeScreenshot()

'Tap On Done'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-217/17_TapOnDone'), 0)

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

'Complete all the steps again to reach Secure2U screen'
WebUI.callTestCase(findTestCase('M25SP5DGA-217/CallPreviousAction'), [:], FailureHandling.STOP_ON_FAILURE)

//-----------------------------------------------------------------------------S2U Approve----------------------------------------------------------------------

'Verify user is navigated to S2U Screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-217/06_VerifyText - Secure2u authorisation'), 'Secure2u authorisation')

'Verify the Statement mentioned in brackets'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-217/07_VerifyText - (Amount displayed excludes fees stated)'),
	'(Amount displayed excludes fees stated)')

'Verify Transfer to'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-217/08_VerifyText- Transfer to'), 'Transfer to')

'Verify Transfer from'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-217/09_VerifyText - Transfer from'), 'Transfer from')

'Verify Transaction Type'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-217/10_VerifyText - Transaction type'), 'Transaction type')

'Verify Service Fee'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-217/11_VerifyText - Service fee'), 'Service fee')

'Verify Agent Fee text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-217/12_VerifyText AgentBeneficiary bank fee'), 'Agent/Beneficiary bank fee')

'Take screenshot'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8413824092435873751.png')
Mobile.takeScreenshot()

'User Tap on Approve'



'Verify Refrence ID'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-217/15_VerifyText- Reference ID'), 'Reference ID')

'Verify Date and Time'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-217/16_VerifyText - Date  time'), 'Date & time')

'Take screenshot for the decision screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6751610619327032873.png')
Mobile.takeScreenshot()

'Tap On Done'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-217/17_TapOnDone'), 0)

