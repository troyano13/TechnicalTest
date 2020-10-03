package co.com.automationpractice.certifications.automationpracticeweb.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class Respuesta implements Question<String> {

	private Target mensaje;

	public Respuesta(Target mensaje) {
		this.mensaje = mensaje;
	}

	public static Respuesta is(Target mensaje) {
		return new Respuesta(mensaje);
	}

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(mensaje).viewedBy(actor).asString();
	}
}
