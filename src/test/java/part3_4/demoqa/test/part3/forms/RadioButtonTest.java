package part3_4.demoqa.test.part3.forms;

import demoQA.HomePage;
import demoQA.PracticeForm;
import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.demoqa.base.BaseTest;

public class RadioButtonTest extends BaseTest {

    @Test
    public void testRadioButton() throws InterruptedException {

    var formPage=homepage.GoForm().GotoPractForm();
    Thread.sleep(2000);
    formPage.ClicFemaleRadioButton();
    boolean resultActual=formPage.RadioisSeleceted();
    Assert.assertTrue(resultActual,"El radio button no fue seleccionado");
    }



}
