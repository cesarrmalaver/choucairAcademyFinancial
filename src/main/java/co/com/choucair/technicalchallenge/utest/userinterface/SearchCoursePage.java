package co.com.choucair.technicalchallenge.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {
    public static final Target CHOUCAIR_UNIVERSITY = Target.the("Link to the universityChoucair").
            located(By.xpath("(//div[@class='card-header'])[1]"));
}
