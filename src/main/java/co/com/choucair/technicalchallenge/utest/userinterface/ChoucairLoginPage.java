package co.com.choucair.technicalchallenge.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairLoginPage extends PageObject {

    public static final Target LOGIN_BUTTON = Target.the("Button that shows us the form to login").
            located(By.xpath("//a[@class=\"btn btn-info btn-sm text-white\"]//strong[contains(text(),'Ingresar')]"));

    public static final Target USERNAME_FIELD = Target.the("Field for the username").
            located(By.id("username"));

    public static final Target PASSWORD_FIELD = Target.the("Field for the password").
            located(By.id("password"));

    public static final Target ENTER_BUTTON = Target.the("Button that submit the data").
            located(By.xpath("//button[contains(@class,'btn btn-primary')]"));



}
