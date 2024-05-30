package com.unac.pages;

import com.unac.actions.Action;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://parabank.parasoft.com/")
public class LoginPage extends PageObject {
    By registerLink = By.linkText("Register");

    public void clickRegisterLink() {
        Action.clicElement(getDriver(), registerLink);
    }
}
