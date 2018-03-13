package com.telRan.selenium.tests;

import com.telRan.selenium.model.ContactData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

public class ContactCreationTests extends TestBase {

    @Test
    public void creationContactTest() {
        app.getNavigationHelper().goToHomePage();
        int before = app.getContactHelper().getContactCount();
        app.getContactHelper().initContactCreation();
        File photo = new File("addressbook-selenium-tests/src/test/resources/catVasia.jpg");
        app.getContactHelper().fillContactForm(new ContactData()
                .setFirstName("fName23123")
                .setLastName("lName")
                .setAddress("Address")
                .setGroup("test1")
                .setPhoto(photo));

        app.getContactHelper().submitContactCreation();
        int after = app.getContactHelper().getContactCount();
        Assert.assertEquals(after, before + 1);
    }

}
