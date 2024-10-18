package part2.saucedemo.demo;

import PageObjectModel.BasePage;
import PageObjectModel.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import static utilities.Utility.UtilityDriver;

public class BaseTest {

  protected    WebDriver driver;
   protected BasePage basepage;
   protected LoginPage loginpage;
   private  String url="https://www.saucedemo.com/";


   @BeforeClass
    public void setUp(){

       driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.get(url);

       basepage=new BasePage();
       basepage.setDriver(driver);    //inicializR la pagina con el driver creado


       loginpage=new LoginPage();

   }

   @AfterClass
    public void tearDown(){
   // driver.quit();
   }
}
