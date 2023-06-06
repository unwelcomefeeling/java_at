package kek.pepega.pft.addressbook.appmanager;

import kek.pepega.pft.addressbook.model.GroupData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GroupHelper extends HelperBase{

    public GroupHelper(WebDriver wd) {

        super(wd);
    }

    public void submitGroupCreation() {
        click(By.name("submit"));
    }

    public void fillGroupForm(GroupData groupData) {
        type(By.name("group_name"), groupData.getName());
        type(By.name("group_header"), groupData.getHeader());
        type(By.name("group_footer"), groupData.getFooter());
    }

    public void initGroupCreation() {
        click(By.name("new"));
    }

    public void deleteSelectionGroups() {
        click(By.name("delete"));
    }

    public void selectGroup() {
        click(By.name("selected[]"));
//        click(By.xpath("//*[@id=\"content\"]/form/span/input"));
    }

    public void initGroupModification() {
        click(By.name("edit"));
    }

    public void submitGroupModification() {
        click(By.name("update"));
    }

    public void createGroup(GroupData group) {
       initGroupCreation();
       fillGroupForm(group);
       submitGroupCreation();
    }

    public boolean isThereAGroup() {
        return  isElementPresent(By.name("selected[]"));
//        return  isElementPresent(By.xpath("//*[@id=\"content\"]/form/span/input"));
    }
}
