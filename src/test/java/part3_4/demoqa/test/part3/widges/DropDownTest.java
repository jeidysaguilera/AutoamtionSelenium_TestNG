package part3_4.demoqa.test.part3.widges;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.demoqa.base.BaseTest;

import java.util.List;

public class DropDownTest extends BaseTest {


    @Test
    public void TestDropDown(){

        var dropdown=homepage.goWidgesPage().toGoSelectMenu();
        dropdown.SelectedMultiple("Volvo");
      //  dropdown.SelectedMultiple("Saab");
        dropdown.SelectedMultiple("Opel");
        dropdown.SelectedMultiple("Audi");

       List<String>resultSelected= dropdown.OPctionSelect();

       Assert.assertTrue(resultSelected.contains("Volvo"));
        Assert.assertFalse(resultSelected.contains("Saab"));

        System.out.println("Resultados seleccionados" + resultSelected);



    }

}
