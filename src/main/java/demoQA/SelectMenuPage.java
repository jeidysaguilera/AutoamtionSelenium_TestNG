package demoQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

import static utilities.JavaScriptUtility.scrollElement;

public class SelectMenuPage extends WidgesPage {


    private By idCar= By.id("cars");

    public void SelectedMultiple(String text){

        scrollElement(idCar);
        Select listCar=new Select(Find(idCar));

        listCar.selectByVisibleText(text);
    }

    ///para ver si todos los camppos fueron seleccionado
    public List<String> OPctionSelect(){

        Select list=new Select(Find(idCar));
        List<WebElement>resul=list.getAllSelectedOptions();

        return resul.stream().map(WebElement::getText).collect(Collectors.toList()); //me develve todos los valores seleccionado
    }
}
