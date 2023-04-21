package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.Scroll;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.EstodoFinancieroPage.LINK_BALANCES;
import static userinterfaces.EstodoFinancieroPage.LINK_PDF;

public class EstadoFinancieroPageInteraction implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {

        //Se dirige a balances
        actor.attemptsTo(Click.on(LINK_BALANCES));

        //Se dirige al PDF
        actor.attemptsTo(Scroll.to(LINK_PDF));
        actor.attemptsTo(Click.on(LINK_PDF));

        //abre el link del pdf
        actor.attemptsTo(Open.relativeUrl("https://www.aerocivil.gov.co/atencion/presupuesto/Estados%20Financieros/Estado%20de%20Situaci%C3%B3n%20Financiera%20a%2030%20de%20abril%20de%202021.pdf"));

    }

    public static EstadoFinancieroPageInteraction estadoFinancieroPageInteraction() {
        return instrumented(EstadoFinancieroPageInteraction.class);
    }

}
