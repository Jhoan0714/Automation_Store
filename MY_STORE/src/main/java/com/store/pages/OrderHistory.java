/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

/**
 *
 * @author Jhoan Lopez - lopezrjhoan@gmail.com
 */
public class OrderHistory {

    private WebDriver driver;

    @FindBy(id = "block-history")
    private WebElement blockHistory;

    @FindBy(how = How.LINK_TEXT, using = "Back to your account.")
    private WebElement backAccount;

    @FindBy(how = How.LINK_TEXT, using = "Home")
    private WebElement backHome;

    public OrderHistory(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);

    }

    public void doVerifyOrderHistory(String text) {
        Assert.assertEquals(blockHistory.getText().trim().toUpperCase(), text.trim().toUpperCase());
        Utility.captureScreenShot(driver, this.getClass());
        backHome.click();
    }
}
