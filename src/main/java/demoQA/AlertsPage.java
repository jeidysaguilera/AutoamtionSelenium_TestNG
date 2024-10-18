package demoQA;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;

public class AlertsPage extends AlertFrameWindowPage{

private By alertInfo= By.id("alertButton");
private By alertConfirmation=By.id("confirmButton");

private By mesageConfirmationCancel=By.id("confirmResult");

private By prompAlert=By.id("promtButton");
private By prompResult=By.id("promptResult");


public void ClicAlertInformation(){


    ClicByElement(alertInfo);

}

    public void ClicAlertConfirmation(){


        ClicByElement(alertConfirmation);
    }

    public String ConfirmationMesageCancel(){
    return Find(mesageConfirmationCancel).getText();
    }

    public void ClicPrompAlert(){
    ClicByElement(prompAlert);
    }

    public String MesagPrompResult(){
    return Find(prompResult).getText();
    }

}
