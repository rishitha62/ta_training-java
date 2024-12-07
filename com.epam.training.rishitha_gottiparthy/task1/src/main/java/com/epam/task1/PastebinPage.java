package com.epam.task1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PastebinPage {

    private WebDriver driver;
    public PastebinPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterPasteTitle(String title) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        WebElement pasteTitleField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("postform-name")));
        pasteTitleField.sendKeys(title);
    }

    public void enterCode(String code) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        WebElement codeArea = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("postform-text")));
        codeArea.sendKeys(code);
    }

    public void selectPasteExpiration() {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        WebElement expirationDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='select2-postform-expiration-container']")));
        expirationDropdown.click();
        WebElement tenMinutesOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[text()='10 Minutes']")));
        tenMinutesOption.click();
    }

    public void submitPaste() {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='btn -big']")));
        submitButton.click();
    }
}
