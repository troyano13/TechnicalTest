package co.com.automationpractice.certifications.automationpracticeweb.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

import java.util.List;

import org.openqa.selenium.Keys;

import co.com.automationpractice.certifications.automationpracticeweb.model.LoginData;
import co.com.automationpractice.certifications.automationpracticeweb.questions.Respuesta;
import co.com.automationpractice.certifications.automationpracticeweb.task.ToFillFieldsCreateAccount;
import co.com.automationpractice.certifications.automationpracticeweb.task.ToFillFormCreateAccount;
import co.com.automationpractice.certifications.automationpracticeweb.task.ToLogAccount;
import co.com.automationpractice.certifications.automationpracticeweb.util.driver.MyDriver;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class CreateAccount {

	@Before
	public void setUp() {
		OnStage.setTheStage(new OnlineCast());
	}

	@Given("^The user is on Homepage$")
	public void theUserIsOnHomepage() {

		theActorCalled("User");
		theActorInTheSpotlight().can(BrowseTheWeb.with(MyDriver.web().inPage(co.com.automationpractice.certifications.automationpracticeweb.util.constants.Url.QA_ENVIRONMENT)));
		theActorInTheSpotlight().wasAbleTo(co.com.automationpractice.certifications.automationpracticeweb.task.ToLogPage.isAutomationpractice("user"));
	}

	@When("^the user clicks on Sign$")
	public void theUserClicksOnSign() {
		Click.on(co.com.automationpractice.certifications.automationpracticeweb.userinterface.LogPageIU.BTN_SING_IN);
	}

	@When("^user enters email$")
	public void userEntersEmail(List<LoginData> data) {
		ToFillFieldsCreateAccount.forEmail(data);
	}

	@When("^User Clicks create an account$")
	public void userClicksCreateAnAccount() {
		Click.on(co.com.automationpractice.certifications.automationpracticeweb.userinterface.LogPageIU.BTN_CREATE_AN_ACCOUNT);
	}

	@When("^User fills sign up form$")
	public void userFillsSignUpForm(List<LoginData> data) {
		ToFillFormCreateAccount.fromData( data);
	}

	@When("^user clicks register$")
	public void userClicksRegister() {
		Click.on(co.com.automationpractice.certifications.automationpracticeweb.userinterface.FormCreateAccountUI.BTN_REGISTRE);
	}

	@Then("^the user is taken my account page$")
	public void theUserIsTakenMyAccountPage() {
		theActorInTheSpotlight().should(seeThat(Respuesta.is(co.com.automationpractice.certifications.automationpracticeweb.userinterface.MessagesUi.LABEL_CREATED_ACCOUNT), equalTo(co.com.automationpractice.certifications.automationpracticeweb.userinterface.MessagesUi.LABEL_CREATED_ACCOUNT)).orComplainWith(co.com.automationpractice.certifications.automationpracticeweb.exceptions.ExceptionCreateAccount.class)); 
	}


	@Given("^the user has a valid account$")
	public void theUserHasAValidAccount(List<LoginData> data) {
		ToLogAccount.forEmail(data);
	}

	@Then("^the clicks on sign in$")
	public void theClicksOnSignIn() {
		Click.on(co.com.automationpractice.certifications.automationpracticeweb.userinterface.LogPageIU.BTN_CREATE_AN_ACCOUNT);

	}

	@Then("^enters email$")
	public void entersEmail(List<LoginData> data) {
		Enter.theValue(data.get(0).getEmail()).into(co.com.automationpractice.certifications.automationpracticeweb.userinterface.LogAccount.TXT_EMAIL_WITH_ACOUNT ).thenHit(Keys.ENTER);

	}

	@Then("^enters password$")
	public void entersPassword(List<LoginData> data) {
		Enter.theValue(data.get(0).getPassword()).into(co.com.automationpractice.certifications.automationpracticeweb.userinterface.LogAccount.TXT_PASSWORD_WITH_ACOUNT ).thenHit(Keys.ENTER);

	}

	@Then("^clicks sign in$")
	public void clicksSignIn() {
		Click.on(co.com.automationpractice.certifications.automationpracticeweb.userinterface.LogAccount.BTN_SING_IN);

	}

	@Then("^the user is successfully logged in$")
	public void theUserIsSuccessfullyLoggedIn() {
		theActorInTheSpotlight().should(seeThat(Respuesta.is(co.com.automationpractice.certifications.automationpracticeweb.userinterface.MessagesUi.LABEL_CREATED_ACCOUNT), equalTo(co.com.automationpractice.certifications.automationpracticeweb.userinterface.MessagesUi.LABEL_CREATED_ACCOUNT)).orComplainWith(co.com.automationpractice.certifications.automationpracticeweb.exceptions.ExceptionCreateAccount.class)); 

	}



}


