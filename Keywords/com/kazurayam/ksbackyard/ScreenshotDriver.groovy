package com.kazurayam.ksbackyard

import java.awt.image.BufferedImage
import java.nio.file.Files
import java.nio.file.Path

import javax.imageio.ImageIO

import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.annotation.Keyword

import ru.yandex.qatools.ashot.AShot
import ru.yandex.qatools.ashot.Screenshot
import ru.yandex.qatools.ashot.coordinates.WebDriverCoordsProvider

public class ScreenshotDriver {

	@Keyword
	static BufferedImage takeElementImage(WebDriver webDriver, WebElement webElement) {
		Screenshot screenshot = new AShot().
				coordsProvider(new WebDriverCoordsProvider()).
				takeScreenshot(webDriver, webElement)
		return screenshot.getImage()
	}

	@Keyword
	static void saveElementImage(WebDriver webDriver, WebElement webElement, Path output) {
		if (!Files.exists(output.getParent())) {
			Files.createDirectories(output.getParent())
		}
		BufferedImage image = takeElementImage(webDriver, webElement)
		ImageIO.write(image, "PNG", output.toFile())
	}
}
