package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class FacebookTestingApp {
    public static final String XPATH_CREATE_ACCOUNT = "//a[contains(@class, 42)]";
    public static final String XPATH_ACCEPT_COOKIES = "//button[2]";

    public static final String XPATH_SELECT_DAY = "//div[@class=\"_58mq _5dbb\" and @id=\"birthday_wrapper\"]/div[2]/span/span/select[1]";
    public static final String XPATH_SELECT_MONTH = "//div[@class=\"_58mq _5dbb\" and @id=\"birthday_wrapper\"]/div[2]/span/span/select[2]";
    public static final String XPATH_SELECT_YEAR = "//div[@class=\"_58mq _5dbb\" and @id=\"birthday_wrapper\"]/div[2]/span/span/select[3]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath(XPATH_ACCEPT_COOKIES)).click();
        driver.findElement(By.xpath(XPATH_CREATE_ACCOUNT)).click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        WebElement selectComboDay = driver.findElement(By.xpath(XPATH_SELECT_DAY));
        WebElement selectComboMonth = driver.findElement(By.xpath(XPATH_SELECT_MONTH));
        WebElement selectComboYear = driver.findElement(By.xpath(XPATH_SELECT_YEAR));
        boolean eleDay = driver.findElement(By.xpath(XPATH_SELECT_DAY)).isSelected();
        System.out.println(eleDay);
        Select selectDayOfBirth = new Select(selectComboDay);
        selectDayOfBirth.selectByIndex(9);
        Select selectMonthOfBirth = new Select(selectComboMonth);
        selectMonthOfBirth.selectByIndex(3);
        Select selectYearOfBirth = new Select(selectComboYear);
        selectYearOfBirth.selectByValue("2010");

    }
}
