package demoQA;

import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollElement;

public class WidgesPage extends HomePage{


    private By selectMenu= By.xpath("//li[@id='item-8']//span[text()='Select Menu']");

    private By datePicker=By.xpath("//li[@id='item-2']//span[text()='Date Picker']");

    public SelectMenuPage toGoSelectMenu(){

        scrollElement(selectMenu);
        ClicByElement(selectMenu);

        return new SelectMenuPage();
    }

    public DatePickerPage toGoDatePicker(){

        scrollElement(datePicker);
        ClicByElement(datePicker);

        return new DatePickerPage();
    }
}
