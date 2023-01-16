package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utilities.TestBase;
import java.io.IOException;
public class Day13_JSExecutor extends TestBase {
    @Test
    public void scrollIntoViewTest() throws IOException {
        driver.get("https://techproeducation.com/");
        waitFor(3);
//        1. create js executor object
        JavascriptExecutor js =(JavascriptExecutor)driver;
//        2. execute the command
        waitFor(3);
//        scrolling We Offer element
        js.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath("//*[.='we offer']")));
        waitFor(3);
        takeScreenshotOfPage();
        waitFor(3);
//        scrolling LMS LOGIN element
        js.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath("//span[.=' Enroll Free ']")));
        waitFor(3);
        takeScreenshotOfPage();
        waitFor(3);
//        scrolling WHY US element
        scrollIntoViewByJS(driver.findElement(By.xpath("//h3[.='WHY US?']")));
        waitFor(3);
        takeScreenshotOfPage();
        waitFor(3);
//        scrolling back up to enroll free
        scrollIntoViewByJS(driver.findElement(By.xpath("//span[.=' Enroll Free ']")));
        waitFor(3);
        takeScreenshotOfPage();
//        scroll all the way down
        scrollAllDownByJS();
        waitFor(3);
        takeScreenshotOfPage();
//        scroll all the way up
        scrollAllUpByJS();
        waitFor(3);
        takeScreenshotOfPage();
    }

    @Test
    public void clickByJSTest(){
        driver.get("https://techproeducation.com/");
//        WebElement lmsLogin = driver.findElement(By.linkText("LMS LOGIN"));
//        clickByJS(lmsLogin);
        clickByJS(driver.findElement(By.linkText("LMS LOGIN")));
    }

    //public void clickByJS(WebElement lms_login) {
   // }

    @Test
    public void typeInTheInputTest() {
        driver.get("https://techproeducation.com/");
        setValueByJS(driver.findElement(By.xpath("//input[@type='search']")), "QA");

    }
    @Test
    public void getValueOfInputTest(){

        driver.get("https://www.priceline.com/");
        getValueByJS("hotelDates");

    }
    @Test
    public void colorByJSTest(){
        driver.get("https://www.priceline.com/");
        changeBackGroundColorByJS(driver.findElement(By.xpath("//button[@data-testid='HOTELS_SUBMIT_BUTTON']")),"red");
        addBorderStyleByJS(driver.findElement(By.xpath("//button[@data-testid='HOTELS_SUBMIT_BUTTON']")),"5px solid blue");
    }

}
