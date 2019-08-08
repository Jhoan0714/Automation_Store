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
public class Shopping {
    
    private WebDriver driver;

    @FindBy(className = "icon-plus")
    private WebElement increaseQuantity;

    @FindBy(xpath = "//*[@id=\"add_to_cart\"]/button")
    private WebElement addButtonCar;

    @FindBy(linkText = "Sign out")
    private WebElement signOut;

    public Shopping(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    public void doAddToCar() {
        increaseQuantity.click();
        addButtonCar.click();
        Utility.captureScreenShot(driver, this.getClass());
        signOut.click();
    }
}
