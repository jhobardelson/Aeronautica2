package tasks;

import interactions.EstadoFinancieroPageInteraction;
import interactions.HomePageInteraction;
import interactions.PresuspuestoPageInteraction;
import interactions.TransparenciaPageInteraction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FlowTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        //Se dirige a transparencia
        actor.attemptsTo(HomePageInteraction.homePageInteraction());

        //Se dirige a presuspuesto
        actor.attemptsTo(TransparenciaPageInteraction.transparenciaPageInteraction());

        //Se dirige a estados finacieros
        actor.attemptsTo(PresuspuestoPageInteraction.presuspuestoPageInteraction());

        //Se dirige a balances, Se dirige al PDF, abre el link del pdf
        actor.attemptsTo(EstadoFinancieroPageInteraction.estadoFinancieroPageInteraction());

    }

    public static FlowTask flowTask() {
        return instrumented(FlowTask.class);
    }

}
