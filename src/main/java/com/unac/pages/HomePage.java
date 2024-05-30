package com.unac.pages;

import com.unac.actions.Action;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;

public class HomePage extends PageObject {
    By title = By.xpath("//*[text()='Manger Id : Steve123']");

    public void validateTitle(String strTitle) {
        assertEquals("El valor esperado es: " + strTitle +
                " es igual a " + Action.getElementText(getDriver(), title),
                strTitle, Action.getElementText(getDriver(), title));
    }
}
