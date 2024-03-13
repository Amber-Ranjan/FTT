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

'Verify user is navigated to the confirmation screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-216/107_VerifyText - Confirmation'), 'Confirmation')

'Take screenshot for the confirmation screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot1372596325057419225.png')
Mobile.takeScreenshot()

'Tap on the Step 1 details edit button'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-216/108_TapOnStep1Edit - Edit'), 0)

'Verify user is on Step 1 of 4'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-216/01_VerifyText - Step 1 of 4'), 'Step 1 of 4')

'Take screenshot once user navigates to Step 1 of 4'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3427090599859691217.png')
Mobile.takeScreenshot()

'Tap on Continue Button'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-216/26_UserTapOnContinue'), 0)

'Verify user navigated back to Confirmation screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-216/107_VerifyText - Confirmation'), 'Confirmation')

'Take screenshot once user navigated to Confirmation screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot1372596325057419225.png')
Mobile.takeScreenshot()

'Tap on the Step 2 details edit button'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-216/109_TapOnBankDetails- Edit'), 0)

'Verify the pop-up '
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-216/38_VerifyText - 0 Important'), '0 Important')

'Take screenshot of the pop-up'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3981862865868730001.png')
Mobile.takeScreenshot()

'Tap on Continue Button'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-216/39_TapOnContinue'), 0)

'User navigated to Step 2 of 4'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-216/41_VerifyText - Step 2 of 4'), 'Step 2 of 4')

'Take screenshot once the user is on Step 2'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3981862865868730001.png')
Mobile.takeScreenshot()

'Tap on Continue Button'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-216/60_TapOnContinue'), 0)

'Verify user navigated back to Confirmation screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-216/107_VerifyText - Confirmation'), 'Confirmation')

'Take screenshot once user navigated to Confirmation screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot1372596325057419225.png')
Mobile.takeScreenshot()

'Tap on the Step 3 details edit button'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-216/110_TapOnReceipientDetail - Edit'), 0)

'User is navigated to Step 3 of 4'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-216/61_VerifyText - Step 3 of 4'), 'Step 3 of 4')

'Take screenshot once the user is navigated to step 3 of 4'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2355016104618219580.png')
Mobile.takeScreenshot()

'Scroll the screen below'
Mobile.scrollToText('Continue')

'Tap on Continue Button'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-216/82_UserTapOnContinue'), 0)

'Verify user navigated back to Confirmation screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-216/107_VerifyText - Confirmation'), 'Confirmation')

'Take screenshot once user navigated to Confirmation screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot1372596325057419225.png')
Mobile.takeScreenshot()

'Scroll the screen below'
Mobile.scrollToText('Confirm and Submit')

'Take the screenshot once the screen is scrolled below'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3172698865340088726.png')
Mobile.takeScreenshot()

'Tap on the Step 4 details edit button'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-216/111_TapOnTransferDetail - Edit'), 0)

'User is navigated to step 4 of 4'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-216/83_VerifyText - Step 4 of 4'), 'Step 4 of 4')

'Take screenshot once the user is navigated to step 4'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2355016104618219580.png')
Mobile.takeScreenshot()

'Swipe down the screen'
Mobile.swipe(0, 400, 0, 0)

'Tap on Continue Button'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-216/106_TapOn - Continue'), 0)

'Verify user navigated back to Confirmation screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-216/107_VerifyText - Confirmation'), 'Confirmation')

'Take screenshot once user navigated to Confirmation screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot1372596325057419225.png')
Mobile.takeScreenshot()

'Tap on Continue and Submit Button'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-216/110_TapOnConfirmAndSubmit'), 0)

'Verify terms and conditions screen'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-216/111_VerifyText - Terms  Conditions'), 'Terms & Conditions')

'Tap on Agree and Confirm'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-216/112_TapOnAgreeAndConfirm'), 0)

'Verify text stating Transfer From'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-216/113_VerifyText - Transfer from'), 'Transfer from')

'Verify text stating Date'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-216/114_Verify - Date'), 'Date')

'Verify text stating Transfer Type'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-216/115_VerifyText- Transfer type'), 'Transfer type')

'Verify text stating Transfer Type'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-216/116_VerifyTransferType - Foreign Telegraphic Transfer'), 
    'Foreign Telegraphic Transfer')

'Scroll the screen below'
Mobile.scrollToText('Pay Fee From')

'Take screenshot after scrollong the screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6130887752726205190.png')
Mobile.takeScreenshot()

'Verify text stating Transfer Duration'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-216/117_VerifyText - Transfer duration'), 'Transfer duration')

'Verify text stating Transfer Duration as 1-3 days'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-216/118_VerifyText - 1 - 3 working days'), '1 - 3 working days')

'Verify text stating Exchange Rate'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-216/119_Verify- Exchange rate'), 'Exchange rate')

'Verify text stating Fee Payment Details'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-216/120_VerifyText- Fee Payment Details'), 'Fee Payment Details')

'Verify text stating Service Fee'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-216/121_VerifyText - Service fee'), 'Service fee')

'Verify text stating Agenet/Beneficiary bank fee'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-216/122_VerifyText- AgentBeneficiary bank fee'), 'Agent/Beneficiary bank fee')

'Verify text stating Pay fee from'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-216/123_VerifyText - Pay Fee From'), 'Pay Fee From')

'Tap on Transfer Now button'
//Mobile.tap(findTestObject('Object Repository/M25SP5DGA-216/124_TapOnTransferNow'), 0)

