package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.HomePage.LINK_TRANSPARENCIA;

public class HomePageInteraction implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {

        //Se dirige a transparencia
        actor.attemptsTo(Click.on(LINK_TRANSPARENCIA));

    }

    public static HomePageInteraction homePageInteraction() {
        return instrumented(HomePageInteraction.class);
    }

}
