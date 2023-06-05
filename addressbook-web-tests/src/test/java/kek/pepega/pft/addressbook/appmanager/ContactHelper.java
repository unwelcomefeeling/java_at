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
        type(By.name("firstname"), contactData.firstname());
        type(By.name("middlename"), contactData.middlename());
        type(By.name("lastname"), contactData.lastname());
        type(By.name("nickname"), contactData.nickname());
        type(By.name("title"), contactData.title());
        type(By.name("company"), contactData.company());
        type(By.name("address"), contactData.address());
        type(By.name("mobile"), contactData.mobile());
        type(By.name("email"), contactData.email());

        if (creation) {
            new Select(wd.findElement(By.name("new"))).selectByVisibleText(contactData.group());
        } else {
            Assert.assertFalse(isElementPresent(By.name("new")));
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


}