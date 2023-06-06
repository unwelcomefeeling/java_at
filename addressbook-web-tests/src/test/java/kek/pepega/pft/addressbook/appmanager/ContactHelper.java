package kek.pepega.pft.addressbook.appmanager;

import kek.pepega.pft.addressbook.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class ContactHelper extends HelperBase {

    public ContactHelper(WebDriver wd) {
        super(wd);
    }

    public void fillContactForm(ContactData contactData, boolean creation) {
        type(By.name("firstname"), contactData.getFirstname());
        type(By.name("middlename"), contactData.getMiddlename());
        type(By.name("lastname"), contactData.getLastname());
        type(By.name("nickname"), contactData.getNickname());
        type(By.name("title"), contactData.getTitle());
        type(By.name("company"), contactData.getCompany());
        type(By.name("address"), contactData.getAddress());
        type(By.name("mobile"), contactData.getMobile());
        type(By.name("email"), contactData.getEmail());
        if (creation) {
            new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
        } else {
            Assert.assertFalse(isElementPresent(By.name("new_group")));
        }
    }

    public void submitCreateContact() {
        click(By.xpath("//div[@id='content']/form/input[21]"));
    }

    public void initEditContact(int num) {
        wd.findElements(By.cssSelector("#maintable tr[name=entry]")).get(num).findElement(By.cssSelector("a[href*=edit]")).click();
    }

    public void selectContact(int id) {
        wd.findElement(By.xpath("//input[@id='6']")).click();
    }

    public void submitEditContact() {
        click(By.name("update"));
    }
    public void deleteContact(){
        wd.findElement(By.xpath("//input[@value='Delete']")).click();
    }


    public void createContact(ContactData contact, boolean creation) {
        goToCreateNewContactPage();
        fillContactForm(contact, creation);
    }

    public void goToCreateNewContactPage() {
        click(By.linkText("add new"));
    }

    public boolean isThereAContact() {
        return  isElementPresent(By.xpath("//input[@id='6']"));
    }
}