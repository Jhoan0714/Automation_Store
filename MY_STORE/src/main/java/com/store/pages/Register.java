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
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author Jhoan Lopez - lopezrjhoan@gmail.com
 */
public class Register {

    @FindBy(id = "id_gender1")
    private WebElement genderMr;

    @FindBy(id = "id_gender2")
    private WebElement genderMrs;

    @FindBy(id = "customer_firstname")
    private WebElement firstname;

    @FindBy(id = "customer_lastname")
    private WebElement lastname;

    @FindBy(id = "passwd")
    private WebElement password;

    @FindBy(id = "days")
    private WebElement birthDay;

    @FindBy(id = "months")
    private WebElement birthMonth;

    @FindBy(id = "years")
    private WebElement birthYear;

    @FindBy(how = How.ID_OR_NAME, using = "newsletter")
    private WebElement subscriptionNewsletter;

    @FindBy(id = "address1")
    private WebElement address;

    @FindBy(id = "city")
    private WebElement city;

    @FindBy(id = "id_state")
    private WebElement state;

    @FindBy(id = "postcode")
    private WebElement postCode;

    @FindBy(id = "id_country")
    private WebElement country;

    @FindBy(id = "phone_mobile")
    private WebElement phoneMobile;

    @FindBy(id = "alias")
    private WebElement aliasAddress;

    @FindBy(id = "submitAccount")
    private WebElement registerButton;

    public Register(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void doRegister(String myGender, String myFirstname, String myLastname, String myPassword, String myDay, String myMonth, String myYear, String myAddress, String myCity, String myState, String myPostCode, String myCountry, String myPhoneMobile, String myAliasAddress) {
        if (myGender.toUpperCase().equals("MR")) {
            genderMr.click();
        } else {
            genderMrs.click();
        }
        firstname.sendKeys(myFirstname);
        lastname.sendKeys(myLastname);
        password.sendKeys(myPassword);
        textToSelect(birthDay, myDay);
        textToSelect(birthMonth, myMonth);
        textToSelect(birthYear, myYear);
        subscriptionNewsletter.click();
        address.sendKeys(myAddress);
        city.sendKeys(myCity);
        textToSelect(state, myState);
        postCode.sendKeys(myPostCode);
        textToSelect(country, myCountry);
        phoneMobile.sendKeys(myPhoneMobile);
        aliasAddress.clear();
        aliasAddress.sendKeys(myAliasAddress);
        registerButton.click();
    }

    private void textToSelect(WebElement element, String text) {
        Select select_Box = new Select(element);
        select_Box.selectByVisibleText(text + "");
    }

}
