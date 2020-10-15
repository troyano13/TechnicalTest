package co.com.automationpractice.certifications.automationpracticeweb.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/java/co/com/automationpractice/certifications/automationpracticeweb/resources/features/create_account.feature", glue = "co.com.automationpractice.certifications.automationpracticeweb.stepdefinitions",
snippets = SnippetType.CAMELCASE)

public class CreateAccount {

}