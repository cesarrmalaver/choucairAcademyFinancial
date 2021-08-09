package co.com.choucair.technicalchallenge.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ErrorPage extends PageObject {

    public static final Target CONFIRM_MESSAGE = Target.the("Error mesagge").
            located(By.xpath("//p[@class='errormessage']"));
}
