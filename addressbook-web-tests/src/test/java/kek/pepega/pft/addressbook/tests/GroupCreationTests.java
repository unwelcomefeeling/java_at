package kek.pepega.pft.addressbook.tests;

import kek.pepega.pft.addressbook.model.GroupData;
import org.testng.annotations.*;

public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() throws Exception {
        app.getNavigationHelper().goToGroupPage();
        app.getGroupHelper().createGroup(new GroupData("test1", null, null));
        app.getNavigationHelper().goToGroupPage();

    }

}


