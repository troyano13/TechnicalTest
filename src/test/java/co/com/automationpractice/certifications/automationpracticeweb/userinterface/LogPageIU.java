package co.com.automationpractice.certifications.automationpracticeweb.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class LogPageIU {

	public static final Target BTN_SING_IN = Target
			.the("Button to go to login")
			.locatedBy("//*[@class='login']");
	public static final Target TXT_EMAIL_ADDRESS_CREATE_ACCOUNT= Target
			.the("TXT to write email to create account").locatedBy("//*[@id='email_create']");
	public static final Target BTN_CREATE_AN_ACCOUNT= Target
			.the("Button to create an account").locatedBy("//*[@class='btn btn-default button button-medium exclusive']");
	
	public static final Target TXT_EMAIL_ADDRESS = Target.the("TXT to write email").locatedBy(
			"//*[@id='email']");
	public static final Target TXT_PASSWORD = Target.the("TXT to write password")
			.locatedBy("//*[@id='passwd']");

	private LogPageIU() {

	}
}
