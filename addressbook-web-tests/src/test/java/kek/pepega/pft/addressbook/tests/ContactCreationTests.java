package kek.pepega.pft.addressbook.tests;

import kek.pepega.pft.addressbook.model.ContactData;
import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {

    @Test
    public void testContactCreation() throws Exception {
        app.getContactHelper().goToCreateNewContactPage();
        app.getContactHelper().fillContactForm(new ContactData("PEPEGA", "Kekovna", "Mekov", "123", "321", "sber", "lodochnaya 12, квартира 82", "12455333", null, "test1"), true);
        app.getContactHelper().submitCreateContact();
        app.getNavigationHelper().goHomePage();
    }

}