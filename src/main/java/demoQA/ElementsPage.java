package demoQA;


import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollElement;

public class ElementsPage extends HomePage {


    private By wetables= By.xpath("//li[@id='item-3']//span[text()='Web Tables']");

    private By Links=By.xpath("//li[@id='item-5']//span[text()='Links']");

    public WebTablesPage toGoElements(){


        ClicByElement(wetables);

        return new WebTablesPage();


    }


    public LinkPage toGoLinks(){

        ClicByElement(Links);

        return new LinkPage();
    }




}
