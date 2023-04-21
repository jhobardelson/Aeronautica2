package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.PresupuestoPage.LINK_ESTADOS_FINANCIEROS;

public class PresuspuestoPageInteraction implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {

        //Se dirige a estados finacieros

       /*BrowseTheWeb.as(actor).getDriver().switchTo().window("https://www.aerocivil.gov.co/atencion/presupuesto");


        String urlwindow = BrowseTheWeb.as(actor).getDriver().getCurrentUrl();*/
        /*BrowseTheWeb.as(actor).getDriver().findElement();*/

        actor.attemptsTo(Open.relativeUrl("https://www.aerocivil.gov.co/atencion/presupuesto"));
        actor.attemptsTo(Click.on(LINK_ESTADOS_FINANCIEROS));

    }

    public static PresuspuestoPageInteraction presuspuestoPageInteraction() {
        return instrumented(PresuspuestoPageInteraction.class);
    }

}
