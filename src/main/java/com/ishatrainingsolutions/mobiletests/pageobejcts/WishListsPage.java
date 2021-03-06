package com.ishatrainingsolutions.mobiletests.pageobejcts;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class WishListsPage {
    private AndroidDriver<MobileElement> driver;

    /*elements*/
    @AndroidFindBy(id = "com.hostelworld.app:id/arrow")
    private MobileElement arrowElement;

    /*constructor*/
    public WishListsPage(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);

    }

    /*functions*/

    public ExplorePage clickArrowOnWishListPage() {
        arrowElement.click();
        return new ExplorePage(driver);
    }
}
