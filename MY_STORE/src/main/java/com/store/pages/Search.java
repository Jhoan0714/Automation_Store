/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 *
 * @author Jhoan Lopez - lopezrjhoan@gmail.com
 */
public class Search {

    @FindBy(id = "search_query_top")
    private WebElement searchText;
    
    @FindBy(name = "submit_search")
    private WebElement searchButton;
    
    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li/div")
    private WebElement productContainer;
    
    public Search(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    
    public void doSearch(String text){
        searchText.sendKeys(text);
        searchButton.click();
        productContainer.findElement(By.xpath("//img[@alt='"+text+"']")).click();
    }
    
}
