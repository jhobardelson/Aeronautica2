package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TransparenciaPage {

    public static final Target LINK_PRESUPUESTO = Target.the("LINK PRESUPUESTO").located(By.xpath("//a[@href='/atencion/presupuesto']"));

}
