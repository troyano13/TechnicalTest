package co.com.automationpractice.certifications.automationpracticeweb.task;

import co.com.automationpractice.certifications.automationpracticeweb.interactions.WaitInteraction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ToLogPage implements Task {

    private String email;

    public ToLogPage(String email) {
        this.email = email;
    }

    public static ToLogPage isAutomationpractice(String email) {
        return instrumented(ToLogPage.class, email);
    }

    @Step("{0} Loguearse")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(co.com.automationpractice.certifications.automationpracticeweb.userinterface.LogPageIU.BTN_SING_IN, isVisible()), Click.on(co.com.automationpractice.certifications.automationpracticeweb.userinterface.LogPageIU.BTN_SING_IN)
                , WaitInteraction.waitClass(co.com.automationpractice.certifications.automationpracticeweb.util.constants.WaitTime.THREE));
    }
}
