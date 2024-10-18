package part3_4.demoqa.test.part4.alerts;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.demoqa.base.BaseTest;

import static utilities.swichToUtilities.*;

public class AlertsTest extends BaseTest {

    @Test
    public void testInformationAlert() {

        String ExpectedText="You clicked a button";
        var alertinfor=homepage.goAlertsFrameW().goAlerts();
        alertinfor.ClicAlertInformation();


        Assert.assertEquals(ExpectedText,getAlertText(),"El texto esperado no es el mismo");

        aceptAlerts();
    }

    @Test
    public void testConfirmationAlertCancel(){

        String expectMesag="You selected Cancel";
        var alertCancel=homepage.goAlertsFrameW().goAlerts();
        alertCancel.ClicAlertConfirmation();
        CancelarAlerts();

        Assert.assertEquals(expectMesag,alertCancel.ConfirmationMesageCancel(),"El mensaje obtenido no correspondde al esperado");


    }

    @Test
    public void testPrompMesage() {

        String name="Jeidys";
        String expectMesag="You entered "+ name;
        var alertpromp=homepage.goAlertsFrameW().goAlerts();

        alertpromp.ClicPrompAlert();
       // Thread.sleep(2000);
        EscribirPromp(name);
        aceptAlerts();

        Assert.assertEquals(expectMesag,alertpromp.MesagPrompResult(),"El mensaje esperado no es el mismo ");


    }
}
