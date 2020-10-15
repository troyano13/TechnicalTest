package co.com.automationpractice.certifications.automationpracticeweb.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class FormCreateAccountUI {

	public static final Target TXT_FIRST_NAME = Target
			.the("TXT to write first name to create account")
			.locatedBy("//*[@id='customer_firstname']");
	public static final Target TXT_LAST_NAME= Target
			.the("TXT to write last name to create account").locatedBy("//*[@id='customer_lastname']");
	public static final Target CLIK_MRS = Target
			.the("Clik direct in Mrs")
			.locatedBy("//*[@id='id_gender2']");
		public static final Target TXT_ADDRESS_CREATE_AN_ACCOUNT= Target
			.the("TXT to write address to create account").locatedBy("//*[@id='address1']");
	public static final Target TXT_ADDRESS_TWO_CREATE_AN_ACCOUNT= Target
			.the("TXT to write address to create account").locatedBy("//*[@id='address2']");
	public static final Target TXT_PASSWORD_CREATE_AN_ACCOUNT = Target.the("TXT to write password to create account")
			.locatedBy("//*[@id='passwd']");
	public static final Target TXT_CITY_CREATE_AN_ACCOUNT = Target.the("TXT to write city to create account")
			.locatedBy("//*[@id='city']");
	public static final Target TXT_COMPANY_CREATE_AN_ACCOUNT = Target.the("TXT to write city to create account")
			.locatedBy("//*[@id='company']");
	public static final Target TXT_POSTAL_CODE_CREATE_AN_ACCOUNT = Target.the("TXT to write postal code")
			.locatedBy("//*[@id='postcode']");
	public static final Target TXT_EMAIL_ADDRESS = Target.the("TXT to write email to create account").locatedBy(
			"//*[@id='email']");
	public static final Target TXT_FIRST_NAME_TWO = Target
			.the("TXT to write first name to create account").locatedBy("//*[@id='firstname']");
	public static final Target TXT_LAST_NAME_TWO= Target
			.the("TXT to write last name to create account").locatedBy("//*[@id='lastname']");
	public static final Target TXT_ADDITIONAL_DESCRIPCION= Target
			.the("TXT to write additional descripcion to create account").locatedBy("//*[@id='other']");
	public static final Target TXT_PHONE= Target
			.the("TXT to write phone to create account").locatedBy("//*[@id='phone']");
	public static final Target TXT_MOBIL= Target
			.the("TXT to write mobil to create account").locatedBy("//*[@id='phone_mobile']");
	public static final Target TXT_ADDRESS_REFERENCE= Target
			.the("TXT to write address references to create account").locatedBy("//*[@id='alias']");
	public static final Target BTN_DAY= Target
			.the("Button of day").locatedBy("//*[@id='days']");
	public static final Target DAY= Target
			.the("Button of day").locatedBy("//*[@id='days']/option[12]");
	public static final Target BTN_MONTH= Target
			.the("Button of month").locatedBy("//*[@name='months']");
	public static final Target MONTH= Target
			.the("Button of month").locatedBy("//*[@id='months']/option[3]");
	public static final Target BTN_YEARS= Target
			.the("Button of years").locatedBy("//*[@id='years']");
	public static final Target YEARS= Target
			.the("Button of years").locatedBy("//*[@id='years']/option[4]");
	public static final Target CLIK_RECEIVE= Target
			.the("Clik receive").locatedBy("//*[@id='optin']");
	public static final Target CLIK_STATE= Target
			.the("Clik state").locatedBy("//*[@id='id_state']");
	public static final Target STATE= Target
			.the("Clik state").locatedBy("//*[@id='id_state']/option[3]");
	public static final Target CLIK_COUNTRY= Target
			.the("Clik country").locatedBy("//*[@id='id_country']");
	public static final Target COUNTRY= Target
			.the("Clik country").locatedBy("//*[@id='uniform-id_country']/span");
	public static final Target BTN_REGISTRE= Target
			.the("btn registre").locatedBy("//*[@id='optin']");


	private FormCreateAccountUI() {

	}
}
