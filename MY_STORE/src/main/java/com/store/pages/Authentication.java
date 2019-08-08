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
public class Authentication {

    private WebDriver driver;

    @FindBy(id = "email_create")
    private WebElement createAccountEmail;

    @FindBy(id = "SubmitCreate")
    private WebElement createAccountButton;

    @FindBy(id = "email")
    private WebElement loginEmail;

    @FindBy(id = "passwd")
    private WebElement loginPassword;

    @FindBy(id = "SubmitLogin")
    private WebElement loginButton;

    public Authentication(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    public void doCreateAccount(String new_email) {
        createAccountEmail.sendKeys(new_email);
        Utility.captureScreenShot(driver,this.getClass());
        createAccountButton.click();
    }

    public void doLogin(String email, String password) {
        loginEmail.sendKeys(email);
        loginPassword.sendKeys(password);
        Utility.captureScreenShot(driver,this.getClass());
        loginButton.click();
    }
}
