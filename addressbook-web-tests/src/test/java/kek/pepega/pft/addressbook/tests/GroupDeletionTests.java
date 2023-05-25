package kek.pepega.pft.addressbook.tests;

import org.testng.annotations.Test;


public class GroupDeletionTests extends TestBase {


    @Test
    public void testGroupDeletion() throws Exception {
        app.goToGroupPage();
        app.selectGroup();
        app.deleteSelectionGroups();
        app.goToGroupPage();
    }


}


