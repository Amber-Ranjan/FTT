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


WebUI.callTestCase(findTestCase('M25SP5DGA-212/Transfer_Overseas'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('M25SP5DGA-214/Debiting_Account'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('M25SP5DGA-215/TransferAmount'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('M25SP5DGA-216/TransferAddress_Step1'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('M25SP5DGA-216/TransferAddress_Step1.5'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('M25SP5DGA-216/TransferAddress_Step2'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('M25SP5DGA-216/TransferAddress_Step3'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('M25SP5DGA-216/TransferAddress_Step4'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('M25SP5DGA-216/TransferConfirmation'), [:], FailureHandling.STOP_ON_FAILURE)

