package kek.pepega.pft.addressbook.tests;

import kek.pepega.pft.addressbook.appmanager.ApplicationManager;
import org.openqa.selenium.remote.Browser;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

    protected final ApplicationManager app = new ApplicationManager(Browser.CHROME);

    @BeforeMethod(alwaysRun = true)
    public void setUp() throws Exception {
        app.init();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() throws Exception {
        app.stop();
    }

}
