package demoQA;

import org.openqa.selenium.By;

public class WebTablesPage extends ElementsPage{



By ageField=By.id("age");

By submitButton=By.id("submit");


public void clicEdit(String email){

    By edit=By.xpath("//div[text()='" + email + "']//following::span[@id='edit-record-2']");
    ClicByElement(edit);
}


public void setAge(String age){

    setName(ageField,age);
}



public void ClicSend(){
    ClicByElement(submitButton);
}

public String VerifiAge(String email){

    By edadActual=By.xpath("//div[text()='"+ email +"']//preceding::div[1]");

    return Find(edadActual).getText();
}

}
