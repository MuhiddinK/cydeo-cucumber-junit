package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPage {

    // create constructor and initialize driver
    public GoogleSearchPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    // locate web elements
    @FindBy(name = "q")
    public WebElement searchBox;







}
