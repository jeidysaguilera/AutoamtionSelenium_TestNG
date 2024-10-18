package part3_4.demoqa.test.elements;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.demoqa.base.BaseTest;

public class ElementsTest extends BaseTest {



    @Test
    public void WebTableEdit(){

        var webElement=homepage.goElements().toGoElements();
        webElement.clicEdit("alden@example.com");
        webElement.setAge("34");
        webElement.ClicSend();

        String ageActual=webElement.VerifiAge("alden@example.com");

        Assert.assertEquals(ageActual,"34");
    }


}
