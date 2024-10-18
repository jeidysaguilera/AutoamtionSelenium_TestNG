package demoQA;


import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollElement;

public class FormPage extends HomePage {

    private By parctiFtrom= By.cssSelector("div[class='element-list collapse show'] span[class='text']");

    public PracticeForm GotoPractForm(){

        scrollElement(parctiFtrom);
        ClicByElement(parctiFtrom);

        return new PracticeForm();

    }

}
