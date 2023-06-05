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


