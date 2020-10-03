package co.com.automationpractice.certifications.automationpracticeweb.task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.List;

import org.openqa.selenium.Keys;

import co.com.automationpractice.certifications.automationpracticeweb.model.LoginData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


public class ToFillFormCreateAccount implements Task {
	private List<LoginData> datosLogueo;

	public ToFillFormCreateAccount( List<LoginData> datosLogueo) {
		this.datosLogueo= datosLogueo;
	}

	public static ToFillFormCreateAccount fromData( List<LoginData> datos) {
		return instrumented(ToFillFormCreateAccount.class,  datos);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Click.on(co.com.automationpractice.certifications.automationpracticeweb.userinterface.FormCreateAccountUI.CLIK_MRS),
				Enter.theValue(co.com.automationpractice.certifications.automationpracticeweb.util.constants.LogueoData.FIRST_NAME).into(co.com.automationpractice.certifications.automationpracticeweb.userinterface.FormCreateAccountUI.TXT_FIRST_NAME ).thenHit(Keys.ENTER),
				Enter.theValue(co.com.automationpractice.certifications.automationpracticeweb.util.constants.LogueoData.LASTA_NAME).into(co.com.automationpractice.certifications.automationpracticeweb.userinterface.FormCreateAccountUI.TXT_LAST_NAME ).thenHit(Keys.ENTER),
				Enter.theValue(datosLogueo.get(0).getEmail()).into(co.com.automationpractice.certifications.automationpracticeweb.userinterface.FormCreateAccountUI.TXT_EMAIL_ADDRESS ).thenHit(Keys.ENTER),
				Enter.theValue(datosLogueo.get(0).getPassword()).into(co.com.automationpractice.certifications.automationpracticeweb.userinterface.FormCreateAccountUI.TXT_PASSWORD_CREATE_AN_ACCOUNT).thenHit(Keys.ENTER),
				Click.on(co.com.automationpractice.certifications.automationpracticeweb.userinterface.FormCreateAccountUI.BTN_DAY),
				Enter.theValue(co.com.automationpractice.certifications.automationpracticeweb.util.constants.LogueoData.TRES).into(co.com.automationpractice.certifications.automationpracticeweb.userinterface.FormCreateAccountUI.BTN_DAY ).thenHit(Keys.ENTER),
				Click.on(co.com.automationpractice.certifications.automationpracticeweb.userinterface.FormCreateAccountUI.BTN_MONTH),
				Enter.theValue(co.com.automationpractice.certifications.automationpracticeweb.util.constants.LogueoData.MARZO).into(co.com.automationpractice.certifications.automationpracticeweb.userinterface.FormCreateAccountUI.BTN_MONTH ).thenHit(Keys.ENTER),
				Click.on(co.com.automationpractice.certifications.automationpracticeweb.userinterface.FormCreateAccountUI.BTN_YEARS),
				Enter.theValue(co.com.automationpractice.certifications.automationpracticeweb.util.constants.LogueoData.AÑO).into(co.com.automationpractice.certifications.automationpracticeweb.userinterface.FormCreateAccountUI.BTN_YEARS ).thenHit(Keys.ENTER),
				Enter.theValue(co.com.automationpractice.certifications.automationpracticeweb.util.constants.LogueoData.AÑO).into(co.com.automationpractice.certifications.automationpracticeweb.userinterface.FormCreateAccountUI.BTN_YEARS ).thenHit(Keys.ENTER),
				Click.on(co.com.automationpractice.certifications.automationpracticeweb.userinterface.FormCreateAccountUI.CLIK_RECEIVE),
				Enter.theValue(co.com.automationpractice.certifications.automationpracticeweb.util.constants.LogueoData.FIRST_NAME).into(co.com.automationpractice.certifications.automationpracticeweb.userinterface.FormCreateAccountUI.TXT_FIRST_NAME_TWO ).thenHit(Keys.ENTER),
				Enter.theValue(co.com.automationpractice.certifications.automationpracticeweb.util.constants.LogueoData.LASTA_NAME).into(co.com.automationpractice.certifications.automationpracticeweb.userinterface.FormCreateAccountUI.TXT_LAST_NAME_TWO ).thenHit(Keys.ENTER),
				Enter.theValue(co.com.automationpractice.certifications.automationpracticeweb.util.constants.LogueoData.COMPANY).into(co.com.automationpractice.certifications.automationpracticeweb.userinterface.FormCreateAccountUI.TXT_COMPANY_CREATE_AN_ACCOUNT ).thenHit(Keys.ENTER),
				Enter.theValue(co.com.automationpractice.certifications.automationpracticeweb.util.constants.LogueoData.ADDRESS_1).into(co.com.automationpractice.certifications.automationpracticeweb.userinterface.FormCreateAccountUI.TXT_ADDRESS_CREATE_AN_ACCOUNT ).thenHit(Keys.ENTER),
				Enter.theValue(co.com.automationpractice.certifications.automationpracticeweb.util.constants.LogueoData.ADDRESS_2).into(co.com.automationpractice.certifications.automationpracticeweb.userinterface.FormCreateAccountUI.TXT_ADDRESS_TWO_CREATE_AN_ACCOUNT).thenHit(Keys.ENTER),
				Enter.theValue(co.com.automationpractice.certifications.automationpracticeweb.util.constants.LogueoData.CITY).into(co.com.automationpractice.certifications.automationpracticeweb.userinterface.FormCreateAccountUI.TXT_CITY_CREATE_AN_ACCOUNT ).thenHit(Keys.ENTER),
				Click.on(co.com.automationpractice.certifications.automationpracticeweb.userinterface.FormCreateAccountUI.CLIK_STATE),
				Enter.theValue(co.com.automationpractice.certifications.automationpracticeweb.util.constants.LogueoData.STATE).into(co.com.automationpractice.certifications.automationpracticeweb.userinterface.FormCreateAccountUI.CLIK_STATE).thenHit(Keys.ENTER),
				Enter.theValue(co.com.automationpractice.certifications.automationpracticeweb.util.constants.LogueoData.POSTAL_CODE).into(co.com.automationpractice.certifications.automationpracticeweb.userinterface.FormCreateAccountUI.TXT_POSTAL_CODE_CREATE_AN_ACCOUNT ).thenHit(Keys.ENTER),
				Click.on(co.com.automationpractice.certifications.automationpracticeweb.userinterface.FormCreateAccountUI.CLIK_COUNTRY),
				Enter.theValue(co.com.automationpractice.certifications.automationpracticeweb.util.constants.LogueoData.COUNTRY).into(co.com.automationpractice.certifications.automationpracticeweb.userinterface.FormCreateAccountUI.CLIK_COUNTRY).thenHit(Keys.ENTER),
				Enter.theValue(co.com.automationpractice.certifications.automationpracticeweb.util.constants.LogueoData.ADDITIONA_INFORMATION).into(co.com.automationpractice.certifications.automationpracticeweb.userinterface.FormCreateAccountUI.TXT_ADDITIONAL_DESCRIPCION ).thenHit(Keys.ENTER),
				Enter.theValue(co.com.automationpractice.certifications.automationpracticeweb.util.constants.LogueoData.PHONE).into(co.com.automationpractice.certifications.automationpracticeweb.userinterface.FormCreateAccountUI.TXT_FIRST_NAME ).thenHit(Keys.ENTER),
				Enter.theValue(co.com.automationpractice.certifications.automationpracticeweb.util.constants.LogueoData.MOBIL).into(co.com.automationpractice.certifications.automationpracticeweb.userinterface.FormCreateAccountUI.TXT_FIRST_NAME ).thenHit(Keys.ENTER),
				Enter.theValue(co.com.automationpractice.certifications.automationpracticeweb.util.constants.LogueoData.ADDRESS_REFERENCE).into(co.com.automationpractice.certifications.automationpracticeweb.userinterface.FormCreateAccountUI.TXT_ADDRESS_REFERENCE ).thenHit(Keys.ENTER)
							
				);
	}

}
