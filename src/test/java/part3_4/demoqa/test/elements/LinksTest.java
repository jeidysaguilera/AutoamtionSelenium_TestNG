package part3_4.demoqa.test.elements;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.demoqa.base.BaseTest;

public class LinksTest extends BaseTest {


    @Test
    public void TestLink() throws InterruptedException {

        var linkt=homepage.goElements().toGoLinks();
       String linkactual= linkt.ClicLink();



        Assert.assertTrue(linkactual.contains("400") && linkactual.contains("Bad Request"));


    }

}
