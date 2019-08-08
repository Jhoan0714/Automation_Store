/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.test;

import com.store.pages.Account;
import com.store.pages.Authentication;
import com.store.pages.Index;
import com.store.pages.Register;
import org.testng.annotations.Test;

/**
 *
 * @author Jhoan Lopez - lopezrjhoan@gmail.com
 */
public class TestStore extends Store {

    @Test(priority = 0, description = "Welcome to the store page")
    public void loadPage() {
        Index index = new Index(driver);
        index.doSignIn();
    }

    @Test(priority = 1, description = "Create Account")
    public void createAccount() throws InterruptedException {
        Authentication authentication = new Authentication(driver);
        authentication.doCreateAccount("duyaapagaa@simplebox.email");
        Thread.sleep(5000);
    }

    @Test(priority = 2, description = "Register your personal information")
    public void registerPerson() {
        Register register = new Register(driver);
        register.doRegister("Mrs", "John", "Doe", "admin123", "15  ", "November ", "1990  ", "Avenida 8 # 26 - 31", "Colorado", "Colorado", "00001", "United States", "386785643", "My House");
    }

    @Test(priority = 3, description = "Sign out account")
    public void signOutAccount() {
        Account account = new Account(driver);
        account.doSignOut();
    }

    @Test(priority = 4, description = "Login account")
    public void LoginAccount() {
        Authentication authentication = new Authentication(driver);
        authentication.doLogin("duyaapagaa@simplebox.email", "admin123");
    }

}
