package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import java.awt.*;
import java.awt.event.KeyEvent;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.TransparenciaPage.LINK_PRESUPUESTO;

public class TransparenciaPageInteraction implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {

        //Se dirige a presuspuesto
        actor.attemptsTo(Scroll.to(LINK_PRESUPUESTO));
        actor.attemptsTo(Click.on(LINK_PRESUPUESTO));

        /*try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_TAB);

        } catch (AWTException e) {
            e.printStackTrace();
        }
        try {
            Robot robot = new Robot();
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_TAB);
        } catch (AWTException e) {
            e.printStackTrace();
        }*/

        //actor.attemptsTo((Performable) BrowseTheWeb.as(actor).getDriver().switchTo().window("https://www.aerocivil.gov.co/atencion/presupuesto"));

        //String newTab = BrowseTheWeb.as(actor).getDriver().switchTo().window("https://www.aerocivil.gov.co/atencion/presupuesto").getWindowHandle();

       /* driver.switchTo().window("https://www.aerocivil.gov.co/atencion/presupuesto");

        String newTab = driver.getWindowHandle();

        System.out.println("New tab: " + newTab);

        driver.switchTo().window(newTab);*/

        //  BrowseTheWeb.as(actor).getDriver().switchTo().window(newTab);

    }

    public static TransparenciaPageInteraction transparenciaPageInteraction() {
        return instrumented(TransparenciaPageInteraction.class);
    }

}
