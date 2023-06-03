package kek.pepega.pft.addressbook.tests;

import org.testng.annotations.Test;

public class ContactDeletion extends TestBase {

    @Test
    public void testContactDeletionTests () {
        app.getContactHelper().isAlertPresent();
        app.getContactHelper().selectContact(7);
        app.getContactHelper().deleteContact();
        app.getContactHelper().isAlertPresent();
        app.getNavigationHelper().goHomePage();
    }
}

//driver.get("http://localhost/addressbook/");
//        driver.findElement(By.linkText("home")).click();
//        acceptNextAlert = true;
//
//        driver.findElement(By.id("9")).click();
//        driver.findElement(By.xpath("//input[@value='Delete']")).click();
//        assertTrue(closeAlertAndGetItsText().matches("^Delete 1 addresses[\\s\\S]$"));
//        driver.findElement(By.linkText("home")).click();
//
//        wd.switchTo().alert().accept();

