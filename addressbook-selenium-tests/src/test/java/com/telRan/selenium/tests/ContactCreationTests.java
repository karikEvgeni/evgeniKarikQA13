package com.telRan.selenium.tests;

import com.telRan.selenium.model.ContactData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase{

    @Test
    public void creationContactTest(){
        app.getNavigationHelper().goToHomePage();
        int before = app.getContactHelper().getContactCount();
        app.getNavigationHelper().initContactCreation();
        app.getContactHelper().fillContactForm(new ContactData()
                .setFirstName("fName")
                .setLastName("lName")
                .setAddress("Address"));

        app.getContactHelper().submitContactCreation();
        int after = app.getContactHelper().getContactCount();
        Assert.assertEquals(after, before + 1);
    }

}
