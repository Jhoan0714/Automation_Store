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
    private WebElement gender_Mr;

    @FindBy(id = "id_gender2")
    private WebElement gender_Mrs;

    @FindBy(id = "customer_firstname")
    private WebElement firstname;

    @FindBy(id = "customer_lastname")
    private WebElement lastname;

    @FindBy(id = "passwd")
    private WebElement password;

    @FindBy(id = "days")
    private WebElement birth_day;

    @FindBy(id = "months")
    private WebElement birth_month;

    @FindBy(id = "years")
    private WebElement birth_year;

    @FindBy(how = How.ID_OR_NAME, using = "newsletter")
    private WebElement subscription_newsletter;

    @FindBy(id = "address1")
    private WebElement address;

    @FindBy(id = "city")
    private WebElement city;

    @FindBy(id = "id_state")
    private WebElement state;

    @FindBy(id = "postcode")
    private WebElement postcode;

    @FindBy(id = "id_country")
    private WebElement country;

    @FindBy(id = "phone_mobile")
    private WebElement phone_mobile;

    @FindBy(id = "alias")
    private WebElement alias_address;

    @FindBy(id = "submitAccount")
    private WebElement register_button;

    public void Register(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void doRegister(String my_gender, String my_firstname, String my_lastname, String my_password, int my_day, int my_month, int my_year, String my_address, String my_city, String my_state, String my_post_code, String my_country, String my_phone_mobile, String my_alias_address) {
        if (my_gender.toUpperCase().equals("MR")) {
            gender_Mr.click();
        } else {
            gender_Mrs.click();
        }
        firstname.sendKeys(my_firstname);
        lastname.sendKeys(my_lastname);
        password.sendKeys(my_password);
        textToSelect(birth_day, my_day + "");
        textToSelect(birth_month, my_month + "");
        textToSelect(birth_year, my_year + "");
        subscription_newsletter.click();
        address.sendKeys(my_address);
        city.sendKeys(my_city);
        textToSelect(state, my_state + "");
        postcode.sendKeys(my_post_code);
        textToSelect(country, my_country + "");
        phone_mobile.sendKeys(my_phone_mobile);
        alias_address.sendKeys(my_alias_address);
        register_button.click();
    }

    private void textToSelect(WebElement element, String text) {
        Select select_Box = new Select(element);
        select_Box.selectByVisibleText(text + "");
    }

}
