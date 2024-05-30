package com.unac.pages;

import com.unac.actions.Action;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class AccountOverviewPage extends PageObject {
    By accountsOverviewLink = By.linkText("Accounts Overview");

    public void goToAccountsOverview() {
        Action.clicElement(getDriver(), accountsOverviewLink);
    }

    public boolean isAccountPresent(String accountNumber) {
       
        return false;
    }
}
