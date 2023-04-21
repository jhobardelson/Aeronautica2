package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class EstodoFinancieroPage {

    public static final Target LINK_BALANCES = Target.the("LINK BALANCES").located(By.xpath("/html/body/form/div[13]/div[1]/div[3]/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/h3/div/div"));

    public static final Target LINK_PDF = Target.the("LINK PDF").located(By.xpath("/html/body/form/div[13]/div[1]/div[3]/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div/div/div/div/div[1]/div/ul/li[1]/div/div/div/a[1]"));

}
