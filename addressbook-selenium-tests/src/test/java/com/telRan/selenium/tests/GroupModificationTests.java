package com.telRan.selenium.tests;

import com.telRan.selenium.model.GroupData;
import org.testng.annotations.Test;

public class GroupModificationTests extends TestBase {

    @Test
    public void groupModificationTest() {
        app.goToGroupsPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().fillGroupForm(new GroupData()
                .setGroupName("rename")
                .setGroupHeader("rename")
                .setGroupFooter("rename"));
        app.getGroupHelper().submitGroupModification();
        app.getGroupHelper().returnToGroupsPage();
    }
}