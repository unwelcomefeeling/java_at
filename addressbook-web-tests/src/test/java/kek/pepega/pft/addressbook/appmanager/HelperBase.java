package kek.pepega.pft.addressbook.appmanager;

import org.openqa.selenium.*;

public class HelperBase {
    protected WebDriver wd;
    public HelperBase(WebDriver wd) {
        this.wd = wd;
    }

    protected void click(By locator) {
        wd.findElement(locator).click();
    }

    protected void type(By locator, String text) {
        click(locator);
        if (text != null) {
            String existingText = wd.findElement(locator).getAttribute("value");
            if (! text.equals(existingText)) {
                wd.findElement(locator).clear();
                wd.findElement(locator).sendKeys(text);
            }
        }
    }
    public boolean isAlertPresent() {
        try {
            wd.switchTo().alert().accept();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    public boolean isElementPresent(By locator) {
     try {
         wd.findElement(locator);
         return true;
     }  catch (NoSuchElementException ex) {
         return false;
     }
    }
}
