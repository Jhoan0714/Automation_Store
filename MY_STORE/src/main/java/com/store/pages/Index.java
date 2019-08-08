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
public class Index {
    
    @FindBy(linkText="Sign in")
    private WebElement signIn;
    
    public Index(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    
    public void doSignIn(){
        signIn.click();        
    }
}
