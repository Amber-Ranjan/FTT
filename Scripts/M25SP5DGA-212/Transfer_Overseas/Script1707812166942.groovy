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

'Tap on Overseas'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-212/12_TapOn - Overseas'), 0)

'Verify once user navigated inside overseas to transfer'
Mobile.verifyElementText(findTestObject('Object Repository/M25SP5DGA-212/13_VerifyText - Transfer To'), 'Transfer To')

'Take screenshot'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6145525033473594086.png')

Mobile.takeScreenshot()

'Scroll to Text Brazil to check if scroll is working fine'
Mobile.scrollToText('Brazil')

'Tap on Search '
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-212/14_TapOnSearch'), 0)

'Take screenshot'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot526816405931251389.png')

Mobile.takeScreenshot()

'Set text as Singapore'
Mobile.setText(findTestObject('Object Repository/M25SP5DGA-212/15_Set_Singapore'), 'Singapore', 0)

'Take screenshot after smart search'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot309964273721808221.png')

Mobile.takeScreenshot()

'Hide Keyboard'
Mobile.hideKeyboard()

'Tap on Singapore'
Mobile.tap(findTestObject('Object Repository/M25SP5DGA-212/16_TapOnSingapore - Singapore'), 0)

Mobile.tap(findTestObject('Object Repository/M25SP5DGA-212/16_TapOnSingapore - Singapore'), 0)

