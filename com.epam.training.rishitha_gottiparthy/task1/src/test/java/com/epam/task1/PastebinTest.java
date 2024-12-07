package com.epam.task1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriverException;

public class PastebinTest {

    private WebDriver driver;
    private PastebinPage pastebinPage;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://pastebin.com/");
        pastebinPage = new PastebinPage(driver);
    }

    @Test
    public void createNewPaste() {
        try {
            pastebinPage.enterPasteTitle("helloweb");
            pastebinPage.enterCode("Hello from WebDriver");
            pastebinPage.selectPasteExpiration();
            pastebinPage.submitPaste();
        } catch (WebDriverException e) {

        }
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}



