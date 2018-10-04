
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import org.openqa.selenium.WebDriver

import org.openqa.selenium.WebElement

import java.nio.file.Path


def static "com.kazurayam.ksbackyard.ScreenshotDriver.takeElementImage"(
    	WebDriver webDriver	
     , 	WebElement webElement	) {
    (new com.kazurayam.ksbackyard.ScreenshotDriver()).takeElementImage(
        	webDriver
         , 	webElement)
}

def static "com.kazurayam.ksbackyard.ScreenshotDriver.saveElementImage"(
    	WebDriver webDriver	
     , 	WebElement webElement	
     , 	Path output	) {
    (new com.kazurayam.ksbackyard.ScreenshotDriver()).saveElementImage(
        	webDriver
         , 	webElement
         , 	output)
}
