package utilities;

import PageObjectModel.BasePage;
import org.openqa.selenium.WebDriver;

public class Utility {

    public static WebDriver driver;

    public static void UtilityDriver(){
        driver= BasePage.driver;
    }
}
