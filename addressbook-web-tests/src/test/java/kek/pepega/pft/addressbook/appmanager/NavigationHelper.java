package kek.pepega.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static jdk.internal.agent.Agent.getText;

public class NavigationHelper extends HelperBase{

    public NavigationHelper(WebDriver wd) {
        super(wd);
    }

    public void goToGroupPage() {
        if (isElementPresent(By.tagName("h1"))
              && wd.findElement(By.tagName("h1")).getText().equals("Groups")
              && isElementPresent(By.name("New group"))) {
            return;
        }
        click(By.linkText("groups"));
    }

    public void goHomePage() {
            if (isElementPresent(By.id("maintable"))) {
                return;
            }
        click(By.linkText("home"));
    }

    public void goToCreateNewContactPage() {
        click(By.linkText("add new"));
    }

}

