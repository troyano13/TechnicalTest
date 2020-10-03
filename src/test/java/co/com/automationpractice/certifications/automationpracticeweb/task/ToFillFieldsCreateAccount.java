package co.com.automationpractice.certifications.automationpracticeweb.task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.List;

import org.openqa.selenium.Keys;

import co.com.automationpractice.certifications.automationpracticeweb.model.LoginData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;


public class ToFillFieldsCreateAccount implements Task {
	private List<LoginData> datosLogueo;

	public ToFillFieldsCreateAccount( List<LoginData> datosLogueo) {
		this.datosLogueo= datosLogueo;
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Enter.theValue(datosLogueo.get(0).getEmail()).into(co.com.automationpractice.certifications.automationpracticeweb.userinterface.LogPageIU.TXT_EMAIL_ADDRESS_CREATE_ACCOUNT ).thenHit(Keys.ENTER));
	}

	public static ToFillFieldsCreateAccount forEmail( List<LoginData> datos) {
		return instrumented(ToFillFieldsCreateAccount.class,  datos);
	}

	

}
