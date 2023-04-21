package stepsdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;
import questions.ValidationPDfQuestion;
import tasks.FlowTask;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class FinancialSituationStepDefinition {

    @Given("the user enter to web site {string}")
    public void theUserEnterToWebSite(String url) {
        setTheStage(new OnlineCast());
        theActorCalled("Parck").wasAbleTo(Open.url(url));
    }

    @When("He Find the status of your financial situation")
    public void heFindTheStatusOfYourFinancialSituation() {
        theActorInTheSpotlight().attemptsTo(FlowTask.flowTask());
    }

    @Then("Validation the url pdf {string}")
    public void validationTheUrlPdf(String urlexpected) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidationPDfQuestion.value(), Matchers.is(Matchers.equalTo(urlexpected))));
    }


}
