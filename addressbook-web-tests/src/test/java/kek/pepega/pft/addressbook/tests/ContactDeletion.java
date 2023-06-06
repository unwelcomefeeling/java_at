package kek.pepega.pft.addressbook.tests;

import kek.pepega.pft.addressbook.model.ContactData;
import kek.pepega.pft.addressbook.model.GroupData;
import org.testng.annotations.Test;

public class ContactDeletion extends TestBase {

    @Test
    public void testContactDeletionTests () {
        app.getContactHelper().isAlertPresent();

        if (! app.getContactHelper().isThereAContact()) {
            app.getContactHelper().createContact(new ContactData("xxx", "Kekovna1", "zz", "1231", "3211", "sber1", "lodochnaya 12, квартира 821", "124553331", "лулул@yandex.ru1", null), false);
        }
        app.getContactHelper().selectContact(7);
        app.getContactHelper().deleteContact();
        app.getContactHelper().isAlertPresent();
        app.getNavigationHelper().goHomePage();
    }
}


