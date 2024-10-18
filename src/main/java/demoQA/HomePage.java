package demoQA;

import PageObjectModel.BasePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollElement;

public class HomePage extends BasePage {

    private By forms=By.xpath("//div[@id='app']//h5[text()='Forms']");

    private By elements=By.xpath("//div[@class='card-body']/h5[text()='Elements']");

    private By widgets=By.xpath("//div[@class='card-body']//h5[text()='Widgets']");

    private By alertsWidges=By.xpath("//div[@class='card-body']//h5[text()='Alerts, Frame & Windows']");



/// este metodo llama a entrar a una nueva page de la web por eso crear una nueva instancia d ella
    public FormPage GoForm(){

        scrollElement(forms);
        ClicByElement(forms);
        return new FormPage();
    }

    public ElementsPage goElements(){

        scrollElement(elements);
        ClicByElement(elements);

        return new ElementsPage();
    }

    public WidgesPage goWidgesPage(){

        scrollElement(widgets);
        ClicByElement(widgets);

        return new WidgesPage();
    }
    public AlertFrameWindowPage goAlertsFrameW()
    {
        scrollElement(alertsWidges);
        ClicByElement(alertsWidges);

        return new AlertFrameWindowPage();
    }
}
