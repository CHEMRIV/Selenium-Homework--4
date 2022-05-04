package uk.co.amazon.www.testbase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import uk.co.amazon.www.propertyreader.PropertyReader;
import uk.co.amazon.www.utility.Utility;

public class TestBase extends Utility {
    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod
    public void setUp() {
        selectBrowser(browser);
    }


    @AfterMethod
    public void tearDown() {
        closeBrowser();

    }

}
