package com.telRan.selenium.appManager;

import com.telRan.selenium.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ContactHelper extends HelperBase{

    public ContactHelper(WebDriver wd) {
        super(wd);
    }

    public void initContactCreation() {
        click(By.xpath("//*[@href='edit.php']"));
    }


        public void fillContactForm(ContactData contactData) {
            type(By.name("firstname"), contactData.getFirstName());
            type(By.name("lastname"), contactData.getLastName());
            type(By.name("address"), contactData.getAddress());
            new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
            attach(By.name("photo"),contactData.getPhoto());
    }

    public void submitContactCreation() {
        click(By.name("submit"));
    }

    public int getContactCount() {
       return wd.findElements(By.name("selected[]")).size();
    }

    public void createContact() {
        initContactCreation();
        fillContactForm(new ContactData()
                .setFirstName("fName111")
                .setLastName("lName")
                .setAddress("Address"));

       submitContactCreation();
    }

    public boolean isContactExist() {
        return isElementPresent((By.name("selected[]")));
    }

    public void selectContact() {
        click(By.name("selected[]"));
    }

    public void initContactDelition() {
    click(By.xpath("//*[@value='Delete']"));
        wd.switchTo().alert().accept();
    }

    public void initContactModificationByPencil() {
        click(By.xpath("//html//tr[2]/td[8]"));
    }

    public void submitContactModification() {
        click(By.name("update"));
    }
}
