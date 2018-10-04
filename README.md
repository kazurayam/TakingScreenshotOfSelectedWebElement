# Taking Screenshot of selected WebElement

## What is this?

This is a [Katalon Studio](https://www.katalon.com/katalon-studio/) project
for demonstration purpose. You can clone this out to you PC and run it with
your Katalon Studio.

This project was developed using Katalon Studio 5.7.1

This project proposes a solution to [a discussion posted at Katalon Forum](https://forum.katalon.com/discussion/5010/take-screenshot-only-in-the-selected-area).
The original question was:
>I want to screen only the parts of a website, which I can see on my desktop.
>The Katalon screenshot command will screenshot a big part of the website.
>It would be great if I could decide which parts of a website the screenshot should take.

[aShot](https://github.com/yandex-qatools/ashot), a
WebDriver Screenshot utility, provides an immediate solution to this.

This project shows you how to use aShot in a Katalon Studio project, and provides
a working example of taking a screenshot of a selected HTML element in a Web page.

## How to run the project

1. download the zip of this project at https://github.com/kazurayam/TakingScreenshotOfSelectedWebElement/releases
2. unzip it. you get the project folder
3. start Katalon Stuio, open the project
4. open `Test Cases/TC1` and run it with your favorites browser
5. the test script will open [Katalon Forum](https://forum.katalon.com/discussions) and
take screenshot of the banner
6. when the test script finished, you will find a PNG file `<projectDir>/tmp/forum-banner.png`

The screenshot would look like this:
![forum-banner](tmp/forum-banner.png)

## Codes

Please read the source codes and see what I did.

1. [Test Cases/TC1](Scripts/TC1/Script1538686539182.groovy)
2. [Keywords/com.kazurayam.ksbackyard.ScreenshotDriverMini](Keywords/com/kazurayam/ksbackyard/ScreenshotDriverMini.groovy)
