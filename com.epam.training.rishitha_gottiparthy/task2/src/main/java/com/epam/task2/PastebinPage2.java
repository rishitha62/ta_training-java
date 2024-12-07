package com.epam.task2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PastebinPage2 {
    private WebDriver driver;

    @FindBy(id="postform-text")
    private WebElement codeTextArea;

    @FindBy(xpath="//*[@id='select2-postform-expiration-container']")
    private WebElement expirationDropdown;

    @FindBy(xpath = "//li[text()='10 Minutes']")
    private WebElement expirationTime;

    @FindBy(xpath="//*[@id=\"select2-postform-format-container\"]")
    private WebElement syntaxHighlightingDropdown;

    @FindBy(xpath="//li[text()='Bash']")
    private WebElement syntaxBash;

    @FindBy(id = "postform-name")
    private WebElement pasteNameField;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement createNewPasteButton;

    public PastebinPage2(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void enterCode(String code){
        codeTextArea.sendKeys(code);
    }

    public void setExpiration(){
        expirationDropdown.click();
        expirationTime.click();
    }

    public void setSyntaxHighlighting(){
        syntaxHighlightingDropdown.click();
        syntaxBash.click();
    }

    public void setPasteName(String pasteName){
        pasteNameField.sendKeys(pasteName);
    }

    public void createNewPaste(){
        createNewPasteButton.click();
    }
}
