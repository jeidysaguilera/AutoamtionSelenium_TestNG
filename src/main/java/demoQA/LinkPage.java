package demoQA;

import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollElement;

public class LinkPage extends ElementsPage{


   private By idBadRequest= By.id("bad-request");

   private By ResponseLink=By.id("linkResponse");


   public String ClicLink() throws InterruptedException {

       scrollElement(idBadRequest);
       ClicByElement(idBadRequest);


       Thread.sleep(2000);

       return Find(ResponseLink).getText();
   }

}
