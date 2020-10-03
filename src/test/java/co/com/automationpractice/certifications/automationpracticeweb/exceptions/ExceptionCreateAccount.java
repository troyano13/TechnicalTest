package co.com.automationpractice.certifications.automationpracticeweb.exceptions;

public class ExceptionCreateAccount extends AssertionError {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ExceptionCreateAccount( Throwable cause) {
		super(co.com.automationpractice.certifications.automationpracticeweb.util.constants.ExceptionMessages.ERROR_CREATE_ACCOUNT, cause);
	}
}
