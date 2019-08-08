/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 *
 * @author Jhoan Lopez - lopezrjhoan@gmail.com
 */
public class Account {

    private WebDriver driver;

    @FindBy(linkText = "Sign out")
    private WebElement signOut;

    @FindBy(xpath = "//*[@id=\"center_column\"]/div/div[1]/ul/li[1]/a/span")
    private WebElement orderHistory;

    public Account(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    public void doSignOut() {
        Utility.captureScreenShot(driver,this.getClass());
        signOut.click();
    }

    public void doOrderHistory() {
        Utility.captureScreenShot(driver,this.getClass());
        orderHistory.click();
    }
}
