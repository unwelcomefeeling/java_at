package kek.pepega.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelperBase{

    public NavigationHelper(WebDriver wd) {
        super(wd);
    }

    public void goToGroupPage() {
        click(By.linkText("groups"));
    }

    public void goHomePage() {
        click(By.linkText("home page"));
    }
    public void goToCreateNewContactPage() {
        click(By.linkText("add new"));
    }

}
