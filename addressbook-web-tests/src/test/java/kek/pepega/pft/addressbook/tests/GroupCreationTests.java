package kek.pepega.pft.addressbook.tests;

import kek.pepega.pft.addressbook.model.GroupDate;
import org.testng.annotations.*;

public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() throws Exception {
        app.goToGroupPage();
        app.initGroupCreation();
        app.fillGroupForm(new GroupDate("test1", "test2", "test3"));
        app.submitGroupCreation();
        app.goToGroupPage();

    }

}
