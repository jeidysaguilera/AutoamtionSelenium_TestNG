package demoQA;

import org.openqa.selenium.By;

public class ModalDialogPage extends AlertFrameWindowPage{

    private By smollMoadal= By.id("showSmallModal");

    private By smollText=By.xpath("//div[contains(text(),'small modal')]");
    private By smollClose=By.id("closeSmallModal");


    private By largeModal=By.id("showLargeModal");
    private By largeText=By.xpath("//div[@class='modal-body']/p[contains(text(),'Lorem Ipsum')]");
    private By largeClose=By.id("closeLargeModal");


    public void ClicBysmollModal(){
        ClicByElement(smollMoadal);
    }

    public String getTextSmollText(){

        return Find(smollText).getText();
    }


    public void CloseSmollClose(){
        ClicByElement(smollClose);
    }








}
