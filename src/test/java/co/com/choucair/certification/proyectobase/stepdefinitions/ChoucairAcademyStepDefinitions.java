package co.com.choucair.certification.proyectobase.stepdefinitions;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.AcademyChoucairData;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import questions.Answer;
import tasks.Login;
import tasks.OpendUp;
import tasks.Search;

import java.util.List;

public class ChoucairAcademyStepDefinitions {

    @Before
    public void setStage(){

        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^than estiven wants to learn automation at the academy Choucair$")
    public void thanEstivenWantsToLearnAutomationAtTheAcademyChoucair(List<AcademyChoucairData> academyChoucairData)  throws  Exception{
 OnStage.theActorCalled("Estiven").wasAbleTo(OpendUp.thePage(),(Login.onThePage(academyChoucairData.get(0).getStrUser(),academyChoucairData.get(0).getStrPassword())));


    }


    @When("^he search for the course (.*) on the choucair academy platform$")
    public void heSearchForTheCourseRecursosAutomatizacionBancolombiaOnTheChoucairAcademyPlatform(List<AcademyChoucairData> academyChoucairData) throws  Exception{
 OnStage.theActorInTheSpotlight().attemptsTo(Search.the(academyChoucairData.get(0).getStrCourse()));
    }

    @Then("^he finds the course called resources (.*)$")
    public void heFindsTheCourseCalledResourcesRecursosAutomatizacionBancolombia( List<AcademyChoucairData> academyChoucairData)throws  Exception {
OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.tothe(academyChoucairData.get(0).getStrCourse())));
    }




}
