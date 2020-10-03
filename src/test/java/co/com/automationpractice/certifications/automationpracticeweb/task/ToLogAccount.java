package co.com.automationpractice.certifications.automationpracticeweb.task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.List;

import org.openqa.selenium.Keys;

import co.com.automationpractice.certifications.automationpracticeweb.model.LoginData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


public class ToLogAccount implements Task {
	private List<LoginData> datosLogueo;

	public ToLogAccount( List<LoginData> datosLogueo) {
		this.datosLogueo= datosLogueo;
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Click.on(co.com.automationpractice.certifications.automationpracticeweb.userinterface.LogAccount.BTN_LOGOUT),
				Enter.theValue(datosLogueo.get(0).getEmail()).into(co.com.automationpractice.certifications.automationpracticeweb.userinterface.LogAccount.TXT_EMAIL_WITH_ACOUNT ).thenHit(Keys.ENTER),
				Enter.theValue(datosLogueo.get(0).getPassword()).into(co.com.automationpractice.certifications.automationpracticeweb.userinterface.LogAccount.TXT_PASSWORD_WITH_ACOUNT ).thenHit(Keys.ENTER),
		        Click.on(co.com.automationpractice.certifications.automationpracticeweb.userinterface.LogAccount.BTN_SING_IN));
		
	}

	public static ToLogAccount forEmail( List<LoginData> datos) {
		return instrumented(ToLogAccount.class,  datos);
	}

	

}
