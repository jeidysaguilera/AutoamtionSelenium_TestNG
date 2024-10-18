package demoQA;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.ClicJS;
import static utilities.JavaScriptUtility.scrollElement;

public class PracticeForm extends FormPage{


    private  By radioFem= By.id("gender-radio-2");

    private By submitBoton=By.id("submit");




    public void ClicFemaleRadioButton(){

        scrollElement(radioFem);
      //usa el metodo con java >Script
        ClicJS(radioFem);
    }

    public boolean RadioisSeleceted(){

        return Find(radioFem).isSelected();
    }

    public void submitClic(){

        scrollElement(submitBoton);
        ClicByElement(submitBoton);
    }
}
