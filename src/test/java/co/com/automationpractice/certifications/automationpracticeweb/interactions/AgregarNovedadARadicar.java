package co.com.automationpractice.certifications.automationpracticeweb.interactions;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

public class AgregarNovedadARadicar implements Interaction {

	private String tipoNovedad;

	public AgregarNovedadARadicar(String tipoNovedad) {
		this.tipoNovedad = tipoNovedad;
	}

	public static AgregarNovedadARadicar deTipo(String tipoNov) {
		return instrumented(AgregarNovedadARadicar.class, tipoNov);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		/*
		 * actor.attemptsTo(WaitUntil.the(BTN_ADICIONAR, isVisible()),
		 * Click.on(BTN_ADICIONAR), WaitUntil.the(BTN_DESPLEGAR_LISTA_1,
		 * isVisible()), Click.on(BTN_DESPLEGAR_LISTA_1),
		 * WaitInteraction.waitClass(UNO), WaitUntil.the(LISTA_DESPELGADA,
		 * isVisible()), SelectListaGeneralTag.desde(LISTA_DESPELGADA,
		 * tipoNovedad), WaitInteraction.waitClass(UNO),
		 * WaitUntil.the(BTN_GUARDAR_ICONO_TIPO_NOVEDAD, isVisible()),
		 * Click.on(BTN_GUARDAR_ICONO_TIPO_NOVEDAD)); }
		 */
	}
}
