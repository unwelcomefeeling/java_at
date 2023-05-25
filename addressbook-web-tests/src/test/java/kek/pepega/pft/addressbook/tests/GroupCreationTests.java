package kek.pepega.pft.addressbook.tests;

import kek.pepega.pft.addressbook.model.GroupDate;
import org.testng.annotations.*;

public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() throws Exception {
        app.getNavigationHelper().goToGroupPage();
        app.getGroupHelper().initGroupCreation();
        app.getGroupHelper().fillGroupForm(new GroupDate("test1", "test2", "test3"));
        app.getGroupHelper().submitGroupCreation();
        app.getNavigationHelper().goToGroupPage();

    }

}


