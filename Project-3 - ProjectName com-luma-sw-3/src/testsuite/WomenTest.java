package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import utilities.Utility;

import java.time.Duration;
import java.util.List;

public class WomenTest extends Utility {
    String baseUrl = "https://magento.softwaretestingboard.com/";

    @Before
    public void setup() {
        openBrowser(baseUrl);
    }

    @Test
    public void verifyTheSortByProductPriceFilter() {
        //mouse hover on women menu, Tops, click on Jackets
        mouseHover(By.xpath("//a[@id='ui-id-4']//span[@class='ui-menu-icon ui-icon ui-icon-carat-1-e']"),By.xpath("//a[@id='ui-id-9']"),By.xpath("//a[@id='ui-id-11']//span[contains(text(),'Jackets')]"));

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        WebElement dropDown = driver.findElement(By.id("sorter"));
        Select select = new Select(dropDown);
        //Select by visible text
        select.selectByVisibleText("Position");

        //Select by Value
        select.selectByVisibleText("Product Name");
        //To print the name of 12 price list in console
        List<WebElement> List1 = driver.findElements(By.xpath("//strong[@class='product name product-item-name']"));
        for (int i = 0; i < List1.size(); i++) {
            System.out.println(List1.get(i).getText());
            String exp = List1.get(i).getText();
            String actual = List1.get(i).getText();
            Assert.assertEquals("Products not in alphabetical order  ", exp, actual);}}



    @Test
    public void verifyTheSortByPriceFilter(){
        //mouse hover on women menu

        //mouse hover on women menu, Tops, click on Jackets
        mouseHover(By.xpath("//a[@id='ui-id-4']//span[@class='ui-menu-icon ui-icon ui-icon-carat-1-e']"),By.xpath("//a[@id='ui-id-9']"),By.xpath("//a[@id='ui-id-11']//span[contains(text(),'Jackets')]"));

        WebElement dropDown = driver.findElement(By.id("sorter"));
        Select select = new Select(dropDown);
        //Select by visible text
        select.selectByVisibleText("Position");
//div[2]//div[3]//select[1]

        select.selectByValue("price");
        //To print the name of 12 price list in console
        List<WebElement> List2 = driver.findElements(By.xpath("//div[@class = 'price-box price-final_price']"));
        for (int i = 0; i < List2.size(); i++) {
            System.out.println(List2.get(i).getText());
            String exp = List2.get(i).getText();
            String actual = List2.get(i).getText();
            Assert.assertEquals("Price not ordered : Low to High  ", exp, actual);}}}




