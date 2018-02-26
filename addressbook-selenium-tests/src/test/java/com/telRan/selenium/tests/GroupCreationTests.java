package com.telRan.selenium.tests;

import com.telRan.selenium.model.GroupData;
import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {

    @Test
    public void groupCreationTest() {

        app.goToGroupsPage();
        app.initGroupCreation();
        app.fillGroupForm(new GroupData("test1", "test1Header", "test1Footer"));
        app.submitGroupCreation();
        app.returnToGroupsPage();
    }

}
