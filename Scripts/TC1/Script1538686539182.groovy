import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.nio.file.Path
import java.nio.file.Paths

import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')
WebUI.setViewPortSize(1024, 768)
WebDriver driver = DriverFactory.getWebDriver()

WebUI.navigateToUrl('https://forum.katalon.com/discussions')

// selector to target element
TestObject testObject = findTestObject('KatalonForum/div_banner-forum')

// wait for the page to load
WebUI.verifyElementPresent(testObject, 10, FailureHandling.STOP_ON_FAILURE)

// grasp the target as WebElement
WebElement webElement = WebUiCommonHelper.findWebElement(testObject, 10)

// resolve output file path
Path projectDir = Paths.get(RunConfiguration.getProjectDir())
Path tmpDir = projectDir.resolve('tmp')
Path pngFile = tmpDir.resolve('forum-banner.png')

// take screenshot of selected WebElement and save it into file
CustomKeywords.'com.kazurayam.ksbackyard.ScreenshotDriverMini.saveElementImage'(
	driver, webElement , pngFile)

WebUI.closeBrowser()
