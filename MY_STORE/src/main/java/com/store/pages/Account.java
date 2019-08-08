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

    @FindBy(linkText = "Sign out")
    private WebElement signOut;

    @FindBy(xpath = "//*[@id=\"center_column\"]/div/div[1]/ul/li[1]/a/span")
    private WebElement orderHistory;

    public Account(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void doSignOut() {
        signOut.click();
    }

    public void doOrderHistory() {
        orderHistory.click();
    }
}
