package co.com.automationpractice.certifications.automationpracticeweb.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class MessagesUi {

	public static final Target LABEL_CREATED_ACCOUNT = Target
			.the("Label created account")
			.locatedBy("//*[@id='center_column']/div/div[2]/ul/li/a/span");
	
	private MessagesUi() {

	}
}
