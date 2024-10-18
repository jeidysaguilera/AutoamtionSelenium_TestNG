package demoQA;

import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollElement;

public class AlertFrameWindowPage extends HomePage {

private By modalDialog= By.xpath("//li[@id='item-4']//span[text()='Modal Dialogs']");

private By alerts=By.xpath("//li[@id='item-1']//span[text()='Alerts']");



    public ModalDialogPage goModalDialog()
    {
        scrollElement(modalDialog);
        ClicByElement(modalDialog);

        return new ModalDialogPage();
    }
    public AlertsPage goAlerts()
    {
        scrollElement(alerts);
        ClicByElement(alerts);

        return new AlertsPage();
    }

}
