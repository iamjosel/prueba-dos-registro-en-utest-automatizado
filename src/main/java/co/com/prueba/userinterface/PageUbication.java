package co.com.prueba.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class PageUbication {
    public static final Target CITY = Target.the("City")
            .located(By.id("city"));
    public static final Target CODE_POSTAL = Target.the("Code Postal")
            .located(By.id("zip"));
    public static final Target CONTENEDOR_COUNTRY = Target.the("Contenedor Country")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div"));
    public static final Target COUNTRY = Target.the("Country")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));
    public static final Target DEVICES_BUTTON = Target.the("Device Button")
            .located(By.xpath("//a[@class='btn btn-blue pull-right']"));
}
