package part3_4.demoqa.screenshot;

import org.testng.annotations.Test;
import part3_4.demoqa.base.BaseTest;

public class CaptureScreenshotTest extends BaseTest {

//el tests fallara al no utilizar el scrolling de javaScript paara poder validar el screenshot al falla el test
    @Test
    public void TestSubmitCliking(){
        var practiceFormPage=homepage.GoForm().GotoPractForm();
                practiceFormPage.submitClic();
    }
}
