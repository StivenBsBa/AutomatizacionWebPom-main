package com.unac.pages;

import com.unac.actions.Action;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://parabank.parasoft.com/")
public class RegisterPage extends PageObject {
    By firstName = By.id("customer.firstName");
    By lastName = By.id("customer.lastName");
    By addressStreet = By.id("customer.address.street");
    By addressCity = By.id("customer.address.city");
    By addressState = By.id("customer.address.state");
    By addressZipCode = By.id("customer.address.zipCode");
    By phoneNumber = By.id("customer.phoneNumber");
    By ssn = By.id("customer.ssn");
    By username = By.id("customer.username");
    By password = By.id("customer.password");
    By repeatedPassword = By.id("repeatedPassword");
    By registerButton = By.xpath("//input[@type='submit' and @value='Register']");

    public void register(String strFirstName, String strLastName, String strAddressStreet, String strAddressCity,
                         String strAddressState, String strAddressZipCode, String strPhoneNumber, String strSSN,
                         String strUsername, String strPassword) {
        Action.sendData(getDriver(), firstName, strFirstName);
        Action.sendData(getDriver(), lastName, strLastName);
        Action.sendData(getDriver(), addressStreet, strAddressStreet);
        Action.sendData(getDriver(), addressCity, strAddressCity);
        Action.sendData(getDriver(), addressState, strAddressState);
        Action.sendData(getDriver(), addressZipCode, strAddressZipCode);
        Action.sendData(getDriver(), phoneNumber, strPhoneNumber);
        Action.sendData(getDriver(), ssn, strSSN);
        Action.sendData(getDriver(), username, strUsername);
        Action.sendData(getDriver(), password, strPassword);
        Action.sendData(getDriver(), repeatedPassword, strPassword);
        Action.clicElement(getDriver(), registerButton);
    }
}
