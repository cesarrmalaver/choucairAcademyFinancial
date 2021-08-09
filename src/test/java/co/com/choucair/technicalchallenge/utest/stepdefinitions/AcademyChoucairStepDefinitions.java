package co.com.choucair.technicalchallenge.utest.stepdefinitions;

import co.com.choucair.technicalchallenge.utest.model.AcademyChoucairData;
import co.com.choucair.technicalchallenge.utest.questions.Answer;
import co.com.choucair.technicalchallenge.utest.tasks.Login;
import co.com.choucair.technicalchallenge.utest.tasks.OpenUp;
import co.com.choucair.technicalchallenge.utest.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class AcademyChoucairStepDefinitions {

    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that Cesar wants to learns automation at the academy Choucair$")
    public void thatCesarWantsToLearnsAutomationAtTheAcademyChoucair(List <AcademyChoucairData> academyChoucairData) {
        OnStage.theActorCalled("Cesar").wasAbleTo(
                OpenUp.thePage(),
                Login.onThePage(academyChoucairData.get(0).getStrUser(),academyChoucairData.get(0).getStrPassword()));
    }

    @When("^he search for the course (.*) on the Choucair academy platform$")
    public void heSearchForTheCourseRecursosAutomatizacionBancolombiaOnTheChoucairAcademyPlatform(String course) {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.theCourse());

    }

    @Then("^he finds the course called resources (.*)$")
    public void heFindsTheCourseCalledResourcesRecursosAutomatizacionBancolombia(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
    }

}
