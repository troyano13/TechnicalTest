package co.com.automationpractice.certifications.automationpracticeweb.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class LogAccount {

	public static final Target BTN_LOGOUT = Target.the("button logoout").locatedBy(
			"//*[@id='header']/div[2]/div/div/nav/div[2]/a");
	public static final Target TXT_EMAIL_WITH_ACOUNT = Target.the("TXT to write email").locatedBy(
			"//*[@id='email']");
	public static final Target TXT_PASSWORD_WITH_ACOUNT= Target.the("TXT to write password")
			.locatedBy("//*[@id='passwd']");
	public static final Target BTN_SING_IN= Target.the("button sing in")
			.locatedBy("//*[@id='SubmitLogin']");

	private LogAccount() {

	}
}
