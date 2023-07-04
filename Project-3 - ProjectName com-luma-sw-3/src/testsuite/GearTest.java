package testsuite;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class GearTest extends Utility {

    String baseUrl = "https://magento.softwaretestingboard.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart() {
        mouseHover(By.xpath("//span[contains(text(),'Gear')]"), By.xpath("//span[contains(text(),'Gear')]"));
        
    }
}
