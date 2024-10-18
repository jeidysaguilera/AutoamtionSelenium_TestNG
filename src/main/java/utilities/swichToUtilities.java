package utilities;

import org.openqa.selenium.WebDriver;

public class swichToUtilities extends Utility{


private static WebDriver.TargetLocator switchTo(){

    return driver.switchTo();
}

// este metodo retorna el texto de la alerta
public static String getAlertText(){
    return switchTo().alert().getText();
}

    public static void aceptAlerts(){
    switchTo().alert().accept();
    }

    public static void CancelarAlerts(){
        switchTo().alert().dismiss();
    }

    public static void EscribirPromp(String text){

    switchTo().alert().sendKeys(text);
    }

}
