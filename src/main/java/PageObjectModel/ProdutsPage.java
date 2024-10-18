package PageObjectModel;

import org.openqa.selenium.By;

public class ProdutsPage extends BasePage{

    private By TextConfir=By.xpath("//span[text()='Products']");

    //metodod q demuestra si entre a la pagina de home
    public boolean isProditHome(){
        return Find(TextConfir).isDisplayed();
    }
}
