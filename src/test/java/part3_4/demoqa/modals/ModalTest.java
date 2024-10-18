package part3_4.demoqa.modals;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.demoqa.base.BaseTest;

public class ModalTest extends BaseTest {

    @Test
    public void testModalContainerText(){

        var modalpage=homepage.goAlertsFrameW().goModalDialog();
        modalpage.ClicBysmollModal();

        String textSmollButon =modalpage.getTextSmollText();
        Assert.assertTrue(textSmollButon.contains("small modal"), "La prueba fallo porque el texto esperado no contiene esa frase " + textSmollButon);

        modalpage.CloseSmollClose();

    }
}
