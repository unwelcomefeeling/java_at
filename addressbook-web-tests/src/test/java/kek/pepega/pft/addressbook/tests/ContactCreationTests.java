package kek.pepega.pft.addressbook.tests;

import kek.pepega.pft.addressbook.model.ContactData;
import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {

    @Test
    public void testContactCreation() throws Exception {
        app.getNavigationHelper().goToCreateNewContactPage();
        app.getContactHelper().fillContactForm(new ContactData("PEPEGA", "Kekovna", "Mekov", "123", "321", "sber", "lodochnaya 12, квартира 82", "12455333", "лулул@yandex.ru"));
        app.getContactHelper().submitCreateContact();
        app.getNavigationHelper().goHomePage();
    }

}