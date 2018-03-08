package com.telRan.selenium.tests;

import com.telRan.selenium.model.ContactData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactModificationTests extends TestBase{

    @Test
    public void contactModificationTest(){

        app.getNavigationHelper().goToHomePage();
        int before = app.getContactHelper().getContactCount();
        app.getContactHelper().initContactModificationByPencil();
        app.getContactHelper().fillContactForm(new ContactData()
                .setFirstName("reName")
                .setLastName("reLName")
                .setAddress("2"));
        app.getContactHelper().submitContactModification();
        app.getNavigationHelper().goToHomePage();
        int after = app.getContactHelper().getContactCount();
        Assert.assertEquals(after, before);

    }
}
