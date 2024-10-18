package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

    public static WebDriver driver;

    public void setDriver(WebDriver driver){

        BasePage.driver=driver;
    }

    protected WebElement Find(By locator){
       return  driver.findElement(locator);
    }

    protected void ClicByElement(By locator){
       Find(locator).click();
    }

    protected void setName(By locator,String texto){
        Find(locator).clear();
        Find(locator).sendKeys(texto);
    }

}
