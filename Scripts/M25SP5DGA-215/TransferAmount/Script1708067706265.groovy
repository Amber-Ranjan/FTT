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

'Tap on Amount Field'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-215/01_TapOnAmountField - 0.00'), 0)

'Take screenshot when the keyboard appears'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot622798863046857208.png')

Mobile.takeScreenshot()

'Tap on Ckeck without entering any amount'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-215/02_TapOnCheck'), 0)

'Take screenshot without entreing any amount'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot622798863046857208.png')

Mobile.takeScreenshot()

'Tap on Amount field'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-215/01_TapOnAmountField - 0.00'), 0)

'Take screenshot'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot622798863046857208.png')

Mobile.takeScreenshot()

'Tap on 5'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-215/03_TapOn - 5'), 0)

'User enters 0 five times'
for (int i = 0; i < 5; i++) {
    //Tap on Number 5 times
    Mobile.tap(findTestObject('Object Repository/M25SP5DGA-215/04_TapOn - 0'), 0)
}

'Take screenshot after entring RM 5000.00'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot622798863046857208.png')

Mobile.takeScreenshot()

'Tap on Check'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-215/02_TapOnCheck'), 0)

'Take screenshot'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot622798863046857208.png')

Mobile.takeScreenshot()

'Tap on Continue'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-215/05_TapOnContinue'), 0)

'Verify once user gets redirected to FTT calculation screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-215/06_VerifyText - Transfer Overseas'), 'Transfer Overseas')

'Take screenshot once user gets redirected to FTT calculation screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot622798863046857208.png')

Mobile.takeScreenshot()

'Tap on back button'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-215/07_TapOnBackIcon'), 0)

'Take screenshot once user navigated back to amount entry screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot622798863046857208.png')

Mobile.takeScreenshot()

'Tap on Continue again'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-215/05_TapOnContinue'), 0)

'Verify once user gets redirected to FTT calculation screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-215/06_VerifyText - Transfer Overseas'), 'Transfer Overseas')

'Take screenshot once user gets redirected to FTT calculation screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot622798863046857208.png')

Mobile.takeScreenshot()

'VerifyText FTT'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-215/08_VerifyText - Foreign Telegraphic Transfer'), 
    'Foreign Telegraphic Transfer')

'Verify Indicative Exchange Rate'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-215/09_VerifyText- Indicative exchange rate'), 'Indicative exchange rate')

'Verify daily transfer limit'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-215/10_VerifyText - Daily transfer limit'), 'Daily transfer limit')

'Verify Service Fee'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-215/11_VerifyText- Service fee'), 'Service fee')

'Verify Service fee'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-215/18_VerfifyText - RM 10.00'), 'RM 10.00')

'Verify Agent/Beneficiary Bank fee'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-215/12_VerifyText - AgentBeneficiaryBank fee'), 'Agent/Beneficiary\nBank fee')

'Verify text for Agent/Beneficiary fee'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-215/15_VerifyText - Applicable'), 'Applicable')

'Verify receive method'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-215/13_VerifyText - Receive method'), 'Receive method')

'Verify Receive method value'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-215/16_VerfifyText - Credit to account'), 'Credit to account')

'Verify teansfer duration text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-215/14_VerifyText - Transfer duration'), 'Transfer duration')

'Verify teansfer duration value'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-215/17_VerfifyText - 1 - 3 working days'), '1 - 3 working days')

'Tap on "i" icon for Daily transfer limit'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-215/19_TapOn_i_DailyTransferLimit'), 0)

'Verify header of the pop-up'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-215/20_VerifyText - Daily transfer limit'), 'Daily transfer limit')

'Take screenshot of the pop-up'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot622798863046857208.png')

Mobile.takeScreenshot()

'Verify body of the pop-up'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-215/21_VerifyText - Cumulative limit per day for all Maybank Overseas transfer and Foreign Telegraphic transactions'), 
    'Cumulative limit per day for all Maybank Overseas transfer and Foreign Telegraphic transactions.')

'Tap on close icon'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-215/22_TapOnClose'), 0)

'Take screenshot once the pop-up is closed'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot622798863046857208.png')

Mobile.takeScreenshot()

'Tap on "i" icon for Agent/Beneficiary '
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-215/23_TapOn_i_AgentBenificiary'), 0)

'Verify header text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-215/24_VerifyText - AgentBeneficiary Bank Fee'), 'Agent/Beneficiary Bank Fee')

'Take screenshot of the pop-up'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot622798863046857208.png')

Mobile.takeScreenshot()

'Tap on Close icon'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-215/26_TapOnClose'), 0)

'Take screenshot for the pop-up'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot622798863046857208.png')

Mobile.takeScreenshot()

'Tap on "i" for transfer duration'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-215/27_TapOn_i_TransferDuration'), 0)

'Verify header text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-215/28_VerifyText- Transfer duration'), 'Transfer duration')

'take screenshot for the pop-up'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot622798863046857208.png')

Mobile.takeScreenshot()

'Verify body text'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-215/29_VerifyText- The transfer duration in number of working days'), 
    'The transfer duration in number of working days.')

'Tap on CLose icon'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-215/30_TapOnClose'), 0)

'Take screenshot once the pop-up is closed'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot622798863046857208.png')

Mobile.takeScreenshot()

'Select the Radio button for FTT'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-215/31_SelectRadioButton'), 0)

'Take screenshot once the radio button is selected'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2765209938366148524.png')

Mobile.takeScreenshot()

'Tap on Transfer button'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-215/32_TapOnTransferButton'), 0)

