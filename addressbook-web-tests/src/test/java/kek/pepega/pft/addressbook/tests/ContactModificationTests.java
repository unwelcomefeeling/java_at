package kek.pepega.pft.addressbook.tests;

import kek.pepega.pft.addressbook.model.ContactData;
import kek.pepega.pft.addressbook.model.GroupData;
import org.testng.annotations.Test;

public class ContactModificationTests extends TestBase{

    @Test
    public void testContactModificationTests () {
        app.getContactHelper().selectContact(0);
        app.getContactHelper().initEditContact(2);
        app.getContactHelper().fillContactForm(new ContactData("xxx", "Kekovna1", "zz", "1231", "3211", "sber1", "lodochnaya 12, квартира 821", "124553331", "лулул@yandex.ru1"));
        app.getContactHelper().submitEditContact();
        app.getNavigationHelper().goHomePage();
    }
}
