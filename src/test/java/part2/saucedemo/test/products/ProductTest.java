package part2.saucedemo.test.products;


import PageObjectModel.ProdutsPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import part2.saucedemo.demo.BaseTest;

public class ProductTest extends BaseTest {


    @Test
    public void HomePageStart(){

      ProdutsPage produtsPage= loginpage.LoginIntoAplcacio("standard_user","secret_sauce");

        Assert.assertTrue(produtsPage.isProditHome(), "La palabra Products no fue encontrada");
    }
}
