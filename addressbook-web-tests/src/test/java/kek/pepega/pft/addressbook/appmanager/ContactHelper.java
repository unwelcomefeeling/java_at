package kek.pepega.pft.addressbook.appmanager;

import kek.pepega.pft.addressbook.model.ContactDate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactHelper extends HelperBase {

    public ContactHelper(WebDriver wd) {
        super(wd);
    }

    public void fillContactForm(ContactDate contactData) {
        type(By.name("firstname"), contactData.firstname());
        type(By.name("middlename"),contactData.middlename());
        type(By.name("lastname"), contactData.lastname());
        type(By.name("nickname"),contactData.nickname());
        type(By.name("title"),contactData.title());
        type(By.name("company"),contactData.company());
        type(By.name("address"),contactData.address());
        type(By.name("mobile"),contactData.mobile());
        type(By.name("email"),contactData.email());
    }

    public void submitCreateContact() {
        click(By.xpath("//div[@id='content']/form/input[21]"));
    }
}
