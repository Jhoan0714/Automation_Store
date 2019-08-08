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
    private WebElement sign_out;

    public Account(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void doSignOut() {
        sign_out.click();
    }
}
