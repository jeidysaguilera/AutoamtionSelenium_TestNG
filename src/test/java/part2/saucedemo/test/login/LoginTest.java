package part2.saucedemo.test.login;

import org.testng.Assert;
import org.testng.annotations.Test;
import part2.saucedemo.demo.BaseTest;

public class LoginTest extends BaseTest {

    @Test
    public void LoginErrorMesage() {
        loginpage.seTUserName("standard_user");
        loginpage.seTPass("xy455");

        loginpage.ClicLogin();

        String actualMensa=loginpage.getErrorMesage();

        Assert.assertTrue(actualMensa.contains("Epic sadface"));

    }
}
