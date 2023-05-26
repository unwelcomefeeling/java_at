package kek.pepega.pft.addressbook.appmanager;

import kek.pepega.pft.addressbook.model.GroupDate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GroupHelper extends HelperBase{

    public GroupHelper(WebDriver wd) {

        super(wd);
    }

    public void submitGroupCreation() {
        click(By.name("submit"));
    }

    public void fillGroupForm(GroupDate groupDate) {
        type(By.name("group_name"), groupDate.name());
        type(By.name("group_header"), groupDate.header());
        type(By.name("group_footer"), groupDate.footer());
    }

    public void initGroupCreation() {
        click(By.name("new"));
    }

    public void deleteSelectionGroups() {
        click(By.name("delete"));
    }

    public void selectGroup() {
        click(By.name("selected[]"));
    }
}
