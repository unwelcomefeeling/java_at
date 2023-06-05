package kek.pepega.pft.addressbook.tests;

import kek.pepega.pft.addressbook.model.GroupData;
import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase {
    @Test
    public void testsGroupDeletion() {
        app.getNavigationHelper().goToGroupPage();

        if (! app.getGroupHelper().isThereAGroup()) {
            app.getGroupHelper().createGroup(new GroupData("test1", null, null));
            app.getNavigationHelper().goToGroupPage();
        }
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().deleteSelectionGroups();
        app.getNavigationHelper().goToGroupPage();
    }
}
