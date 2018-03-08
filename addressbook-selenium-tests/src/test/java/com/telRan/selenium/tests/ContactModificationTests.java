package com.telRan.selenium.tests;

import com.telRan.selenium.model.ContactData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactModificationTests extends TestBase{

    @Test
    public void contactModificationTest(){

        app.getNavigationHelper().goToHomePage();
        if(app.getContactHelper().isContactExist() == false){
            app.getContactHelper().initContactCreation();
            app.getContactHelper().fillContactForm(new ContactData()
                    .setFirstName("temporaryName")
                    .setLastName("temporaryLastName")
                    .setAddress("temporaryAddress"));
            app.getContactHelper().submitContactCreation();
        }
        int before = app.getContactHelper().getContactCount();
        app.getContactHelper().initContactModificationByPencil();
        app.getContactHelper().fillContactForm(new ContactData()
                .setFirstName("newName")
                .setLastName("newLastName")
                .setAddress("homeless"));
        app.getContactHelper().submitContactModification();
        app.getNavigationHelper().goToHomePage();
        int after = app.getContactHelper().getContactCount();
        Assert.assertEquals(after, before);

    }
}
