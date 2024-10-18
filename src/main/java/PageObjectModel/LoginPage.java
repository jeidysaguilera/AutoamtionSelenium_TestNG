package PageObjectModel;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    private By idname=By.id("user-name");
    private By pass=By.id("password");

    private By login=By.id("login-button");

    private By mesage=By.cssSelector("h3[data-test='error']");




    public void seTUserName(String username){

        setName(idname,username);
    }

    public void seTPass(String passw){

        setName(pass,passw);
    }

    //metodo de transicion
    public ProdutsPage ClicLogin(){
        ClicByElement(login);
        return new ProdutsPage();
    }

    //metodo de convenencia
    public ProdutsPage LoginIntoAplcacio(String user, String pass){

        seTUserName(user);
        seTPass(pass);
        return ClicLogin();
    }

    //metodo getter el q contiene el mensaje d error

    public String getErrorMesage(){
        return Find(mesage).getText();
    }


}
