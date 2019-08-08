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

    @FindBy(id = "email_create")
    private WebElement create_account_email;

    @FindBy(id = "SubmitCreate")
    private WebElement create_account_button;

    @FindBy(id = "email")
    private WebElement login_email;

    @FindBy(id = "passwd")
    private WebElement login_password;

    @FindBy(id = "SubmitLogin")
    private WebElement login_button;

    public Authentication(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void doCreateAccount(String new_email) {
        create_account_email.sendKeys(new_email);
        create_account_button.click();
    }

    public void doLogin(String email, String password) {
        login_email.sendKeys(email);
        login_password.sendKeys(password);
        login_button.click();
    }
}
