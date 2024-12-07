package com.epam.task2;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
public class PastebinPage2Test {
    private WebDriver driver;
    private PastebinPage2 pastebinPage2;

    @Before
    public void setup(){
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get("https://pastebin.com/");
        pastebinPage2=new PastebinPage2(driver);
    }

    @Test
    public void testCreatePaste(){
        String code="git config --global user.name  \"New Sheriff in Town\"\n" +
                "git reset $(git commit-tree HEAD^{tree} -m \"Legacy code\")\n" +
                "git push origin master --force\n";
        String pasteName="how to gain dominance among developers";

        pastebinPage2.enterCode(code);
        pastebinPage2.setSyntaxHighlighting();
        pastebinPage2.setExpiration();
        pastebinPage2.setPasteName(pasteName);
        pastebinPage2.createNewPaste();
    }

    @After
    public void tearDown(){
        if(driver!=null)
            driver.quit();
    }
}
