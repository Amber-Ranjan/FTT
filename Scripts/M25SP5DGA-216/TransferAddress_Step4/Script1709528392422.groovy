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

'User is navigated to Step 4'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-216/83_VerifyText - Step 4 of 4'), 'Step 4 of 4')

'Tap on back button'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-216/84_TapOnBackButton'), 0)

'User navigated to Step 3'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-216/61_VerifyText - Step 3 of 4'), 'Step 3 of 4')

'Take screenshot once user navigated back to the step 3'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2355016104618219580.png')
Mobile.takeScreenshot()

'User taps on continue'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-216/82_UserTapOnContinue'), 0)

'User is on Step 4'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-216/83_VerifyText - Step 4 of 4'), 'Step 4 of 4')

'Take screenshot when the user is on Step 4'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2355016104618219580.png')
Mobile.takeScreenshot()

'Verify text stating purpose of transfer'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-216/85_VerifyText - Purpose of transfer'), 'Purpose of transfer')

'Tap on the purpose dropdown'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-216/86_TapOnDeopdown - Please select'), 0)

'Take screenshot when the dropdown is available'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot4960090324755228182.png')
Mobile.takeScreenshot()

'Tap on Done'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-216/87_TapOnDone'), 0)

'Take screenshot after selecting purpose'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot1798045633195034445.png')

'Verify sub text for sub purpose'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-216/88_VerifyText- Sub purpose'), 'Sub purpose')

'Tap on the sub purpose dropdown'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-216/89_TapOnDropdown - Please select'), 0)

'Take screenshot for the sub purpose dropdown'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot5416240733938162005.png')
Mobile.takeScreenshot()

'Tap on done'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-216/90_TapOnDone'), 0)

'Take screenshot after selecting sub purpose'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6627216564441417317.png')
Mobile.takeScreenshot()

'Verify text for the fee'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-216/91_VerifyText - AgentBeneficiary bank fee'), 'Agent/Beneficiary bank fee')

'Tap on the "i" icon'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-216/92_TapOn_i_Icon'), 0)

'Verify text in the pop-up'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-216/93_VerifyText - AgentBeneficiary bank fee'), 'Agent/Beneficiary bank fee')

'Take screenshot for the pop-up'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3255257898962129211.png')
Mobile.takeScreenshot()

'Tap on the close icon'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-216/94_TapOnClose'), 0)
Mobile.takeScreenshot()

'Tap on the i will pay radio button'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-216/95_TapOn - I will pay(Recipient will receive the fulltransferred amount)'), 
    0)

'Take screenshot after selecting the radio button'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot5162857982667353638.png')
Mobile.takeScreenshot()

'Verify text stating pay fee from'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-216/96_VerifyText - Pay fees from'), 'Pay fees from')

'Tap on i icon'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-216/97_TapOn_i_Icon'), 0)

'Verify text in the pop up'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-216/98_VerifyText - Pay fees from'), 'Pay fees from')

'Verify the body text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-216/99_VerifyText - You can select a different local account to pay for the Service Fee and AgentBeneficiary Bank Fee (if any)'), 
    'You can select a different local account to pay for the Service Fee and Agent/Beneficiary Bank Fee (if any).')

'Take screenshot of the pop-up'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot5062897417081515498.png')
Mobile.takeScreenshot()

'Tap on the close Icon'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-216/100_TapOnCloseIcon'), 0)
Mobile.takeScreenshot()

'Tap on the Account dropdown'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-216/101_TapOnDropdown- Global Access Account-i'), 0)

'User navigated to the account selection screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-216/102_VerifyText - Select Account'), 'Select Account')

'Take screenshot of the account list screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot4278780341034376185.png')
Mobile.takeScreenshot()

'User tap on back button'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-216/103_TapOnBack'), 0)

'Verify text header for the additional details'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-216/104_VerifyText- Additional details (Optional)'), 
    'Additional details (Optional)')

'Set email id'
Mobile.setText(findTestObject('Object Repository/M25SP5DGA-216/105_SetEmail - Enter detail'), 'test@test.com', 0)

'Take screenshot before proceeding to the next screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8897310996035626067.png')
Mobile.takeScreenshot()

'Swipe Up'
Mobile.swipe(0, 400, 0, 0)

'Tap on the continue button'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-216/106_TapOn - Continue'), 0)

